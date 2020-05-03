/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niyi
 */
public class ExerciseClassTest {
    
    public ExerciseClassTest() {
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
     * Test of addExerciseClass method, of class ExerciseClass.
     */
    @Test
    public void testAddExerciseClass() {
        System.out.println("addExerciseClass");
        int id = 1;
        String className = "YOGA";
        String shift = "MORNING";
        float price = 150;
        ExerciseClass instance = new ExerciseClass(2,"JUDO","EVENING", 200);
        boolean expResult = true;
        boolean result = instance.addExerciseClass(id, className, shift, price);
        assertEquals(expResult, result);
      
    }

 //

    /**
     * Test of getId method, of class ExerciseClass.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ExerciseClass instance = new ExerciseClass(2,"JUDO","EVENING", 200);
        int expResult = 2;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ExerciseClass.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        //int Id = 2;
        ExerciseClass instance = new ExerciseClass(5,"JUDO","EVENING", 200);
        instance.addExerciseClass(4, "YOGA", "MORNING", 300);
        
        int Id = 2;
        instance.setId(Id);
        int result = instance.getId();
        int expResult = 2;
        assertEquals(expResult, result);
        
        
    }

    @Test
    public void testGetClassName() {
        System.out.println("getClassName");
        ExerciseClass instance = new ExerciseClass(8,"YOGA","MORNING", 150);
        String expResult = "YOGA";
        String result = instance.getClassName();
        assertEquals(expResult, result);
        
    }

//    /**
//     * Test of setClassName method, of class ExerciseClass.
//     */
    @Test
    public void testSetClassName() {
        System.out.println("setClassName");
        String className = "ZUMA";
        ExerciseClass instance = new ExerciseClass(10,"YOGA","MORNING", 150);
        instance.addExerciseClass(4, "JUDO", "MORNING", 300);
        instance.setClassName(className);
        String expResult = "ZUMA";
        String result = instance.getClassName();
        assertEquals(expResult, result);
       
    }

//    /**
//     * Test of getPrice method, of class ExerciseClass.
//     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ExerciseClass instance = new ExerciseClass(10,"JUDO","MORNING", 250);
        //instance.addExerciseClass(2, "ZUMA", "MORNING", 300);
        float expResult = 250;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        
    }

//    /**
//     * Test of setPrice method, of class ExerciseClass.
//     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 200;
        ExerciseClass instance = new ExerciseClass(11,"ZUMA","MORNING", 450);
        instance.setPrice(price);
        float result = instance.getPrice();
        float expResult = 200;
        assertEquals(expResult, result, 0.0);
    }

//    /**
//     * Test of getShift method, of class ExerciseClass.
//     */
    @Test
    public void testGetShift() {
        System.out.println("getShift");
        ExerciseClass instance = new ExerciseClass(11,"ZUMA","EVENING", 450);
        String expResult = "EVENING";
        String result = instance.getShift();
        assertEquals(expResult, result);
       
    }
//test
//    /**
//     * Test of setShift method, of class ExerciseClass.
//     */
    @Test
    public void testSetShift() {
        System.out.println("setShift");
        String shift = "MORNING";
        ExerciseClass instance = new ExerciseClass(11,"YOGA","EVENING", 250);
        instance.setShift(shift);
        String expResult = "MORNING";
        String result = instance.getShift();
        assertEquals(expResult, result);
     
    }

}
