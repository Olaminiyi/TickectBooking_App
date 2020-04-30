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
public class ExerciseStudentCountRatingReport {

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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the totalStudents
     */
    public int getTotalStudents() {
        return totalStudents;
    }

    /**
     * @param totalStudents the totalStudents to set
     */
    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    /**
     * @return the averageRating
     */
    public float getAverageRating() {
        return averageRating;
    }

    /**
     * @param averageRating the averageRating to set
     */
    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }
    private String exerciseClass;
    private String date;
    private int totalStudents;
    private float averageRating;
}
