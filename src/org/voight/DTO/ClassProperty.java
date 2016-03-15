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
    protected String property;
    protected String type;
    protected String remarks;
    protected String summary;
    
    public ClassProperty(String propertyString){
        this.property=extractPropertyName(propertyString);
        this.type=extractPropertyType(propertyString);
    }
    
    public void addRemarks(String remarks){
        this.setRemarks(remarks);
    }
    
    public void addSummary(String summary){
        this.setSummary(summary);
    }
    
    public String getComment(){
        return getSummary()+"\n"+getRemarks();
    }
    
    public static String extractPropertyName(String propertyString){
        String objectName=ClassFile.extractObjectName(propertyString);
        System.out.println("Property Name: "+objectName);
        return objectName;
    }
    
    public static String extractPropertyType(String propertyString){
        return "double";
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
     * @return the property
     */
    public String getPropertyName() {
        return property;
    }

    /**
     * @param property the property to set
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
}
