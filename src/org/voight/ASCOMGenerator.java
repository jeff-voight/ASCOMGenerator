/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author jeff
 */
public class ASCOMGenerator {
    private String inputDirectory="./resources";
    private String outputDirectory="../../../output";
    private String[] files;
    
    public static void main(String argv[]){
        ASCOMGenerator ag=new ASCOMGenerator();
    }
    
    public ASCOMGenerator(){
        File f=new File(inputDirectory);
        if(f.exists()){
            System.out.println("File "+inputDirectory+" exists.");
        }
        files=f.list();
        for(int i=0;i<files.length;i++){
            try {
                System.out.println("Reading "+files[i]);
                XMLToJava xj=new XMLToJava(inputDirectory+"/"+files[i], outputDirectory);
                xj.run();
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(ASCOMGenerator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(ASCOMGenerator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ASCOMGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
