/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class AritmatikaTest {
    
    public AritmatikaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bagi method, of class Aritmatika.
     */
    @Test
    public void testBagi() {
        System.out.println("bagi");
        //int a = 0;
        //int b = 0;
        Aritmatika instance = new Aritmatika();
        //double expResult = 0.0;
        //double result = instance.bagi(a, b);
        assertEquals(5, instance.bagi(10, 2), 0.0);            //artinya 10:2=5
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      @Test(expected = ArithmeticException.class)
    public void testBagiNol() {
        System.out.println("bagi dengan Nol");
        //int a = 0;
        //int b = 0;
        Aritmatika instance = new Aritmatika();
        instance.bagi(10, 0);
        //double expResult = 0.0;
        //double result = instance.bagi(a, b);
        //assertEquals(5, instance.bagi(10, 2), 0.0);            //artinya 10:2=5
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
