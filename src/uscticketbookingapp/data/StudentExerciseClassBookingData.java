/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import uscticketbookingapp.models.ExerciseClassesTimetable;
import uscticketbookingapp.models.Student;

import uscticketbookingapp.models.StudentExerciseClassBooking;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassBookingData {
    public static List<StudentExerciseClassBooking> getStudentExerciseClassBooking(){
     
      List <StudentExerciseClassBooking> studentExerciseBookinig = new ArrayList<StudentExerciseClassBooking>();
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(0), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(1), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(2), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(3), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(4), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(5), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(6), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(7), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(8), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        studentExerciseBookinig.add(new StudentExerciseClassBooking( StudentData.getStudents().get(9), ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0),"2020-04-04 09:00:00", true , true));
        return studentExerciseBookinig;
    }
}
