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
public interface CustomExceptionInterface {
    
   public String getMessage();
   public LoggingEnum getType();
}
