package com.qc.qcrobot.lib.pipefilter.BloodPressure;

import com.qc.qcrobot.lib.pipefilter.BloodPressureFilter.BloodPressureStorage;
import com.qc.qcrobot.lib.pipefilter.PipeSinkTest;
import org.junit.Test;

/**
 *
 * @author sander
 */
public class BloodPressureTest {
    
    public BloodPressureTest() {
    }
    
    public void AddSampleValues()
    {
        BloodPressureStorage storage = BloodPressureStorage.getInstance();
        PipeSinkTest sink = new PipeSinkTest();
        //BloodPressureFilter filter = new BloodPressureFilter(sink);
        //PipeSourceTest source = new PipeSourceTest("test", filter);
    }
    
    @Test
    public void ShowAverage() {}
}
