/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.ArrayList;
import uscticketbookingapp.enums.Shift;

/**
 *
 * @author niyi
 */
public class ExerciseClass {

    /**
     * @return the Id
     */
    
    //String courseName;
    private int Id;
    private String className;
    private float price;
    private String shift;
    private static final int MAX_CLASS_SIZE = 4;
    
    
    public ExerciseClass(int id,String className, String shift,float price){
     //students = new ArrayList<Student>();
     setClassName(className);
     setShift(shift);
     setPrice(price);
     setId(id);
    }
    //
   public void addExerciseClass(){
       
   }
   
   public ExerciseClass[] getExerciseClass(){
     return null;
   }
   
   public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the shift
     */
    public String getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(String shift) {
        this.shift = shift;
    }

    /**
     * @return the MAX_CLASS_SIZE
     */
    public static int getMAX_CLASS_SIZE() {
        return MAX_CLASS_SIZE;
    }
}
