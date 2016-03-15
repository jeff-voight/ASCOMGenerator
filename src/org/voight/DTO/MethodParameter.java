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
public final class MethodParameter {
    protected String parameterType;
    protected String parameterName;
    
    public MethodParameter(String parameterType, String parameterName){
        setParameterType(parameterType);
        setParameterName(parameterName);
    }

    /**
     * @return the parameterType
     */
    public String getParameterType() {
        return parameterType;
    }

    /**
     * @param parameterType the parameterType to set
     */
    public void setParameterType(String parameterType) {
        // TO DO: Sanity check parameter type
        this.parameterType = parameterType;
    }

    /**
     * @return the parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * @param parameterName the parameterName to set
     */
    public void setParameterName(String parameterName) {
        // TO DO: Sanity check parameter name
        this.parameterName = parameterName;
    }
}
