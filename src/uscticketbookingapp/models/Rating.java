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
    private StudentExerciseClassBooking studentExerciseClassBooking;
    private int rating;
    private Date date;
    private String review;

    
    
    
    public Rating(StudentExerciseClassBooking studentExerciseClassBooking,int rating, Date date, String review ){
        setStudentdExerciseClassBooking(studentExerciseClassBooking);
        setRating(rating);
        setDate(date);
        setReview(review);
        
    }
    //
    /**
     * @return the stdExClassBooking
     */
    public StudentExerciseClassBooking getStudentdExerciseClassBooking() {
        return studentExerciseClassBooking;
    }

    /**
     * @param stdExClassBooking the stdExClassBooking to set
     */
    public void setStudentdExerciseClassBooking(StudentExerciseClassBooking studentExerciseClassBooking) {
        this.studentExerciseClassBooking = studentExerciseClassBooking;
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
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
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
