/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

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
public class StudentExerciseClassTest {
    
    public StudentExerciseClassTest() {
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
     * Test of getTimeTableId method, of class StudentExerciseClass.
     */
    //int Id, int exerciseId, int timeTableId, int studentId, int rating, String ratingReview
    @Test
    public void testGetTimeTableId() {
        System.out.println("getTimeTableId");
        StudentExerciseClass instance = new StudentExerciseClass(2, 4, 7, 1, 3, "ok");
        int expResult = 7;
        int result = instance.getTimeTableId();
        assertEquals(expResult, result);
      
    }

    
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        StudentExerciseClass instance = new StudentExerciseClass(2, 4, 7, 1, 2, "Dissatisfied");
        int expResult = 2;
        int result = instance.getRating();
        assertEquals(expResult, result);
       
    }


}
