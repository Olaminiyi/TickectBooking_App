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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student(1,"John");
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setName method, of class Student.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String Name = "";
//        Student instance = null;
//        instance.setName(Name);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getId method, of class Student.
//     */
//    @Test
//    public void testGetId() {
//        System.out.println("getId");
//        Student instance = null;
//        int expResult = 0;
//        int result = instance.getId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setId method, of class Student.
//     */
//    @Test
//    public void testSetId() {
//        System.out.println("setId");
//        int Id = 0;
//        Student instance = null;
//        instance.setId(Id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addStudent method, of class Student.
//     */
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        Student instance = null;
//        instance.addStudent();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStudent method, of class Student.
//     */
//    @Test
//    public void testGetStudent() {
//        System.out.println("getStudent");
//        Student instance = null;
//        Student[] expResult = null;
//        Student[] result = instance.getStudent();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}