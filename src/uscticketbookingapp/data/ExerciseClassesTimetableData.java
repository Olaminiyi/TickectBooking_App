/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import uscticketbookingapp.enums.ExerciseDay;
import uscticketbookingapp.models.ExerciseClass;
import uscticketbookingapp.models.ExerciseClassesTimetable;

/**
 *
 * @author niyi
 */
public class ExerciseClassesTimetableData {
    public static List<ExerciseClassesTimetable> getExerciseClassesTimeTable(){
     List <ExerciseClassesTimetable> exerciseclassesTimetable = new ArrayList<ExerciseClassesTimetable>();
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClass, 01/11/2020,ExerciseDay.SATURDAY, 1, true));
    
     return exerciseclassesTimetable;  
    }
}
