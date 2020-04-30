/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import uscticketbookingapp.data.ExerciseClassData;
import uscticketbookingapp.data.ExerciseClassesTimetableData;
import uscticketbookingapp.data.StudentExerciseClassBookingData;
import uscticketbookingapp.data.StudentExerciseClassData;
import uscticketbookingapp.models.ExerciseClass;
import uscticketbookingapp.models.ExerciseClassesTimetable;
import uscticketbookingapp.models.ExerciseStudentCountRatingReport;
import uscticketbookingapp.models.Student;
import uscticketbookingapp.models.StudentExerciseClass;
import uscticketbookingapp.models.StudentExerciseClassBooking;
import uscticketbookingapp.models.TotalIncomePerExerciseReport;

/**
 *
 * @author niyi
 */
public class GenerateReport {

    float totalRating = 0;

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    
//
 int ratingTotal=0;
                 int totalStudents=0;
    public List<ExerciseStudentCountRatingReport> GenerateStudentsPerClassWithRating() {

       
        List<ExerciseStudentCountRatingReport> report = new ArrayList<ExerciseStudentCountRatingReport>();
        try {
            //get report for total students per class per day and average rating
            //get exercise days
            List<StudentExerciseClass> exerciseClasses = StudentExerciseClassData.getStudentExerciseClassData();
            //get distinct exercise clases
                  List<StudentExerciseClass>  distinctExerciseclassIds =  exerciseClasses.stream().filter(distinctByKey(b -> b.getExerciseClassId())).collect(Collectors.toList());
           
            distinctExerciseclassIds.forEach(r -> {
                 //get timetable info
                ExerciseClassesTimetable timeTable = ExerciseClassesTimetableData.getExerciseClassTimeTable(r.getTimeTableId());
                if(timeTable==null)
                {
                    //invalid titable id supplied
                }else{                //get exercise class info
                ExerciseClass classInfo=ExerciseClassData.getExerciseClass(timeTable.getExerciseClassId());
                 ExerciseStudentCountRatingReport rpt = new ExerciseStudentCountRatingReport();
                  ratingTotal=0;
                  totalStudents=0;
                exerciseClasses.forEach(ex->{
                    if(ex.getExerciseClassId()==r.getExerciseClassId())
                    {
                        //add ratings
                        ratingTotal=ratingTotal+ex.getRating();
                        //add students
                        totalStudents=totalStudents+1;
                    }
                });
                rpt.setAverageRating(ratingTotal/totalStudents);
                rpt.setTotalStudents(totalStudents);
                rpt.setDate(timeTable.getDate());
                rpt.setExerciseClass(classInfo.getClassName() +"-"+classInfo.getShift());
                report.add(rpt);
                }
               
            });
             System.out.println("LIST OF EXERCISE DATE COUNT AND AVERAGE RATING (ExerciseClass,TotalSTudents,Date,Average Rating) ");
            report.forEach(r->{
                 System.out.println(" " + r.getExerciseClass() + " | " + r.getTotalStudents()+" | "+r.getDate()+" | "+r.getAverageRating());
            });
            return report;
            //loop and get total students per class, total rating and avreage
            
        } catch (Exception ex) {
            Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return report;
    }

    int exerciseCount = 0;
    float totalIncomePerExercise = 0;
List<TotalIncomePerExerciseReport> reportTotals = new ArrayList<TotalIncomePerExerciseReport>();
    public List<TotalIncomePerExerciseReport> GeneratGroupExercisesWithHighestIncome() {
      reportTotals = new ArrayList<TotalIncomePerExerciseReport>();
        exerciseCount = 0;
        totalIncomePerExercise = 0;
        List<StudentExerciseClassBooking> allBookings = StudentExerciseClassBookingData.getStudentExerciseClassBookings();
        //get distinct group exercise
           List<StudentExerciseClassBooking>  distinctExerciseclassIds =  allBookings.stream().filter(distinctByKey(b -> b.getExclassId())).collect(Collectors.toList());
           
            distinctExerciseclassIds.forEach(r -> {
                  ExerciseClassesTimetable timeTable = ExerciseClassesTimetableData.getExerciseClassTimeTable(r.getExclassId());
                //get exercise class info
                ExerciseClass classInfo=ExerciseClassData.getExerciseClass(timeTable.getExerciseClassId());
                 TotalIncomePerExerciseReport rpt = new TotalIncomePerExerciseReport();
                  exerciseCount=0;
                  totalIncomePerExercise=0;
                allBookings.forEach(ex->{
                    if(ex.getExclassId()==r.getExclassId())
                    {
                        //add to exercise count
                        exerciseCount=ratingTotal+1;
                        //add totalIncomePerExercise
                        totalIncomePerExercise=totalIncomePerExercise+classInfo.getPrice();
                    }
                });
                rpt.setTotalIncome(totalIncomePerExercise);
                rpt.setExerciseClass(classInfo.getClassName() +"-"+classInfo.getShift());
                reportTotals.add(rpt);
            });
        //loop and get total income 
         System.out.println("LIST OF EXERCISE GROUPS BY TOTAL AMOUNTG (ExerciseClass,TotalAmount) ");
            reportTotals.forEach(r->{
                 System.out.println(" " + r.getExerciseClass() + " | " + r.getTotalIncome());
            });
        //get total income per exercise by ordering in desc order of total payments and get first item in list
           System.out.println("EXERCISE GROUPS WWITH HIGHEST TOTAL INCOME (ExerciseClass,TotalAmount) ");
           reportTotals = reportTotals.stream().sorted(new Comparator<TotalIncomePerExerciseReport>(){ 
            @Override
            public int compare(TotalIncomePerExerciseReport o1,TotalIncomePerExerciseReport o2) {
               return (int) (o2.getTotalIncome() - o1.getTotalIncome());
            }
            }).collect(Collectors.toList());
            System.out.println(" " + reportTotals.get(0).getExerciseClass() + " | " + reportTotals.get(0).getTotalIncome());
        return reportTotals;
        //sort in descending order to get the one with highest income
    }
    

}
