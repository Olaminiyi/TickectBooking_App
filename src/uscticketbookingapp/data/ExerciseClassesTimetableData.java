/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import static uscticketbookingapp.data.ExerciseClassData.getExerciseClasses;
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
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(1, 1, "2020-04-27", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(2, 2, "2020-04-27", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(3, 3, "2020-04-27", "SAT", true));
     
      exerciseclassesTimetable.add(new ExerciseClassesTimetable(4, 1, "2020-04-28", "SUN", true));
        exerciseclassesTimetable.add(new ExerciseClassesTimetable(5, 2, "2020-04-28", "SUN", true));
        exerciseclassesTimetable.add(new ExerciseClassesTimetable(6, 3, "2020-04-28", "SUN", true));
    
     return exerciseclassesTimetable;  
    }
    
       public static ExerciseClassesTimetable getExerciseClassTimeTable(int id)
    {
        List<ExerciseClassesTimetable> data=getExerciseClassesTimeTable().stream().filter(c->c.getId()==id).collect(Collectors.toList());
        if(data.size()>0)
        {
            return data.get(0);
        }
        return null;
    }
}
