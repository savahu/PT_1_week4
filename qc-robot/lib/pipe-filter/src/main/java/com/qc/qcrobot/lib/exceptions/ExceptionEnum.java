/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qc.qcrobot.lib.exceptions;

/**
 *
 * @author Margie 
 * CLASS KAN WEG???
 */ 
public enum ExceptionEnum {
    
    ERROR("E"), WARN("W"), FATAL("F");
    
    private String exceptionCode = "";

	private ExceptionEnum(String e) {
		exceptionCode = e;
	}

	public String getStatusCode() {
		return exceptionCode;
	}
}
