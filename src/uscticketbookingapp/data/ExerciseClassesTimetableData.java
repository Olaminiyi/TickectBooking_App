/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import uscticketbookingapp.enums.ExerciseDay;
import uscticketbookingapp.models.ExerciseClass;
import uscticketbookingapp.models.ExerciseClassesTimetable;
//
/**
 *
 * @author niyi
 */
public class ExerciseClassesTimetableData {
    public static List<ExerciseClassesTimetable> getExerciseClassesTimeTable(){
     List <ExerciseClassesTimetable> exerciseclassesTimetable = new ArrayList<ExerciseClassesTimetable>();
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-04-04 09:00:00",ExerciseDay.SATURDAY, 1, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-04-04 12:00:00",ExerciseDay.SATURDAY, 1, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-04-04 16:00:00",ExerciseDay.SATURDAY, 1, true));
    
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-05-04 09:00:00",ExerciseDay.SUNDAY, 1, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-05-04 12:00:00",ExerciseDay.SUNDAY, 1, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-05-04 16:00:00",ExerciseDay.SUNDAY, 1, true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-11-04 09:00:00",ExerciseDay.SATURDAY, 2, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-11-04 12:00:00",ExerciseDay.SATURDAY, 2, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-11-04 16:00:00",ExerciseDay.SATURDAY, 2, true));
     
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-12-04 09:00:00",ExerciseDay.SUNDAY, 2, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-12-04 12:00:00",ExerciseDay.SUNDAY, 2, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-12-04 16:00:00",ExerciseDay.SUNDAY, 2, true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-19-04 09:00:00",ExerciseDay.SATURDAY, 3, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-19-04 12:00:00",ExerciseDay.SATURDAY, 3, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-19-04 16:00:00",ExerciseDay.SATURDAY, 3, true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-20-04 09:00:00",ExerciseDay.SUNDAY, 4, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-20-04 12:00:00",ExerciseDay.SUNDAY, 4, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-20-04 16:00:00",ExerciseDay.SUNDAY, 4, true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-26-04 09:00:00",ExerciseDay.SATURDAY, 5, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-26-04 12:00:00",ExerciseDay.SATURDAY, 5, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-26-04 16:00:00",ExerciseDay.SATURDAY, 5, true));
     
      
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(0),"2020-27-04 09:00:00",ExerciseDay.SUNDAY, 6, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(1),"2020-27-04 12:00:00",ExerciseDay.SUNDAY, 6, true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(ExerciseClassData.getExerciseClasses().get(2),"2020-27-04 16:00:00",ExerciseDay.SUNDAY, 6, true));
     
     
     return exerciseclassesTimetable;  
    }
}
