/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight.DTO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeff
 */
public final class ClassMethod {
    private String methodName;
    private String returnType;
    private String parameters;
    protected String remarks;
    protected String summary;
    
    public ClassMethod(String methodName){
        setMethodName(methodName);
        returnType="void";
        parameters="";
    }
    
    public ClassMethod(String methodName, String returnType, String parameters){
        this.setMethodName(methodName);
        setReturnType(returnType);
        addMethodParameters(parameters);
    }
    
    public void setReturnType(String returnType){
        // TO DO: Sanity check return types
        this.returnType=returnType;
    }
    
    public void addMethodParameters(String parameters){
        // TO DO: Sanity check parameters
        parameters=parameters.replaceAll("System.", "");
        this.parameters=parameters;
    }

    private void setMethodName(String methodName) {
        // TO DO: Sanity check method name
        methodName=ClassFile.extractObjectName(methodName);
        this.methodName=methodName;
    }
    
    public String getParameters(){
        return parameters;
    }
    
    public String getReturnType(){
        return returnType;
    }
    
    public String getMethodName(){
        
        return methodName;
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
}
