/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import uscticketbookingapp.enums.ExerciseDay;

/**
 *
 * @author niyi
 */
public class ExerciseClassesTimetable {
    private ExerciseClass exerciseClass;
    private Date date;
    private ExerciseDay exerciseDay;
    private int id;
    private boolean isSlotAvailable=true;
    
    private static List<ExerciseClassesTimetable> exerciseClasses=new ArrayList<ExerciseClassesTimetable>();
    
    public ExerciseClassesTimetable(ExerciseClass exerciseClass,Date date,ExerciseDay exerciseDay, int id,boolean isSlotAvailable){
        setExerciseClass(exerciseClass);
        setDate(date);
        setExerciseDay(exerciseDay);
        setId(id);
        setIsSlotAvailable(isSlotAvailable);
    //    setExerciseClasses(exerciseClasses);
    }
    
    public void addExerciseClass(){
        getExerciseClasses().add(this);
    }
    
     public void checkExerciseClassAvailabilityByName(String queryText){
        //quesryText is exerciseName or date
    }
     
      public void checkExerciseClassAvailabilityByDate(String queryText){
        //quesryText is exerciseName or date
    }
     
     public List<ExerciseClassesTimetable> getAvailableExerciseClasses(){
         return getExerciseClasses();
     }

    /**
     * @return the ex
     */
    public ExerciseClass getExerciseClass() {
        return exerciseClass;
    }

    /**
     * @param ex the ex to set
     */
    public void setExerciseClass(ExerciseClass exerciseClass) {
        this.exerciseClass = exerciseClass;
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

    /**
     * @return the isSlotAvailable
     */
    public boolean isIsSlotAvailable() {
        return isSlotAvailable;
    }

    /**
     * @param isSlotAvailable the isSlotAvailable to set
     */
    public void setIsSlotAvailable(boolean isSlotAvailable) {
        this.isSlotAvailable = isSlotAvailable;
    }

    /**
     * @return the exerciseDay
     */
    public ExerciseDay getExerciseDay() {
        return exerciseDay;
    }

    /**
     * @param exerciseDay the exerciseDay to set
     */
    public void setExerciseDay(ExerciseDay exerciseDay) {
        this.exerciseDay = exerciseDay;
    }

    /**
     * @return the exerciseClasses
     */
    public static List<ExerciseClassesTimetable> getExerciseClasses() {
        return exerciseClasses;
    }

    /**
     * @param aExerciseClasses the exerciseClasses to set
     */
    public static void setExerciseClasses(List<ExerciseClassesTimetable> aExerciseClasses) {
        exerciseClasses = aExerciseClasses;
    }
}
