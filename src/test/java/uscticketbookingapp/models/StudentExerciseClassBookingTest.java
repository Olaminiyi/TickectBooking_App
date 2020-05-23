/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

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
public class StudentExerciseClassBookingTest {
    
    public StudentExerciseClassBookingTest() {
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
     * Test of getId method, of class StudentExerciseClassBooking.
     */
    //StudentExerciseClassBooking(int Id,int studentId, int exclassId,String date, boolean isPaid,boolean isActive)
    @Test
    public void testGetId() {
        System.out.println("getId");
        StudentExerciseClassBooking instance = new StudentExerciseClassBooking(4,5,7,"2020-07-10", true, true);
        int expResult = 4;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class StudentExerciseClassBooking.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 10;
        StudentExerciseClassBooking instance = new StudentExerciseClassBooking(4,5,7,"2020-07-10", true, true);
        instance.setId(id);
        int expResult = 10;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

   
}
