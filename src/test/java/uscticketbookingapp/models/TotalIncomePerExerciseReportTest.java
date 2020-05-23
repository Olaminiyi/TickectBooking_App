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
public class TotalIncomePerExerciseReportTest {
    
    public TotalIncomePerExerciseReportTest() {
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
     * Test of getExerciseClass method, of class TotalIncomePerExerciseReport.
     */
    @Test
    public void testGetExerciseClass() {
        System.out.println("getExerciseClass");
        TotalIncomePerExerciseReport instance = new TotalIncomePerExerciseReport("YOGA", 7);
        String expResult = "YOGA";
        String result = instance.getExerciseClass();
        assertEquals(expResult, result);
        
    }

   

    /**
     * Test of getTotalIncome method, of class TotalIncomePerExerciseReport.
     */
    @Test
    public void testGetTotalIncome() {
        System.out.println("getTotalIncome");
        TotalIncomePerExerciseReport instance = new TotalIncomePerExerciseReport("YOGA", 7);
        float expResult = 7;
        float result = instance.getTotalIncome();
        assertEquals(expResult, result, 0.0);
       
    }

//         
//    @Test
//    public void testSetExerciseClass() {
//        System.out.println("setExerciseClass");
//        String exerciseClass = "";
//        TotalIncomePerExerciseReport instance = new TotalIncomePerExerciseReport();
//        instance.setExerciseClass(exerciseClass);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTotalIncome method, of class TotalIncomePerExerciseReport.
//     */
//    @Test
//    public void testSetTotalIncome() {
//        System.out.println("setTotalIncome");
//        float totalIncome = 0.0F;
//        TotalIncomePerExerciseReport instance = new TotalIncomePerExerciseReport();
//        instance.setTotalIncome(totalIncome);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
