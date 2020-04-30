/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
       

       exerciseClasses.add(new ExerciseClass(1,"YOGA",Shift.MORNING.toString(),100));
       exerciseClasses.add(new ExerciseClass(2,"YOGA",Shift.AFTERNOON.toString(),100));
       exerciseClasses.add(new ExerciseClass(3,"YOGA",Shift.EVENING.toString(),100));
              
       exerciseClasses.add(new ExerciseClass(4,"ZUMBA",Shift.MORNING.toString(),150));
       exerciseClasses.add(new ExerciseClass(5,"ZUMBA",Shift.AFTERNOON.toString(),150));
       exerciseClasses.add(new ExerciseClass(6,"ZUMBA",Shift.EVENING.toString(),150));
       
         exerciseClasses.add(new ExerciseClass(7,"XYZ",Shift.MORNING.toString(),150));
       exerciseClasses.add(new ExerciseClass(8,"XYZ",Shift.AFTERNOON.toString(),150));
       exerciseClasses.add(new ExerciseClass(9,"XYZ",Shift.EVENING.toString(),150));
       
         exerciseClasses.add(new ExerciseClass(10,"AAA",Shift.MORNING.toString(),150));
       exerciseClasses.add(new ExerciseClass(11,"AAA",Shift.AFTERNOON.toString(),150));
       exerciseClasses.add(new ExerciseClass(12,"AAA",Shift.EVENING.toString(),150));
        
       // 
        
       
      // exerciseClasses.add(new ExerciseClass("YOGA",Shift.MORNING,100));
//       exerciseClasses.add(new ExerciseClass("YOGA",Shift.AFTERNOON,100));
//       exerciseClasses.add(new ExerciseClass("YOGA",Shift.EVENING,100));
       
      // exerciseClasses.add(new ExerciseClass("ZUMBA",Shift.MORNING,150));
//       exerciseClasses.add(new ExerciseClass("ZUMBA",Shift.AFTERNOON,150));
//       exerciseClasses.add(new ExerciseClass("ZUMBA",Shift.EVENING,150));
//       
//       exerciseClasses.add(new ExerciseClass("ACQUACISE",Shift.MORNING,200));
//       exerciseClasses.add(new ExerciseClass("ACQUACISE",Shift.AFTERNOON,200));
//       exerciseClasses.add(new ExerciseClass("ACQUACISE",Shift.EVENING,200));
//       
//       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.MORNING,250));
//       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.AFTERNOON,250));
//       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.EVENING,250));
//       
//       exerciseClasses.add(new ExerciseClass("BODY BLITZ",Shift.MORNING,300));
//       exerciseClasses.add(new ExerciseClass("BODY BLITZ",Shift.AFTERNOON,300));
//       exerciseClasses.add(new ExerciseClass("BOX FIT",Shift.EVENING,300));
//       
//       exerciseClasses.add(new ExerciseClass("JUDO",Shift.MORNING,350));
//       exerciseClasses.add(new ExerciseClass("JUDO",Shift.AFTERNOON,350));
//       exerciseClasses.add(new ExerciseClass("JUDO",Shift.EVENING,350));
//       
//       exerciseClasses.add(new ExerciseClass("WRESTLING",Shift.MORNING,400));
//       exerciseClasses.add(new ExerciseClass("WRESTLING",Shift.AFTERNOON,400));
//       exerciseClasses.add(new ExerciseClass("WRESTLING",Shift.EVENING,400));
       
       return exerciseClasses;
    }
    
    public static ExerciseClass getExerciseClass(int id)
    {
        List<ExerciseClass> data=getExerciseClasses().stream().filter(c->c.getId()==id).collect(Collectors.toList());
        if(data.size()>0)
        {
            return data.get(0);
        }
        return null;
    }
}
