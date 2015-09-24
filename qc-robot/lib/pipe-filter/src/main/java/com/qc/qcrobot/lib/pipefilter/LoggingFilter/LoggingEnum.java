/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qc.qcrobot.lib.pipefilter.LoggingFilter;

/**
 *
 * @author Margie
 */
public enum LoggingEnum {
    
	ERROR("E"), WARN("W"), FATAL("F");

	private String loggingCode = "";

	private LoggingEnum(String l) {
		loggingCode = l;
	}

	public String getStatusCode() {
		return loggingCode;
	}
}
