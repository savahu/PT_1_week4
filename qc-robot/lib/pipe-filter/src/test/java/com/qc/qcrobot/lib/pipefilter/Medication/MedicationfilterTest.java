package com.qc.qcrobot.lib.pipefilter.Medication;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Dominique
 */
public class MedicationfilterTest extends Medicationfilter{
     public MedicationfilterTest() {
    }
    @Test
    public void MedicationFilter() 
    {
        Medicationfilter settings = new Medicationfilter();
        System.out.println(settings.timeSettings());
        Assert.assertEquals("test", settings.timeSettings());
    }
    }

