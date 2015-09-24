package com.qc.qcrobot.lib.pipefilter.Medication;

import java.util.Date;

/**
 *
 * @author Dominique
 */
public class MedicationSettings 
{
    boolean MedicationGiven = false;
    private static MedicationSettings instance = null;
    private Date time; 
    
    
    public static MedicationSettings getInstance()
    {
        if (instance == null) {
            instance = new MedicationSettings();
        }
        return instance;
    }

  
    public void setMedicationTime(Date medicationTime)
    {
        this.time = medicationTime;
    }
    
    public Date getMedicationTime()
    {
        return this.time;
    }
    
    public Boolean getMedicationStatus()
    {
        return this.MedicationGiven;
    }
}