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
     //(int id,int exerciseClassId,String date,String exerciseDay,boolean isSlotAvailable)
     //YOGA(1-3),ZUMBA(4-6),ACQUA(7-8),BOX FIT(10-12), JUDO(13-15), WEIGHT(16-18)--- EXERCICE CLASSES
     
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(1, 1, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(2, 2, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(3, 3, "2020-02-01", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(4, 1, "2020-02-02", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(5, 8, "2020-02-02", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(6, 3, "2020-02-02", "SUN", true));
     
     // Zumba
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(7, 4, "2020-02-01", "SAT", true));
   //  exerciseclassesTimetable.add(new ExerciseClassesTimetable(8, 5, "2020-02-01", "SAT", true));
     //exerciseclassesTimetable.add(new ExerciseClassesTimetable(9, 6, "2020-02-01", "SAT", true));
     
   //  exerciseclassesTimetable.add(new ExerciseClassesTimetable(10, 4, "2020-02-02", "SUN", true));
     //exerciseclassesTimetable.add(new ExerciseClassesTimetable(11, 5, "2020-02-02", "SUN", true));
     //exerciseclassesTimetable.add(new ExerciseClassesTimetable(12, 6, "2020-02-02", "SUN", true));
     //Yoga(week1=1-3,4-6 WEEK2=38-40,41-43 WEEK3=  )
     
     //ACQUA
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(13, 7, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(14, 8, "2020-02-01", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(15, 9, "2020-02-01", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(17, 7, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(18, 8, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(19, 9, "2020-02-02", "SUN", true));
     
     //BOX-fit
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(20, 10, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(21, 11, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(22, 12, "2020-02-01", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(23, 10, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(24, 11, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(25, 12, "2020-02-02", "SUN", true));
     
     
     //JUDO
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(26, 13, "2020-02-30", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(27, 14, "2020-02-30", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(28, 15, "2020-03-14", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(29, 13, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(30, 14, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(31, 15, "2020-02-02", "SUN", true));
     
     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(32, 16, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(33, 17, "2020-02-01", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(34, 18, "2020-02-01", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(35, 16, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(36, 17, "2020-02-02", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(37, 18, "2020-02-02", "SUN", true));
     
    //=========================SECOND WEEK=========================================================
     
   //  exerciseclassesTimetable.add(new ExerciseClassesTimetable(38, 1, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(39, 2, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(40, 3, "2020-02-08", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(41, 1, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(42, 2, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(43, 3, "2020-02-09", "SUN", true));
     
     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(44, 4, "2020-02-08", "SAT", true));
//    exerciseclassesTimetable.add(new ExerciseClassesTimetable(45, 5, "2020-02-08", "SAT", true));
 //   exerciseclassesTimetable.add(new ExerciseClassesTimetable(46, 6, "2020-02-08", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(47, 4, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(48, 5, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(49, 6, "2020-02-09", "SUN", true));
     
     //ACQUA
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(50, 7, "2020-02-08", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(51, 8, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(52, 9, "2020-02-08", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(53, 7, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(54, 8, "2020-02-09", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(55, 9, "2020-02-09", "SUN", true));
     
     //BOX-fit
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(56, 10, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(57, 11, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(58, 12, "2020-02-08", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(59, 10, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(60, 11, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(61, 12, "2020-02-09", "SUN", true));
     
     
     //JUDO
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(62, 13, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(63, 14, "2020-02-08", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(64, 15, "2020-02-08", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(65, 13, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(66, 14, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(67, 15, "2020-02-09", "SUN", true));
     
     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(68, 16, "2020-03-07", "SAT", true));
  //   exerciseclassesTimetable.add(new ExerciseClassesTimetable(69, 17, "2020-02-08", "SAT", true));
 //    exerciseclassesTimetable.add(new ExerciseClassesTimetable(70, 18, "2020-02-08", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(71, 16, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(72, 17, "2020-02-09", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(73, 18, "2020-02-09", "SUN", true));
     
   //==============================THIRD WEEK======================================================
    
   // exerciseclassesTimetable.add(new ExerciseClassesTimetable(74, 1, "2020-02-15", "SAT", true));
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(75, 2, "2020-02-15", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(76, 3, "2020-02-15", "SAT", true));
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(77, 1, "2020-02-16", "SUN", true));
   //  exerciseclassesTimetable.add(new ExerciseClassesTimetable(78, 2, "2020-02-16", "SUN", true));
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(79, 3, "2020-02-16", "SUN", true));
     
     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(80, 4, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(81, 5, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(82, 6, "2020-02-15", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(83, 4, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(84, 5, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(85, 6, "2020-02-16", "SUN", true));
     
     //ACQUA
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(86, 7, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(87, 8, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(88, 9, "2020-02-15", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(89, 7, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(90, 8, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(91, 9, "2020-02-16", "SUN", true));
     
     //BOX-fit
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(92, 10, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(93, 11, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(94, 12, "2020-02-15", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(95, 10, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(96, 11, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(97, 12, "2020-02-16", "SUN", true));
     
     
     //JUDO
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(98, 13, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(99, 14, "2020-02-15", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(100, 15, "2020-02-15", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(101, 13, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(102, 14, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(103, 15, "2020-02-16", "SUN", true));
     
     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(104, 16, "2020-02-15", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(105, 17, "2020-02-15", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(106, 18, "2020-02-15", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(107, 16, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(108, 17, "2020-02-16", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(109, 18, "2020-02-16", "SUN", true));
     
   //================================FOURT WEEK=====================================================
    
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(110, 1, "2020-02-22", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(111, 2, "2020-02-22", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(112, 3, "2020-02-22", "SAT", true));
//     
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(113, 1, "2020-02-23", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(114, 2, "2020-02-23", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(115, 3, "2020-02-23", "SUN", true));
     
     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(116, 4, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(117, 5, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(118, 6, "2020-02-22", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(119, 4, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(120, 5, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(121, 6, "2020-02-23", "SUN", true));
     
     //ACQUA
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(122, 7, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(123, 8, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(124, 9, "2020-02-22", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(125, 7, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(126, 8, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(127, 9, "2020-02-23", "SUN", true));
     
     //BOX-fit
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(128, 10, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(130, 11, "2020-02-22", "SAT", true));
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(131, 12, "2020-02-22", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(132, 10, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(133, 11, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(134, 12, "2020-02-23", "SUN", true));
     
     
     //JUDO
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(135, 13, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(136, 14, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(137, 15, "2020-02-22", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(138, 13, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(139, 14, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(140, 15, "2020-02-23", "SUN", true));
     
     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(141, 16, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(142, 17, "2020-02-22", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(143, 18, "2020-02-22", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(144, 16, "2020-02-23", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(145, 17, "2020-02-23", "SUN", true));//    exerciseclassesTimetable.add(new ExerciseClassesTimetable(146, 18, "2020-02-23", "SUN", true));
   
   //==============================FIFTH WEEK=========================================================
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(147, 1, "2020-02-29", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(148, 2, "2020-02-29", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(149, 3, "2020-02-29", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(150, 1, "2020-03-01", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(151, 2, "2020-03-01", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(152, 3, "2020-03-01", "SUN", true));
     
     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(153, 4, "2020-02-29", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(154, 5, "2020-02-29", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(155, 6, "2020-02-29", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(157, 4, "2020-03-01", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(158, 5, "2020-03-01", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(160, 6, "2020-03-01", "SUN", true));
     
     //ACQUA
   //  exerciseclassesTimetable.add(new ExerciseClassesTimetable(161, 7, "2020-02-29", "SAT", true));
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(162, 8, "2020-02-29", "SAT", true));
    // exerciseclassesTimetable.add(new ExerciseClassesTimetable(163, 9, "2020-02-29", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(164, 7, "2020-03-01", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(165, 8, "2020-03-01", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(166, 9, "2020-03-01", "SUN", true));
     
     //BOX-fit
//    exerciseclassesTimetable.add(new ExerciseClassesTimetable(167, 10, "2020-02-29", "SAT", true));
 //    exerciseclassesTimetable.add(new ExerciseClassesTimetable(167, 11, "2020-02-29", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(168, 12, "2020-02-29", "SAT", true));
     
 //    exerciseclassesTimetable.add(new ExerciseClassesTimetable(169, 10, "2020-03-01", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(170, 11, "2020-03-01", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(171, 12, "2020-03-01", "SUN", true));
     
     
     //JUDO
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(172, 13, "2020-02-29", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(173, 14, "2020-02-29", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(174, 15, "2020-02-29", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(175, 13, "2020-03-01", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(176, 14, "2020-03-01", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(177, 15, "2020-03-01", "SUN", true));
     
     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(178, 16, "2020-02-29", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(179, 17, "2020-02-29", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(180, 18, "2020-02-29", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(181, 16, "2020-03-01", "SUN", true));
   //  exerciseclassesTimetable.add(new ExerciseClassesTimetable(182, 17, "2020-03-01", "SUN", true));
     //exerciseclassesTimetable.add(new ExerciseClassesTimetable(183, 18, "2020-03-01", "SUN", true));
     
     
   //==============================SIXTH WEEK=======================================================
   
   
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(184, 1, "2020-03-07", "SAT", true));
   exerciseclassesTimetable.add(new ExerciseClassesTimetable(185, 2, "2020-03-07", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(186, 3, "2020-03-07", "SAT", true));
     
   exerciseclassesTimetable.add(new ExerciseClassesTimetable(187, 1, "2020-03-08", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(188, 2, "2020-03-08", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(189, 3, "2020-03-08", "SUN", true));
     
     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(190, 4, "2020-03-07", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(191, 5, "2020-03-07", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(192, 6, "2020-03-07", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(193, 4, "2020-03-08", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(194, 5, "2020-03-08", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(195, 6, "2020-03-08", "SUN", true));
     
     //ACQUA
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(196, 7, "2020-03-07", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(197, 8, "2020-03-07", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(198, 9, "2020-03-07", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(199, 7, "2020-03-08", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(200, 8, "2020-03-08", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(201, 9, "2020-03-08", "SUN", true));
     
     //BOX-fit
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(202, 10, "2020-03-07", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(203, 11, "2020-03-07", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(204, 12, "2020-03-07", "SAT", true));
//     
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(205, 10, "2020-03-08", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(206, 11, "2020-03-08", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(207, 12, "2020-03-08", "SUN", true));
     
     
     //JUDO
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(208, 13, "2020-03-07", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(209, 14, "2020-03-07", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(210, 15, "2020-03-07", "SAT", true));
     
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(211, 13, "2020-03-08", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(212, 14, "2020-03-08", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(213, 15, "2020-03-08", "SUN", true));
//     
     //Weight Lifting
//    exerciseclassesTimetable.add(new ExerciseClassesTimetable(214, 16, "2020-03-07", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(215, 17, "2020-03-07", "SAT", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(216, 18, "2020-03-07", "SAT", true));
//     
//    exerciseclassesTimetable.add(new ExerciseClassesTimetable(217, 16, "2020-03-08", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(218, 17, "2020-03-08", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(219, 18, "2020-03-08", "SUN", true));
//     
  //===================================SEVENTH WEEK=================================================
     
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(220, 1, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(221, 2, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(222, 3, "2020-03-14", "SAT", true));
     
  //   exerciseclassesTimetable.add(new ExerciseClassesTimetable(223, 1, "2020-03-15", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(224, 2, "2020-03-15", "SUN", true));
//     exerciseclassesTimetable.add(new ExerciseClassesTimetable(225, 3, "2020-03-15", "SUN", true));
     
     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(226, 4, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(227, 5, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(228, 6, "2020-03-14", "SAT", true));
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(229, 4, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(230, 5, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(231, 6, "2020-03-15", "SUN", true));
     
     //ACQUA
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(232, 7, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(233, 8, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(234, 9, "2020-03-14", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(235, 7, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(236, 8, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(237, 9, "2020-03-15", "SUN", true));
     
     //BOX-fit
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(238, 10, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(239, 11, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(240, 12, "2020-03-14", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(241, 10, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(242, 11, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(243, 12, "2020-03-15", "SUN", true));
     
     
     //JUDO
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(244, 13, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(245, 14, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(246, 15, "2020-03-14", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(247, 13, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(248, 14, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(249, 15, "2020-03-15", "SUN", true));
     
     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(250, 16, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(251, 17, "2020-03-14", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(252, 18, "2020-03-14", "SAT", true));
     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(253, 16, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(254, 17, "2020-03-15", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(255, 18, "2020-03-15", "SUN", true));
     
     
  //====================================EIGHT WEEK==================================================
  
  
     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(256, 1, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(257, 2, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(258, 3, "2020-03-21", "SAT", true));
//     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(259, 1, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(260, 2, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(261, 3, "2020-03-22", "SUN", true));
     
//     // Zumba
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(262, 4, "2020-03-21", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(263, 5, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(264, 6, "2020-03-21", "SAT", true));
//     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(265, 4, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(266, 5, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(267, 6, "2020-03-22", "SUN", true));
//     
//     //ACQUA
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(268, 7, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(269, 8, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(270, 9, "2020-03-21", "SAT", true));
//     
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(271, 7, "2020-03-22", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(272, 8, "2020-03-22", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(273, 9, "2020-03-22", "SUN", true));
//     
//     //BOX-fit
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(274, 10, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(275, 11, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(276, 12, "2020-03-21", "SAT", true));
//     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(277, 10, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(278, 11, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(279, 12, "2020-03-22", "SUN", true));
//     
//     
//     //JUDO
   exerciseclassesTimetable.add(new ExerciseClassesTimetable(280, 13, "2020-03-21", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(281, 14, "2020-03-21", "SAT", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(282, 15, "2020-03-21", "SAT", true));
//     
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(283, 13, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(284, 14, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(285, 15, "2020-03-22", "SUN", true));
//     
//     //Weight Lifting
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(286, 16, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(287, 17, "2020-03-21", "SAT", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(288, 18, "2020-03-21", "SAT", true));
//     
   exerciseclassesTimetable.add(new ExerciseClassesTimetable(289, 16, "2020-03-22", "SUN", true));
     exerciseclassesTimetable.add(new ExerciseClassesTimetable(290, 17, "2020-03-22", "SUN", true));
    exerciseclassesTimetable.add(new ExerciseClassesTimetable(291, 18, "2020-03-22", "SUN", true));
     
  
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

