/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.Date;

/**
 *
 * @author niyi
 */
public class Rating {
    private StudentExerciseClass studentExerciseClass;
    private int rating;
    private String date;
    private String review;

    
    
    
    public Rating(StudentExerciseClass studentExerciseClassBooking,int rating, String date, String review ){
        setStudentdExerciseClass(studentExerciseClassBooking);
        setRating(rating);
        setDate(date);
        setReview(review);
        
    }
    ////
    /**
     * @return the stdExClassBooking
     */
    public StudentExerciseClass getStudentdExerciseClass() {
        return studentExerciseClass;
    }

    /**
     * @param stdExClassBooking the stdExClassBooking to set
     */
    public void setStudentdExerciseClass(StudentExerciseClass studentExerciseClassBooking) {
        this.studentExerciseClass = studentExerciseClassBooking;
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
     * @return the review
     */
    public String getReview() {
        return review;
    }

    /**
     * @param review the review to set
     */
    public void setReview(String review) {
        this.review = review;
    }
}
