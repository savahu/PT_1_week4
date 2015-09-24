package com.qc.qcrobot.lib.pipefilter.BloodPressureFilter;

/**
 *
 * @author sander
 */
public class BloodPressure<T> {

    private final int systolicValue, diastolicValue;

    BloodPressure(int systolicValue, int diastolicValue) {
        this.systolicValue = systolicValue;
        this.diastolicValue = diastolicValue;
    }

    public int getSystolicValue() {
        return this.diastolicValue;
    }

    public int getDiastolicValue() {
        return this.diastolicValue;
    }
}
