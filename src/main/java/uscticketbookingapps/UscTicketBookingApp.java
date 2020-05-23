/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapps;

import java.util.Scanner;
import uscticketbookingapp.data.StudentData;
import uscticketbookingapp.data.StudentExerciseClassBookingData;

/**
 *
 * @author niyi
 */
public class UscTicketBookingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       // StudentData.getStudents();
        StudentExerciseClassBookingData.getStudentExerciseClassBookings();
        System.out.println("=====================================================================================================================================");
        System.out.println("Welcome to the University Sport Booking Portal");
        System.out.println("Check the Time table for your favourite Excercise class");
        
        System.out.println("Exercise class         Sesion        Days               Amount");
        System.out.println("Yoga                    All          Sat/Sun             100  ");
        System.out.println("ZUMBA                   All          Sat/Sun             150");
        System.out.println("ACQUACISE               All          Sat/Sun             200  ");
        System.out.println("BOX FIT                 All          Sat/Sun             250");
        System.out.println("JUDO                    All          Sat/Sun             300  ");
        System.out.println("WEIGHT LIFTING          All          Sat/Sun             1500");
         System.out.println("All classes runs consecutively in all season, pls don't let your booking class clash if you're booking for more than one class  ");
        System.out.println(" we have Morning session from 8a.m to 12pm, Afternoon session from 12pm to 4pm and Evening class from 4pm to 8pm");
         System.out.println("=====================================================================================================================================");
        
        Scanner scanner = new Scanner(System.in);
        // shows different options to pick from
        System.out.println("======================================================================================================================================");
       
        //System.out.println("press 0 for register student");
        System.out.println("press 1 for class booking");
        System.out.println("press 2 to change a booking");
        System.out.println("press 3 to generate report for number of student per group with rating");
        System.out.println("press 4 to generate report for group exercise with highest income");
        System.out.println("press 5 to Exit");
         System.out.println("======================================================================================================================================");
        try{
            int choice = scanner.nextInt();
            if(!((choice == 0)||(choice == 1)||(choice == 2)||(choice ==3)||(choice ==4)||(choice ==5))){
                System.out.println("invalid input");
                System.out.println("choose between 1 to 5");
                
            }
//              if(choice == 0){
//               // return;
//               System.out.println("Student Id");
//               int studentId = scanner.nextInt();
//                System.out.println("Name");
//              String name = scanner.next();
//              StudentData.addNewStudent(studentId, name);
//             
//               System.out.println("You have successfully added "+name);
//               
//            }
//              
              //(int id,int studentId,int classid, String date,boolean paid,boolean active)
               if(choice == 1){
               // return;
               System.out.println("Id");
               int timetableId = scanner.nextInt();
               System.out.println("Student Id");
               int studentId = scanner.nextInt();
               System.out.println("class Id");
               int classId = scanner.nextInt();
                System.out.println("date");
              String date = scanner.next();
              
              System.out.println("have you paid (1 for yes , 0 for no)");
                int paidd = scanner.nextInt();
                boolean paid = paidd == 1 ? true : false;
                System.out.println("will you attend the class (1 for yes , 0 for no)");
                int activee = scanner.nextInt();
                boolean active = activee == 1 ? true : false;
              

          String response =   StudentExerciseClassBookingData.bookExerciseClass(timetableId, studentId, classId, date, paid, active);
             
                 System.out.println("class booked successfully");

                  System.out.println("do you want to exit the application");
                   System.out.println("press 1 to exit");
                 int res = scanner.nextInt();
                 if (res == 1){
                     return;
                 }
                 
               
            }
              
             if(choice == 2){
               // return;
               System.out.println("Booking Id");
               int bookingId = scanner.nextInt();
                System.out.println("New Exercise Class Id");
               int newClassId = scanner.nextInt();
                int response= StudentExerciseClassBookingData.changeExerciseClass(bookingId, newClassId);
                if(response>0)
                {
                    System.out.println("You have successfully changed your class");
                }
                else
                {
                     System.out.println("Exercise class change failed");
                }
                
                 System.out.println("do you want to exit the application");
                   System.out.println("press 1 to exit");
                 int res = scanner.nextInt();
                 if (res == 1){
                     return;
                 }
            }
            if(choice == 5){
               // return;
               System.out.println("Thank you for visiting");
                System.exit(0);
            }
            
            if(choice == 3){
            GenerateReport rpt = new GenerateReport();
            rpt.GenerateStudentsPerClassWithRating();
             System.out.println("do you want to exit the application");
                   System.out.println("press 1 to exit");
                 int res = scanner.nextInt();
                 if (res == 1){
                     return;
                 }
            }
            if(choice == 4){
            GenerateReport rpt = new GenerateReport();
            rpt.GeneratGroupExercisesWithHighestIncome();
            
             System.out.println("do you want to exit the application");
                   System.out.println("press 1 to exit");
                 int res = scanner.nextInt();
                 if (res == 1){
                     return;
                 }
            }
        }
        catch(Exception e)
        {
            //choice = -1;
            
        }
        
        //
       // Scanner scanner = new Scanner(System.in);
      //  System.out.println("Please enter your name");
      //  System.out.println("Please enter your name");
        // book.bookAClass(s,"");
    }

}

