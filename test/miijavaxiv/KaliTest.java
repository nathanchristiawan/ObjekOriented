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
public class KaliTest {
    
    public KaliTest() {
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

    @Test
    public void testkalipositif(){
    //public void testSomeMethod() {
        System.out.println("Perkalian Positif");
        Kali instance = new Kali();
        assertEquals(20, instance.kalipositif(5, 4), 0.0); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testkalinegatif(){
    //public void testSomeMethod() {
        System.out.println("Perkalian Negatif");
        Kali instance = new Kali();
        assertEquals(-20, instance.kalipositif(-5, 4), 0.0); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testkalinol(){
    //public void testSomeMethod() {
        System.out.println("Perkalian nol");
        Kali instance = new Kali();
        instance.kalinol(5, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
