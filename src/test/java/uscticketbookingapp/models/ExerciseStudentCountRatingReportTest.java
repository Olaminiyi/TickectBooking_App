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
public class ExerciseStudentCountRatingReportTest {
    
    public ExerciseStudentCountRatingReportTest() {
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
    public void testSetExerciseClass() {
        System.out.println("setExerciseClass");
        String exerciseClass = "YOGA";
        ExerciseStudentCountRatingReport instance = new ExerciseStudentCountRatingReport("ZUMA", "2020-05-01", 400, 4);
        instance.setExerciseClass(exerciseClass);
        String expResult = "YOGA";
        String result = instance.getExerciseClass();
        assertEquals(expResult, result);
       
    }
    
        @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "2020-02-01";
        ExerciseStudentCountRatingReport instance = new ExerciseStudentCountRatingReport("ZUMA", "2020-05-01", 400, 4);
        instance.setDate(date);
        String expResult = "2020-02-01";
        String result = instance.getDate();
        assertEquals(expResult, result);
    }
    

    
}
