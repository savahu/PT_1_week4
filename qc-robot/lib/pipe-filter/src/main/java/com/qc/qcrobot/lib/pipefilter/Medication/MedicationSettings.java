package com.qc.qcrobot.lib.pipefilter.Medication;

/**
 *
 * @author Dominique
 */
public class MedicationSettings 
{
    boolean MedicationGiven = false;
    private static MedicationSettings instance = null;
    private String time; 
    
    
    public static MedicationSettings getInstance()
    {
        if (instance == null) {
            instance = new MedicationSettings();
        }
        return instance;
    }

  
    public void setMedicationTime()
    {
        String datetime = "12:00";
        this.time = datetime;
    }
    
    public String getMedicationTime()
    {
        return this.time;
    }
}