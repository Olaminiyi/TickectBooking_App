/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import uscticketbookingapp.models.Rating;
import uscticketbookingapp.models.StudentExerciseClassBooking;

/**
 *
 * @author niyi
 */
public class RatingData {
    public static List<Rating> getRating(){
    List<Rating> rating = new ArrayList<Rating>();
     rating.add(new Rating(StudentExerciseClassData.getStudentExerciseClassData().get(0),4, "2020-04-04 09:00:00", "Good"));
//     rating.add(new Rating(StudentExerciseClassBookingData.getStudentExerciseClassBooking().get(1),5, "2020-04-04 09:00:00", "Very Good"));
//     rating.add(new Rating(StudentExerciseClassBookingData.getStudentExerciseClassBooking().get(2),3, "2020-04-04 09:00:00", "ok"));
//     rating.add(new Rating(StudentExerciseClassBookingData.getStudentExerciseClassBooking().get(3),2, "2020-04-04 09:00:00", "fair"));
//     rating.add(new Rating(StudentExerciseClassBookingData.getStudentExerciseClassBooking().get(4),1, "2020-04-04 09:00:00", "poor"));
     return rating;
    }
    
}
