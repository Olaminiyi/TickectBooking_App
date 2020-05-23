/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

/**
 *
 * @author niyi
 */
import java.util.Date;
import java.util.List;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassBooking {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
//
    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the exclassTimetableId
     */
    public int getExclassId() {
        return exclassId;
    }

    /**
     * @param exclassTimetableId the exclassTimetableId to set
     */
    public void setExclassId(int exclassTimetableId) {
        this.exclassId = exclassTimetableId;
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
    private int id;
    private int studentId;
    private int exclassId;
    private String date;
    private boolean isPaid;
    private boolean isActive;
    
    public StudentExerciseClassBooking(int Id,int studentId, int exclassId,String date, boolean isPaid,boolean isActive){
        setId(Id);
        setStudentId(studentId); 
        setExclassId(exclassId);
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

   
}
