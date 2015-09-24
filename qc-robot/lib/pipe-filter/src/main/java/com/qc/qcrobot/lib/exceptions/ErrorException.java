/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qc.qcrobot.lib.exceptions;

import com.qc.qcrobot.lib.pipefilter.LoggingFilter.LoggingEnum;

/**
 *
 * @author Margie
 */
public class ErrorException implements CustomExceptionInterface{
    
    String message = "";
    
    public ErrorException()
    {
        message = "An exception of the type Error had occured. This will be logged and send to the QC Control centre.";
    }
    
    @Override
    public String getMessage()
    {
        return message;
    }
    
    @Override
    public LoggingEnum getType()
    {
        return LoggingEnum.ERROR;
    }
}
