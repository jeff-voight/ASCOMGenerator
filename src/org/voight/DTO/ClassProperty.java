/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight.DTO;

/**
 *
 * @author jeff
 */
public class ClassProperty {
    private String property;
    private String type;
    private String remarks;
    private String summary;
    
    public ClassProperty(String propertyString){
        this.property=extractPropertyName(propertyString);
        this.type=extractPropertyType(propertyString);
    }
    
    public void addRemarks(String remarks){
        this.remarks=remarks;
    }
    
    public void addSummary(String summary){
        this.summary=summary;
    }
    
    public String getComment(){
        return summary+"\n"+remarks;
    }
    
    public static String extractPropertyName(String propertyString){
        String objectName=ClassFile.extractObjectName(propertyString);
        System.out.println("Property Name: "+objectName);
        return objectName;
    }
    
    public static String extractPropertyType(String propertyString){
        return "double";
    }
    
    
}
