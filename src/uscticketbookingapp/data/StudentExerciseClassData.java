/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.List;
import uscticketbookingapp.models.ExerciseClass;
import uscticketbookingapp.models.ExerciseClassesTimetable;
import uscticketbookingapp.models.Student;
import uscticketbookingapp.models.StudentExerciseClass;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassData {

    public static List<StudentExerciseClass> getStudentExerciseClassData() {
        List<StudentExerciseClass> studentExerciseClass = new ArrayList<StudentExerciseClass>();

        //ID,ExerciseId,timeTableId,StudentId,Rating,Review
        //ExerciseTimeTableId signifies an exercise session that many students maximum of 4 can attend
       studentExerciseClass.add(new StudentExerciseClass(1, 1,1, 1, 3, "Good"));
       studentExerciseClass.add(new StudentExerciseClass(2, 1,1, 2, 4,  "Very Good"));
       studentExerciseClass.add(new StudentExerciseClass(3, 1,1, 3, 4,  "Very Good"));
       studentExerciseClass.add(new StudentExerciseClass(4, 1,1, 4, 1,  "VBad"));
       
       
       
          //yoda day1 4-students 12 12/4=3
          
          //
          
          
        
//        studentExerciseClass.add(new StudentExerciseClass(1, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0), StudentData.getStudents().get(0), 2, "great teacher"));
//        studentExerciseClass.add(new StudentExerciseClass(2, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(4), StudentData.getStudents().get(1), 4, "Super interesting"));
//
//        studentExerciseClass.add(new StudentExerciseClass(3, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(1), StudentData.getStudents().get(2), 3, "too intense"));
//        studentExerciseClass.add(new StudentExerciseClass(4, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(6), StudentData.getStudents().get(3), 5, "perfect for me"));
//        
//        
//        studentExerciseClass.add(new StudentExerciseClass(5, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(10), StudentData.getStudents().get(3), 3, "great teacher"));
//        studentExerciseClass.add(new StudentExerciseClass(6, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(10), StudentData.getStudents().get(4), 4, "Super interesting"));
//
//        studentExerciseClass.add(new StudentExerciseClass(7, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(10), StudentData.getStudents().get(5), 1, "too intense"));
//        studentExerciseClass.add(new StudentExerciseClass(8, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(10), StudentData.getStudents().get(6), 5, "perfect for me"));
//
//        
//        
//        studentExerciseClass.add(new StudentExerciseClass(9, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(7), StudentData.getStudents().get(0), 3, "great teacher"));
//        studentExerciseClass.add(new StudentExerciseClass(10, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(4), StudentData.getStudents().get(1), 4, "Super interesting"));
//
//        studentExerciseClass.add(new StudentExerciseClass(11, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(5), StudentData.getStudents().get(2), 2, "too intense"));
//        studentExerciseClass.add(new StudentExerciseClass(12, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(5), StudentData.getStudents().get(3), 5, "perfect for me"));
//        
//        
//        studentExerciseClass.add(new StudentExerciseClass(13, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(6), StudentData.getStudents().get(3), 3, "great teacher"));
//        studentExerciseClass.add(new StudentExerciseClass(14, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(6), StudentData.getStudents().get(4), 4, "Super interesting"));
//
//        studentExerciseClass.add(new StudentExerciseClass(14, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(7), StudentData.getStudents().get(5), 5, "too intense"));
//        studentExerciseClass.add(new StudentExerciseClass(15, ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(8), StudentData.getStudents().get(6), 1, "perfect for me"));
        
        return studentExerciseClass;
    }
}
