/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

/**
 *
 * @author niyi
 */
import java.util.ArrayList;
import java.util.List;
import uscticketbookingapp.models.ExerciseClass;
import uscticketbookingapp.models.ExerciseClassesTimetable;
import uscticketbookingapp.models.Student;
import uscticketbookingapp.models.StudentExerciseClass;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassData {

    public static List<StudentExerciseClass> getStudentExerciseClassData() {
        List<StudentExerciseClass> studentExerciseClass = new ArrayList<StudentExerciseClass>();

        //ID,ExerciseId,timeTableId,StudentId,Rating,Review
        //ExerciseTimeTableId signifies an exercise session that many students maximum of 4 can attend
         //YOGA(1-3),ZUMBA(4-6),ACQUA(7-9),BOX FIT(10-12), JUDO(13-15), WEIGHT(16-18)--- EXERCICE CLASSES ID
       //yoga student 1 saturday
       studentExerciseClass.add(new StudentExerciseClass(1, 1,1, 1, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(2, 2,2, 1, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(4, 3,3, 1, 4,  "Satisfied"));
       //yoga student 1 sunday
       studentExerciseClass.add(new StudentExerciseClass(5, 1, 4, 1, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(6, 2, 5, 1, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(7, 3, 6, 1, 4,  "Satisfied"));
      //==================================================================================== 
       //zuma student 2 saturday
       studentExerciseClass.add(new StudentExerciseClass(8, 4, 44, 2, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(9, 5, 45, 2, 1,  "Very Dissatified"));
       studentExerciseClass.add(new StudentExerciseClass(10, 6, 46, 2, 1,  "Very Dissatified"));
       
       //zuma  student 2 sunday
       studentExerciseClass.add(new StudentExerciseClass(11, 4, 47, 2, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(12, 5, 48, 2, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(13, 6, 49, 2, 4,  "Satisfied"));
       //======================================================================================
       //acqua student 3 saturday
       studentExerciseClass.add(new StudentExerciseClass(14, 7, 86, 3, 5, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(15, 8, 87, 3, 5,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(16, 9, 88, 3, 5,  "Satisfied"));
       //acqua student 3 sunday
       studentExerciseClass.add(new StudentExerciseClass(17, 7, 89, 3, 5,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(18, 8, 90, 3, 1,  "Very Dissatified"));
        studentExerciseClass.add(new StudentExerciseClass(19, 9, 91, 3, 1,  "Very Dissatified"));
      //===============================================================================================
       
       
       //YOGA(1-3),ZUMBA(4-6),ACQUA(7-9),BOX FIT(10-12), JUDO(13-15), WEIGHT(16-18)--- EXERCICE CLASSES ID
       
       //box-fit student 4 saturday
       studentExerciseClass.add(new StudentExerciseClass(20, 10, 132, 4, 4, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(21, 11, 133, 4, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(22, 12, 133, 4, 4,  "Satisfied"));
       //box-fit student 4  sunday
       studentExerciseClass.add(new StudentExerciseClass(23, 10, 134, 4, 5, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(24, 11, 135, 4, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(25, 12, 136, 4, 4,  "Satisfied"));
    //==================================================================================================   
       //yoga student 5 saturday
       studentExerciseClass.add(new StudentExerciseClass(26, 1, 147, 5, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(27, 2, 148, 5, 1,  "Very Dissatified"));
        studentExerciseClass.add(new StudentExerciseClass(28, 3, 149, 5, 1,  "Very Dissatified"));
       
       //yoga student 5 sunday
       studentExerciseClass.add(new StudentExerciseClass(29, 1, 150, 5, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(30, 2, 151, 5, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(31, 3, 152, 5, 4,  "Satisfied"));
       
  //  =====================================================================================================================    
  //YOGA(1-3),ZUMBA(4-6),ACQUA(7-9),BOX FIT(10-12), JUDO(13-15), WEIGHT(16-18)--- EXERCICE CLASSES ID  
       //zuma student 6 saturday
       studentExerciseClass.add(new StudentExerciseClass(32, 4, 190, 6, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(33, 5, 191, 6, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(34, 6, 192, 6, 4,  "Satisfied"));
       //zuma student 6 sunday
       studentExerciseClass.add(new StudentExerciseClass(35, 4, 193, 6, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(36, 5, 194, 6, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(37, 6, 195, 6, 4,  "Satisfied"));
     //=====================================================================================================
       //acqua student 7 saturday
       studentExerciseClass.add(new StudentExerciseClass(38, 7, 232, 7, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(39, 8, 233, 7, 1,  "Very Dissatified"));
       studentExerciseClass.add(new StudentExerciseClass(40, 9, 234, 7, 1,  "Very Dissatified"));
       
       //acqua student 7 sunday
       studentExerciseClass.add(new StudentExerciseClass(41, 7, 235, 7, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(42, 8, 236, 7, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(43, 9, 237, 7, 4,  "Satisfied"));
     //========================================================================================================
       //box student 8 saturday
       studentExerciseClass.add(new StudentExerciseClass(44, 10, 274, 8, 5, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(45, 11, 275, 8, 5,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(46, 12, 276, 8, 5,  "Satisfied"));
       //box student 8 sunday
       studentExerciseClass.add(new StudentExerciseClass(47, 10, 277, 8, 5,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(48, 11, 278, 8, 1,  "Very Dissatified"));
       studentExerciseClass.add(new StudentExerciseClass(49, 12, 279, 8, 1,  "Very Dissatified"));
       
       
       
       
       //judo student 9
       studentExerciseClass.add(new StudentExerciseClass(31, 13, 26, 7, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(32, 14, 27, 7, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(32, 15, 28, 7, 4,  "Satisfied"));
       //judo student 9
       studentExerciseClass.add(new StudentExerciseClass(33, 13, 29, 8, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(34, 14, 30, 8, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(34, 15, 31, 8, 4,  "Satisfied"));
     //==========================================================================================
       //weight student 10
       studentExerciseClass.add(new StudentExerciseClass(35, 16, 68, 9, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(36, 17, 69, 9, 1,  "Very Dissatified"));
       studentExerciseClass.add(new StudentExerciseClass(36, 18, 70, 9, 1,  "Very Dissatified"));
       
       //weight student 10
       studentExerciseClass.add(new StudentExerciseClass(37, 16, 71, 10, 3, "Ok"));
       studentExerciseClass.add(new StudentExerciseClass(38, 17, 72, 10, 4,  "Satisfied"));
       studentExerciseClass.add(new StudentExerciseClass(38, 18, 73, 10, 4,  "Satisfied"));
//        

        return studentExerciseClass;
    }
}

