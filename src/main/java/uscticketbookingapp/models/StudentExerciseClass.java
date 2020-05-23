/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author niyi
 */
public class StudentExerciseClass {

    /**
     * @return the timeTableId
     */
    public int getTimeTableId() {
        return timeTableId;
    }

    /**
     * @param timeTableId the timeTableId to set
     */
    public void setTimeTableId(int timeTableId) {
        this.timeTableId = timeTableId;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the ratingReview
     */
    public String getRatingReview() {
        return ratingReview;
    }

    /**
     * @param ratingReview 
     */
    public void setRatingReview(String ratingReview) {
        this.ratingReview = ratingReview;
    }
    private int Id;
    private int exerciseId;    
    private int timeTableId;
    private int studentId;
    private int rating;
    private String ratingReview;
    
    public StudentExerciseClass(int Id, int exerciseId, int timeTableId, int studentId, int rating, String ratingReview) {
        
        setExerciseClassId(exerciseId);
        setTimeTableId(timeTableId);
        setStudents(studentId);
        setId(Id);
        setRating(rating);
        setRatingReview(ratingReview);
    }

    /**
     * @return the exerciseClassTableId
     */
    public int getExerciseClassId() {
        return exerciseId;
    }

    /**
     * @param exerciseClassTableId the exerciseClassTableId to set
     */
    public void setExerciseClassId(int exerciseClassId) {
        this.exerciseId = exerciseClassId;
    }

    /**
     * @return the studentIds
     */
    public int getStudents() {
        return studentId;
    }

    /**
     * @param studentIds the studentIds to set
     */
    public void setStudents(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }
    
}
