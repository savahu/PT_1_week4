/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qc.qcrobot.lib.pipefilter.LoggingFilter;

import com.qc.qcrobot.lib.exceptions.CustomExceptionInterface;
import com.qc.qcrobot.lib.pipefilter.AbstractPipeFilter;
import com.qc.qcrobot.lib.pipefilter.InterfacePipe;

/**
 *
 * @author Margie
 */
public class LoggingFilter extends AbstractPipeFilter<CustomExceptionInterface, Enum> {
    
    
    public LoggingFilter(InterfacePipe<Enum> output) {
		super(output);
	}

	@Override
	public void filter(CustomExceptionInterface e, InterfacePipe<Enum> output) {
            output.write(e.getType());
	}
    
}
