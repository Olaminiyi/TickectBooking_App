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
    private ExerciseClassesTimetable exerciseClassTable;    
    private List<Student> students;
    
    
    
  public StudentExerciseClass(ExerciseClassesTimetable exerciseClassTable, List<Student> students){
  
     setExerciseClassTable(exerciseClassTable);
     setStudents(students);
  }

    /**
     * @return the exerciseClassTable
     */
    public ExerciseClassesTimetable getExerciseClassTable() {
        return exerciseClassTable;
    }

    /**
     * @param exerciseClassTable the exerciseClassTable to set
     */
    public void setExerciseClassTable(ExerciseClassesTimetable exerciseClassTable) {
        this.exerciseClassTable = exerciseClassTable;
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
