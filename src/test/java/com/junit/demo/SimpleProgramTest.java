package com.junit.demo;

import static org.junit.Assert.assertEquals;



import org.junit.Before;
import org.junit.Test;

public class SimpleProgramTest {
    SimpleProgram sp;
	@Before
	public void beforeEv() {
		sp=new SimpleProgram();
	}
    @Test
    public void testMax2() {
    	assertEquals(sp.Max(1000, 99),1000);
    }
    @Test
    public void testMax3() {
    	assertEquals(sp.Max(13, 30),30);
    }
    @Test
    public void testMax4() {
    	assertEquals(sp.Max(11, 3),11);
    }
    @Test
    public void testMax1() {
    	assertEquals(sp.Max(10, 30),30);
    }
}
