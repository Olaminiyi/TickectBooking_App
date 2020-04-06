/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.List;
import uscticketbookingapp.models.ExerciseClassesTimetable;
import uscticketbookingapp.models.Student;
import uscticketbookingapp.models.StudentExerciseClass;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassData {
    public static List<StudentExerciseClass> getStudentExerciseClassData(){
     List<StudentExerciseClass> studentExerciseClass = new ArrayList<StudentExerciseClass>();
     List<Student> studentsa = new ArrayList<Student>();
     studentsa.add(StudentData.getStudents().get(0));
      studentsa.add(StudentData.getStudents().get(1));
     studentExerciseClass.add(new StudentExerciseClass(ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(0), studentsa));
     List<Student> studentsb = new ArrayList<Student>();
     studentsb.add(StudentData.getStudents().get(3));
      studentsb.add(StudentData.getStudents().get(2));
     studentExerciseClass.add(new StudentExerciseClass(ExerciseClassesTimetableData.getExerciseClassesTimeTable().get(1), studentsb));
     return studentExerciseClass;
    }
}
