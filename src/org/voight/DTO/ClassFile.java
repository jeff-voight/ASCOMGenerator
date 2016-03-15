/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight.DTO;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author jeff
 */
public class ClassFile {

    private String className;
    private String packageName;
    private List<ClassProperty> properties;
    private List<ClassMethod> methods;

    public static enum classTypes {
        CLASS, INTERFACE, EXCEPTION, METHOD, UNKNOWN
    };
    private classTypes classType;

    protected String summary;
    protected String remarks;

    public ClassFile(String className) {
        this.className = extractObjectName(className);
        classType = getClassType(className);
        packageName = extractPackageName(className);
        properties = new ArrayList();
        methods = new ArrayList();
    }

    public static String extractMethodParameters(String theString){
        int i=theString.indexOf("(");
        if(i==-1){
            return "";
        }
        return theString.substring(i+1, theString.lastIndexOf(")"));
    }
    
    public static String extractPackageClassName(String className) {
        String intermediate = className.substring(2); // Strips the :
        if (intermediate.contains("(#")) { // the # likely comes before the (
            intermediate = intermediate.substring(0, intermediate.indexOf("#"));
        }
        if (intermediate.contains("(")) {
            intermediate = intermediate.substring(0, intermediate.indexOf("("));
        }
        return intermediate;
    }

    public static String extractObjectName(String className) {
        // We need the portion between the : and the last . prior to any parenthesis
        // or #
        String intermediate = extractPackageClassName(className);
        String theName = intermediate.substring(intermediate.lastIndexOf(".") + 1);
        return theName;
    }

    public static String extractPackageName(String className) {
        // We need the portion between the : and the last . prior to any parenthesis
        // or #
        String intermediate = extractPackageClassName(className);
        String packageName = intermediate.substring(0, intermediate.lastIndexOf("."));
        return packageName;
    }

    public static String extractRemarks(NodeList children) {
        int childNum = children.getLength();

        String remarks = "";
        for (int j = 0; j < childNum; j++) {
            Node theChild = children.item(j);
            String childName = theChild.getNodeName();

            if (childName.equals("remarks")) {
                remarks = theChild.getTextContent();
            }
        }
        return remarks;
    }
    
       public static String extractSummary(NodeList children) {
        int childNum = children.getLength();

        String summary = "";
        for (int j = 0; j < childNum; j++) {
            Node theChild = children.item(j);
            String childName = theChild.getNodeName();

            if (childName.equals("summary")) {
                summary = theChild.getTextContent();
            }
        }
        return summary;
    }
    

    public static classTypes getClassType(String className) {
        char classTypeChar = className.charAt(0);
        switch (classTypeChar) {
            case 'M':
                return classTypes.METHOD;
            case 'T':
                return classTypes.CLASS;
            default:
                return classTypes.UNKNOWN;
        }
    }

    public String getClassName() {
        return this.className;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPackageClassName() {
        return getPackageName() + "." + getClassName();
    }

    public void addProperty(ClassProperty prop) {
        properties.add(prop);
    }

    public void addMethod(ClassMethod method) {
        methods.add(method);
    }

    public List<ClassProperty> getProperties() {
        return properties;
    }

    public List<ClassMethod> getMethods() {
        return methods;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
