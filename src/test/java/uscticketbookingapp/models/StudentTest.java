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
//
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
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "Nathan";
        Student instance = new Student(1,"John");
        instance.setName(Name);
        String expResult = "Nathan";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of getId method, of class Student.
//     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance =  new Student(5,"Sade");
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }
//
//    /**
//     * Test of setId method, of class Student.
//     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 3;
        Student instance = new Student(5,"Sade");
        instance.setId(Id);
        int expResult = 3;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of addStudent method, of class Student.
//     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student instance = new Student(5,"Sade");
        boolean result =   instance.addStudent(9,"Tarun");
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    
}
