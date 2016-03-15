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
    private List<MethodParameter> parameters;
    
    public ClassMethod(String methodName){
        setMethodName(methodName);
        returnType="void";
        parameters=new ArrayList();
    }
    
    public ClassMethod(String methodName, String returnType, List<MethodParameter> parameters){
        this(methodName);
        setReturnType(returnType);
        addParameters(parameters);
    }
    
    public void setReturnType(String returnType){
        // TO DO: Sanity check return types
        this.returnType=returnType;
    }
    
    public void addParameters(List<MethodParameter> parameters){
        // TO DO: Sanity check parameters
        this.parameters.addAll(parameters);
    }

    private void setMethodName(String methodName) {
        // TO DO: Sanity check method name
        this.methodName=methodName;
    }
    
    public List<MethodParameter> getParameters(){
        return parameters;
    }
    
    public String getReturnType(){
        return returnType;
    }
    
    public String getMethodName(){
        return methodName;
    }
}
