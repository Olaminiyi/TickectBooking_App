/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

public class ExerciseStudentCountRatingReport {

    ExerciseStudentCountRatingReport(String judo, String string, int i, int i0) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public  ExerciseStudentCountRatingReport(String exerciseClass, String date, int totalStudents, float averageRating) {
        this.exerciseClass = exerciseClass;
        this.date = date;
        this.averageRating = averageRating;
        this.totalStudents = totalStudents;
    }
    
    public  ExerciseStudentCountRatingReport( )
    {
  
    
    }

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
// set
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

