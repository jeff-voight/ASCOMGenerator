/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.voight.DTO.ClassFile;
import org.voight.DTO.ClassMethod;
import org.voight.DTO.ClassProperty;
import org.xml.sax.SAXException;

/**
 *
 * @author jeff
 */
public class XMLToJava {

    DocumentBuilder db;
    String inputFile;
    String outputDir;
    FileOutputStream fout;
    PrintWriter pout;

    public XMLToJava(String inputFile, String outputDir) throws ParserConfigurationException, FileNotFoundException {
        this.inputFile = inputFile;
        this.outputDir = outputDir;
        System.out.println(inputFile);
        String outputFile = inputFile.substring(inputFile.lastIndexOf("/"), inputFile.lastIndexOf(".")) + ".java";
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        db = dbf.newDocumentBuilder();
        //fout=new FileOutputStream(outputDir+"\\"+outputFile);

    }

    public void run() throws SAXException, IOException {
        Document d = db.parse(new File(inputFile));
        NodeList nodes = d.getElementsByTagName("member");
        Map<String, ClassFile> classMap = extractClasses(nodes);
        addParametersToClasses(classMap, nodes);
        addMethodsToClasses(classMap, nodes);
        Set<String> keySet=classMap.keySet();
        Iterator<String> it=keySet.iterator();
        while(it.hasNext()){
            String theKey=it.next();
            ClassFile theClass=classMap.get(theKey);
            makePackage(theClass);
            makeClass(theClass);
        }
//        for (int i = 0; i < numNodes; i++) {
//            Node n = nodes.item(i);
//            List<ClassFile> theClasses=extractClasses(n);
//            //extractComponentsFromNode(n);
        // }

    }

    private void makeClass(ClassFile theClass) throws IOException {
        String thePackage=theClass.getPackageName();
        String theDirectory=thePackage.replaceAll("\\.", "/");
        File f=new File(outputDir+"/"+theDirectory+"/"+theClass.getClassName()+".java");
        FileWriter fw=new FileWriter(f);        
        StringBuilder sb=new StringBuilder();
        sb.append("package "+thePackage+";\n\n");
        sb.append("/*\n"+theClass.getSummary()+"\n\n"+theClass.getRemarks()+"\n*/\n");
        sb.append("public class "+theClass.getClassName()+"{\n\n");
        // Now, make the class properties. We'll do this again to make all the setters
        // and getters after the constructors and methods.
        List<ClassProperty> theProperties=theClass.getProperties();
        Iterator<ClassProperty> it=theProperties.iterator();
        while(it.hasNext()){
            ClassProperty cp=it.next();
            sb.append("/*\n"+cp.getSummary()+"\n"+cp.getRemarks()+"\n*/\n");
            sb.append("private "+cp.getType()+" "+cp.getPropertyName()+";\n");
        }
        List<ClassMethod> theMethods=theClass.getMethods();
        Iterator<ClassMethod> methIt=theMethods.iterator();
        while(methIt.hasNext()){
            ClassMethod method=methIt.next();
            sb.append("\n\n/*\n"+method.getSummary()+"\n"+method.getRemarks()+"\n*/\n");
            String methodName=method.getMethodName();
            if(methodName.equals("#ctor")){
                methodName=theClass.getClassName();
            }
            sb.append("public "+method.getReturnType()+" "+methodName
                    +"("+method.getParameters()+"){\nreturn null;\n}\n");
        }
        // Methods out of the way. Now, back to the properties setters and getters
        it=theProperties.iterator();
        while(it.hasNext()){
            ClassProperty cp=it.next();
            String theProperty=cp.getPropertyName();
            String capProperty=theProperty.substring(0,1).toUpperCase()+theProperty.substring(1);
            sb.append("\n/*\n Sets "+cp.getSummary()+"\n"+cp.getRemarks()+"\n*/\n");
            sb.append("public void set"+capProperty+"("+cp.getType()+" _theValue){\n");
            sb.append("this."+theProperty+"=_theValue;\n}\n");
            
            sb.append("\n/*\n Gets "+cp.getSummary()+"\n"+cp.getRemarks()+"\n*/\n");
            sb.append("public "+cp.getType()+" get"+capProperty+"(){\n");
            sb.append("return "+theProperty+";\n}\n");
        }
        sb.append("}\n");
       fw.write(sb.toString());
       fw.flush();
       fw.close();
        
    }
    
    
    
    private void makePackage(ClassFile theClass) throws IOException{
        String thePackage=theClass.getPackageName();
        String theDirectory=thePackage.replaceAll("\\.", "/");
        File f=new File(outputDir+"/"+theDirectory);
        if(theDirectory.contains(".java")){
            System.out.println("This class package somehow ends with .java. This is a problem.:"+ theClass.getClassName());
        }
        if(!f.exists()){
            System.out.println(f.getCanonicalPath()+" does not exist. Creating.");
            f.mkdirs();
        }
    }
    private void addParametersToClasses(Map<String, ClassFile> classes, NodeList nodes) {
        int numNodes = nodes.getLength();
        for (int i = 0; i < numNodes; i++) {
            Node theNode = nodes.item(i);
            NamedNodeMap attribs = theNode.getAttributes();
            int numAttribs = attribs.getLength();
            for (int j = 0; j < numAttribs; j++) {
                String propertyName = attribs.getNamedItem("name").getNodeValue();
                // We only care about names starting with P:
                if (propertyName.startsWith("P:")) {
                    System.out.println("Property is " + propertyName);
                    String packageClass = ClassFile.extractPackageName(propertyName);
                    System.out.println("Property belongs in class " + packageClass);
                    ClassFile cf = classes.get(packageClass);
                    if (cf == null) {
                        System.out.println("This is bad! " + packageClass + " returned no object!");
                    } else {
                        ClassProperty p = new ClassProperty(propertyName);
                        NodeList children = theNode.getChildNodes();
                        String remarks = ClassFile.extractRemarks(children);
                        p.setRemarks(remarks);
                        String summary = ClassFile.extractSummary(children);
                        p.setSummary(summary);                        
                        System.out.println("Summary: " + summary);
                        System.out.println("Remarks: " + remarks);
                        cf.addProperty(new ClassProperty(propertyName));
                    }
                }
            }
        }
    }

        private void addMethodsToClasses(Map<String, ClassFile> classes, NodeList nodes) {
        int numNodes = nodes.getLength();
        for (int i = 0; i < numNodes; i++) {
            Node theNode = nodes.item(i);
            NamedNodeMap attribs = theNode.getAttributes();
            int numAttribs = attribs.getLength();
            for (int j = 0; j < numAttribs; j++) {
                String propertyName = attribs.getNamedItem("name").getNodeValue();
                // We only care about names starting with P:
                if (propertyName.startsWith("M:")) {
                    System.out.println("Method is " + propertyName);
                    String packageClass = ClassFile.extractPackageName(propertyName);
                    String parameters=ClassFile.extractMethodParameters(propertyName);
                    System.out.println("Method has parameters: "+parameters);
                    System.out.println("Method belongs in class " + packageClass);
                    ClassFile cf = classes.get(packageClass);
                    if (cf == null) {
                        System.out.println("This is bad! " + packageClass + " returned no object!");
                    } else {
                        ClassMethod m = new ClassMethod(propertyName);
                        m.addMethodParameters(parameters);
                        NodeList children = theNode.getChildNodes();
                        String remarks = ClassFile.extractRemarks(children);
                        m.setRemarks(remarks);
                        String summary = ClassFile.extractSummary(children);
                        m.setSummary(summary);                        
                        System.out.println("Summary: " + summary);
                        System.out.println("Remarks: " + remarks);
                        cf.addMethod(m);
                    }
                }
            }
        }
    }

    
    private Map<String, ClassFile> extractClasses(NodeList nodes) {
        Map<String, ClassFile> classes = new HashMap<String, ClassFile>();
        int numNodes = nodes.getLength();
        for (int i = 0; i < numNodes; i++) {
            Node theNode = nodes.item(i);
            NamedNodeMap attribs = theNode.getAttributes();
            int numAttribs = attribs.getLength();
            for (int j = 0; j < numAttribs; j++) {
                String className = attribs.getNamedItem("name").getNodeValue();
                // We only care about names starting with T:
                if (className.startsWith("T:")) {
                    System.out.println("Classname is " + className);
                    ClassFile cf = new ClassFile(className);
                    String packageClassName = cf.getPackageClassName();
                    classes.put(packageClassName, cf);
                    NodeList children = theNode.getChildNodes();
                    String remarks = ClassFile.extractRemarks(children);
                    cf.setRemarks(remarks);
                    String summary = ClassFile.extractSummary(children);
                    cf.setSummary(summary);
                    System.out.println("Remarks: " + remarks);
                    System.out.println("Summary: " + summary);
                }
            }

        }
        return classes;
    }

//    private List<ClassFile> extractComponentsFromNode(Node n) {
//        String nodeType = convertNodeType(n.getNodeType());
//        System.out.println("-->" + nodeType);
//        NamedNodeMap attribs = n.getAttributes();
//        int attribLength = attribs.getLength();
//        System.out.println("This node has " + attribLength + " attributes.");
//        String currentClass = "";
//        for (int j = 0; j < attribLength; j++) {
//            Node nnmNode = attribs.item(j);
//            if (nnmNode == null) {
//                System.out.println("Attrib is null.");
//            } else {
////                    int type = nnmNode.getNodeType();                    
////                    String converted = convertNodeType(type);
////                    System.out.println("This is a " + converted);
//                String name = nnmNode.getNodeName(); // Should be "name"
//                String val = nnmNode.getNodeValue();
//                String thisClass = getClassName(val);
//
//                if (!thisClass.equals(currentClass)) {
//                    if (fout != null) {
//                        System.out.println("}");
//                        //fout.close();
//                    }
//                    currentClass = thisClass;
//                    String fileName = getClassFileName(outputDir, val);
////                    fout = new FileOutputStream(f);
////                    pout = new PrintWriter(fout);
//
//                    pout.println("public class " + thisClass + " {");
//                }
//                if (val.startsWith("M")) {
//                    pout.println("public void " + getEndName(val) + "(){\n}");
//                }
//
//                if (val.startsWith("P")) {
//
//                    pout.println("protected double get" + getEndName(val) + "(){\nreturn 0.0;\n}");
//                    pout.println("public void set" + getEndName(val) + "(double inVal){\nthis.theValue=inVal;\n}");
//                }
//                if (val.startsWith("T")) {
//                    pout.println("No idea what to do here.");
//                }
//                System.out.println("--> " + name + "  -->" + val);
//            }
//        }
//        NodeList children = n.getChildNodes();
//        int childLength = children.getLength();
//        System.out.println("This node has " + childLength + " children.");
//        for (int k = 0; k < childLength; k++) {
//            Node child = children.item(k);
//            System.out.println("Child " + k + " is a " + convertNodeType(child.getNodeType()));
//            System.out.println("N: " + child.getNodeName() + " V:" + child.getNodeValue());
//        }
//        return null; //currentClass;
//    }

//    private String getClassFileName(String outputDir, String className) {
//        // Strip off any end parenthetical 
//        if (className.contains("(")) {
//            className = className.substring(0, className.indexOf("("));
//        }
//
//        //Strip off any end # 
//        if (className.contains("#")) {
//            className = className.substring(0, className.indexOf("#"));
//        }
//
//        // Remove the xml value type
//        String packageClassName = className.substring(2, className.lastIndexOf("."));
//        String packageName = packageClassName;
//        if (packageClassName.contains(".")) {
//            packageName = packageClassName.substring(0, packageClassName.lastIndexOf("."));
//        }
//        String packageDir = packageName.replaceAll("\\.", "/");
//        String dirName = outputDir + "/" + packageDir;
//        System.out.println("Output directory for this object: " + dirName);
//        File f = new File(dirName);
//        if (f.mkdirs()) {
//            System.out.println("Created directory: " + dirName);
//        }
//
//        return dirName + "/" + getClassName(className) + ".java";
//    }

//    private String getClassName(String name) {
//        String thisClass = name.substring(0, name.lastIndexOf("."));
//        thisClass = thisClass.substring(thisClass.lastIndexOf(".") + 1); // Two dots back gets us the classname
//        System.out.println("Classname: " + thisClass);
//        return thisClass;
//    }
//
//    private String getEndName(String name) {
//        String thisName = name.substring(name.lastIndexOf(".") + 1);
//        return thisName;
//    }

//    private String convertNodeType(int type) {
//        switch (type) {
//            case Node.ATTRIBUTE_NODE:
//                return "Attribute Node";
//            case Node.CDATA_SECTION_NODE:
//                return "CData Section Node";
//            case Node.COMMENT_NODE:
//                return "Comment Node";
//            case Node.ELEMENT_NODE:
//                return "Element Node";
//            case Node.ENTITY_NODE:
//                return "Entity Node";
//            case Node.TEXT_NODE:
//                return "Text Node";
//            default:
//                return "Unconverted";
//        }
//    }

}
