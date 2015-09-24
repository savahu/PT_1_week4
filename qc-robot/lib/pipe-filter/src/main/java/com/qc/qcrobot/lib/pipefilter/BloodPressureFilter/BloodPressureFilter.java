package com.qc.qcrobot.lib.pipefilter.BloodPressureFilter;

import com.qc.qcrobot.lib.pipefilter.AbstractPipeFilter;
import com.qc.qcrobot.lib.pipefilter.InterfacePipe;

/**
 *
 * @author sander
 */
public class BloodPressureFilter extends AbstractPipeFilter<BloodPressureLevel, Enum> {

	public BloodPressureFilter(InterfacePipe<Enum> output) {
		super(output);
	}

	@Override
	public void filter(BloodPressureLevel input, InterfacePipe<Enum> output) {
                if(input.getDiastolicValue() <= 80 && input.getSystolicValue() <= 120) // Blood pressure is 120/80 or below
                {
                    output.write(BloodPressureEnum.Healthy);
                }
                else if (input.getDiastolicValue() <= 89 && input.getSystolicValue() <= 139)
                        {
                            output.write(BloodPressureEnum.Prehypertension);
                        }
                else if (input.getDiastolicValue() <= 99 && input.getSystolicValue() <= 159)
                {
                    output.write(BloodPressureEnum.HypertensionStage1);
                }
                else if (input.getDiastolicValue() <= 110 && input.getSystolicValue() <= 180)
                {
                    output.write(BloodPressureEnum.HypertensionStage2);
                }
                else
                {
                    output.write(BloodPressureEnum.HypertensiveCrisis);
                }
	}
}
