/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.ArrayList;
import java.util.List;
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
public class ExerciseClassesTimetableTest {
    
    public ExerciseClassesTimetableTest() {
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
     * Test of addExerciseClass method, of class ExerciseClassesTimetable.
     */
    @Test
    public void testAddExerciseClass() {
        System.out.println("addExerciseClass");
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(1, 2,"2020-02-01","SUNDAY",true);
       // ArrayList <ExerciseClassesTimetable> exerciseClassesTimetable = new  ArrayList <ExerciseClassesTimetable>();
       boolean result = instance.addExerciseClass();
       boolean expResult = true;
       assertEquals(expResult, result);
       
    }

   

//    /**
//     * Test of getExerciseClassId method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testGetExerciseClassId() {
        System.out.println("getExerciseClassId");
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(2, 4,"2020-02-01","SUNDAY",true);
        int expResult = 4;
        int result = instance.getExerciseClassId();
        assertEquals(expResult, result);
      
    }

//    /**
//     * Test of setExerciseClassId method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testSetExerciseClassId() {
        System.out.println("setExerciseClassId");
        int exerciseClassId = 5;
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(2, 4,"2020-02-01","SUNDAY",true);
        instance.setExerciseClassId(exerciseClassId);
        int expResult = 5;
        int result = instance.setExerciseClassId(exerciseClassId);
        assertEquals(expResult, result);
    }
//    /**
//     * Test of getDate method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(2, 4,"2020-02-01","SATURDAY",true);
        String expResult = "2020-02-01";
        String result = instance.getDate();
        assertEquals(expResult, result);
        
    }

//    /**
//     * Test of setDate method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "2020-07-05";
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(2, 4,"2020-02-01","SATURDAY",true);
        instance.setDate(date);
        String expResult = "2020-07-05";
        String result = instance.getDate();
        assertEquals(expResult, result); assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of getId method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(7, 4,"2020-02-01","SATURDAY",true);
        int expResult = 7;
        int result = instance.getId();
        assertEquals(expResult, result);
       
    }
//
//    /**
//     * Test of setId method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 9;
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(5, 4,"2020-02-01","SATURDAY",true);
        instance.setId(id);
         int expResult = 9;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

//    /**
//     * Test of isIsSlotAvailable method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testIsIsSlotAvailable() {
        System.out.println("isIsSlotAvailable");
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(5, 4,"2020-02-01","SUNDAY",true);
        boolean expResult = true;
        boolean result = instance.isIsSlotAvailable();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of setIsSlotAvailable method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testSetIsSlotAvailable() {
        System.out.println("setIsSlotAvailable");
        boolean isSlotAvailable = false;
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(5, 7,"2020-09-01","SUNDAY",true);
        instance.setIsSlotAvailable(isSlotAvailable);
        boolean expResult = false;
        boolean result = instance.isIsSlotAvailable();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getExerciseDay method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testGetExerciseDay() {
        System.out.println("getExerciseDay");
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(10, 7,"2020-09-01","SUNDAY",true);
        String expResult = "SUNDAY";
        String result = instance.getExerciseDay();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of setExerciseDay method, of class ExerciseClassesTimetable.
//     */
    @Test
    public void testSetExerciseDay() {
        System.out.println("setExerciseDay");
        String exerciseDay = "SATURDAY";
        ExerciseClassesTimetable instance = new ExerciseClassesTimetable(10, 7,"2020-09-01","SUNDAY",true);
        instance.setExerciseDay(exerciseDay);
         String expResult = "SATURDAY";
        String result = instance.getExerciseDay();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of getExerciseClasses method, of class ExerciseClassesTimetable.
//     */
//    @Test
//    public void testGetExerciseClasses() {
//        System.out.println("getExerciseClasses");
//        List<ExerciseClassesTimetable> expResult = null;
//        List<ExerciseClassesTimetable> result = ExerciseClassesTimetable.getExerciseClasses();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setExerciseClasses method, of class ExerciseClassesTimetable.
//     */
//    @Test
//    public void testSetExerciseClasses() {
//        System.out.println("setExerciseClasses");
//        List<ExerciseClassesTimetable> aExerciseClasses = null;
//        ExerciseClassesTimetable.setExerciseClasses(aExerciseClasses);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
