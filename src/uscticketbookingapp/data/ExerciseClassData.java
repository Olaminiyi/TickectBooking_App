/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.List;
import uscticketbookingapp.enums.Shift;
import uscticketbookingapp.models.ExerciseClass;

/**
 *
 * @author niyi
 */
public class ExerciseClassData {
    public static List<ExerciseClass> getExerciseClasses()
    {
       List<ExerciseClass> exerciseClasses=new ArrayList<ExerciseClass>();
       exerciseClasses.add(new ExerciseClass("YOGA",Shift.MORNING,100));
       exerciseClasses.add(new ExerciseClass("YOGA",Shift.AFTERNOON,100));
       exerciseClasses.add(new ExerciseClass("YOGA",Shift.EVENING,100));
       
       exerciseClasses.add(new ExerciseClass("ZUMBA",Shift.MORNING,150));
       exerciseClasses.add(new ExerciseClass("ZUMBA",Shift.AFTERNOON,150));
       exerciseClasses.add(new ExerciseClass("ZUMBA",Shift.EVENING,150));
       
       exerciseClasses.add(new ExerciseClass("ACQUACISE",Shift.MORNING,200));
       exerciseClasses.add(new ExerciseClass("ACQUACISE",Shift.AFTERNOON,200));
       exerciseClasses.add(new ExerciseClass("ACQUACISE",Shift.EVENING,200));
       
       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.MORNING,250));
       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.AFTERNOON,250));
       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.EVENING,250));
       
       exerciseClasses.add(new ExerciseClass("BODY BLITZ",Shift.MORNING,300));
       exerciseClasses.add(new ExerciseClass("BODY BLITZ",Shift.AFTERNOON,300));
       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.EVENING,300));
       
       exerciseClasses.add(new ExerciseClass("JUDO",Shift.MORNING,350));
       exerciseClasses.add(new ExerciseClass("JUDO",Shift.AFTERNOON,350));
       exerciseClasses.add(new ExerciseClass("JUDO",Shift.EVENING,350));
       
       exerciseClasses.add(new ExerciseClass("WRESTLING",Shift.MORNING,400));
       exerciseClasses.add(new ExerciseClass("WRESTLING",Shift.AFTERNOON,400));
       exerciseClasses.add(new ExerciseClass("WRESTLING",Shift.EVENING,400));
       
       return exerciseClasses;
    }
}
