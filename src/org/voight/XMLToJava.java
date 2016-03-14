/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.SAXException;

/**
 *
 * @author jeff
 */
public class XMLToJava {
    DocumentBuilder db;
    String inputFile;
    String outputDir;
    
    public XMLToJava(String inputFile, String outputDir) throws ParserConfigurationException{
        this.inputFile=inputFile;
        this.outputDir=outputDir;
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        db=dbf.newDocumentBuilder();
        
    }
    
    public void run() throws SAXException, IOException{
        Document d=db.parse(new File(inputFile));
    }
    
}
