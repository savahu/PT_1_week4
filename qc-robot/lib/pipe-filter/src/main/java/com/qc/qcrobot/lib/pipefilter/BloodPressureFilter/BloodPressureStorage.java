package com.qc.qcrobot.lib.pipefilter.BloodPressureFilter;

import java.util.ArrayList;

/**
 *
 * @author sander
 */
public class BloodPressureStorage {

    private ArrayList<Integer> SystolicValues;
    private ArrayList<Integer> DiastolicValues;

    private static BloodPressureStorage instance = null;

    private BloodPressureStorage() {
    }

    public static BloodPressureStorage getInstance() {
        if (instance == null) {
            instance = new BloodPressureStorage();
        }
        return instance;
    }

    public void StoreBloodPressureLevel(BloodPressure level) {
        SystolicValues.add(level.getSystolicValue());
        SystolicValues.add(level.getDiastolicValue());
    }

    public BloodPressure GetAverageBloodPressureLevel() {
        int sumSystolic = SystolicValues.stream().mapToInt(value -> value).sum();
        int avgSystolic = (sumSystolic / SystolicValues.size());
        int sumDiastolic = DiastolicValues.stream().mapToInt(value -> value).sum();
        int avgDiastolic = (sumDiastolic / DiastolicValues.size());
        BloodPressure AverageBloodPressureLevel = new BloodPressure(avgSystolic, avgDiastolic);
        return AverageBloodPressureLevel;
    }

    public void ClearValues() {
        SystolicValues.clear();
        DiastolicValues.clear();
    }

}
