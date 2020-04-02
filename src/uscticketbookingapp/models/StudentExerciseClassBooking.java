/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassBooking {
    private Student student;
    private ExerciseClassesTimetable exclassTimetable;
    private Date date;
    private boolean isPaid;
    private boolean isActive;
    
    
    
    public StudentExerciseClassBooking(Student student, ExerciseClassesTimetable exclassTimetable,Date date, boolean isPaid,boolean isActive){
        setStudent(student); 
        setExclassTimetable(exclassTimetable);
        setDate(date);
        setIsPaid(isPaid);
        setIsActive(isActive);
    }
    
    public void addStudentExerciseClassBooking(){
    
    }
    
    public List<StudentExerciseClassBooking[]> getStudentExerciseClassBooking(){
    return null;
    }
    public StudentExerciseClassBooking updateStudentExerciseClassBooking(StudentExerciseClassBooking stdExbooking){
        return stdExbooking;
    }
    public void deleteStudentExerciseClassBooking(StudentExerciseClassBooking stdExbooking){
    
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }
//
    /**
     * @return the exclassTimetable
     */
    public ExerciseClassesTimetable getExclassTimetable() {
        return exclassTimetable;
    }

    /**
     * @param exclassTimetable the exclassTimetable to set
     */
    public void setExclassTimetable(ExerciseClassesTimetable exclassTimetable) {
        this.exclassTimetable = exclassTimetable;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }
//
    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the isPaid
     */
    public boolean isIsPaid() {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
