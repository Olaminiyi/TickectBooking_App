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
    private int exerciseClassId;
    private String date;
    private String exerciseDay; //SAT,SUN
    private int id;
    private boolean isSlotAvailable=true;
    
    private static List<ExerciseClassesTimetable> exerciseClasses=new ArrayList<ExerciseClassesTimetable>();
    
    public ExerciseClassesTimetable(int id,int exerciseClassId,String date,String exerciseDay,boolean isSlotAvailable){
        setExerciseClassId(exerciseClassId);
        setDate(date);
        setExerciseDay(exerciseDay);
        setId(id);
        setIsSlotAvailable(isSlotAvailable);
    //    setExerciseClasses(exerciseClasses);
    }
    
    public int Size(ArrayList <ExerciseClassesTimetable> exerciseClassesTimetable){
    
        return exerciseClassesTimetable.size();
        
    }
    
    public boolean addExerciseClass(){
        getExerciseClasses().add(this);
        return true;
    }
    
    
     public List<ExerciseClassesTimetable> getAvailableExerciseClasses(){
         return getExerciseClasses();
     }

    /**
     * @return the ex
     */
    public int getExerciseClassId() {
        return exerciseClassId;
    }

    /**
     * @param ex the ex to set
     */
    public int setExerciseClassId(int exerciseClassId) {
        this.exerciseClassId = exerciseClassId;
        return exerciseClassId;
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
    public String getExerciseDay() {
        return exerciseDay;
    }

    /**
     * @param exerciseDay the exerciseDay to set
     */
    public void setExerciseDay(String exerciseDay) {
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

