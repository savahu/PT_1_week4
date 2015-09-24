package com.qc.qcrobot.lib.pipefilter.Medication;

import com.qc.qcrobot.lib.pipefilter.AbstractPipeFilter;
import com.qc.qcrobot.lib.pipefilter.InterfacePipe;
import java.sql.Timestamp;
import java.util.Date;
import org.apache.commons.lang.time.DateUtils;

/**
 *
 * @author Dominique
 */
public class Medicationfilter  extends AbstractPipeFilter<Date, Boolean>{
    
    public Medicationfilter(InterfacePipe<Boolean> output)
    {
        super(output);
    }

    @Override
    protected void filter(Date input, InterfacePipe<Boolean> output) {
        Date deadline = DateUtils.addHours(input, 2);
         java.util.Date date = new java.util.Date();
        java.util.Date datetime = new Timestamp(date.getTime());
        if(datetime.after(deadline))
                {
                    output.write(true);
                }
        else
        {
            output.write(false);
        }
    }
}
