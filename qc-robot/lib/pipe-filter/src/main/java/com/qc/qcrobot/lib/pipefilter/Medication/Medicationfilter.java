package com.qc.qcrobot.lib.pipefilter.Medication;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Dominique
 */
public class Medicationfilter {
    
    public Medicationfilter()
    {
        
    }
    
    public String timeSettings()
    {
        java.util.Date date= new java.util.Date();
        java.util.Date datetime = new Timestamp(date.getTime());
        String time = datetime.toString().substring(datetime.toString().length() - 12);
        return time;
    }
    
    
}
