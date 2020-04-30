/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

/**
 *
 * @author sterlingpro
 */
public class TotalIncomePerExerciseReport {

    /**
     * @return the exerciseClass
     */
    public String getExerciseClass() {
        return exerciseClass;
    }

    /**
     * @param exerciseClass the exerciseClass to set
     */
    public void setExerciseClass(String exerciseClass) {
        this.exerciseClass = exerciseClass;
    }

  

    /**
     * @return the totalIncome
     */
    public float getTotalIncome() {
        return totalIncome;
    }

    /**
     * @param totalIncome the totalIncome to set
     */
    public void setTotalIncome(float totalIncome) {
        this.totalIncome = totalIncome;
    }
    private String exerciseClass;
    //private int totalStudents;
    private float totalIncome;
}
