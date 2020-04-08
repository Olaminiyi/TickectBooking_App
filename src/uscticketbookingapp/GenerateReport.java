/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp;
//

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uscticketbookingapp.data.StudentExerciseClassBookingData;
import uscticketbookingapp.data.StudentExerciseClassData;
import uscticketbookingapp.models.Student;
import uscticketbookingapp.models.StudentExerciseClass;
import uscticketbookingapp.models.StudentExerciseClassBooking;

/**
 *
 * @author niyi
 */
public class GenerateReport {

    public void GenerateStudentsPerClassWithRating() {
        try {
            //exercise class, nuumber of students, rating, date
            //get unique dates
            List<StudentExerciseClass> exerciseClasses = StudentExerciseClassData.getStudentExerciseClassData();
            HashMap<String, List<Student>> mapdateStudentExercise = new HashMap<String, List<Student>>();
            final List<String> dates = new ArrayList<String>();
            for (int i = 0; i < exerciseClasses.size(); i++) {
                String exerciseClassName = exerciseClasses.get(i).getExerciseClassTable().getExerciseClass().getClassName();
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(exerciseClasses.get(i).getExerciseClassTable().getDate());
                String dateonly = new SimpleDateFormat("yyyy-MM-dd").format(date);
                if (!dates.contains(dateonly)) {
                    dates.add(dateonly);
                }
            }
            
            

            for (int d = 0; d < dates.size(); d++) {
                List<Student> studentsOnDate = new ArrayList<>();
                exerciseClasses.forEach(item -> {
                    try {
                        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(item.getExerciseClassTable().getDate());
                         String dateonly = new SimpleDateFormat("yyyy-MM-dd").format(date);
                        if(!dateonly.equals(dates.get(d)))
                        {
                            
                        } else {
                        }   } catch (ParseException ex) {
                        Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                for (int i = 0; i < exerciseClasses.size(); i++) {

                    String exerciseClassName = exerciseClasses.get(i).getExerciseClassTable().getExerciseClass().getClassName();
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(exerciseClasses.get(i).getExerciseClassTable().getDate());
                    String dateonly = new SimpleDateFormat("yyyy-MM-dd").format(date);
                    // dateStudentExercise.put(dateonly, value);

                    if (dateonly.equals(dates.get(d))) {
                        studentsOnDate.addAll(exerciseClasses.get(i).getStudents());
                    }
                    // dateStudents. date.getDate();
                    System.out.println(dateonly);
                }
                mapdateStudentExercise.put(dates.get(d), studentsOnDate);
            }

        } catch (ParseException ex) {
            Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
