package com.qc.qcrobot.lib.pipefilter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PipeTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PipeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PipeTest.class );
    }
    
    
    public void testPipeline() throws Exception {
    	PipeSourceTest source = new PipeSourceTest("ppp");
    	PipeFilterTest filter = new PipeFilterTest();
    	PipeSinkTest sink = new PipeSinkTest();
    	
    	source.connect(filter).connect(sink);
    	
    	source.start();
    	
    	assertTrue(sink.outputVar.equals("ccc"));
    }

    /**
     * 
     */
    public void testSinkAsFilterException()
    {
    	PipeSinkTest sink = new PipeSinkTest();
    	
    	try {
    		sink.connect(sink);
    		fail("Expected Exception! Sinks should have no more connections.");
    	} catch (Exception e) {}
    }
    
}
