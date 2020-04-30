/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp;

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
        
        Scanner scanner = new Scanner(System.in);
        // shows different options to pick from
        System.out.println("=================================================================");
        System.out.println("Welcome to the University Sport Booking Portal");
        System.out.println("press 0 for register student");
        System.out.println("press 1 for class booking");
        System.out.println("press 2 to change a booking");
        System.out.println("press 3 to generate report for number of student per group with rating");
        System.out.println("press 4 to generate report for group exercise with highest income");
        System.out.println("press 5 to Exit");
         System.out.println("=================================================================");
        try{
            int choice = scanner.nextInt();
            if(!((choice == 1)||(choice == 2)||(choice ==3)||(choice ==4)||(choice ==5))){
                System.out.println("invalid input");
                System.out.println("choose between 1 to 5");
                
            }
              if(choice == 0){
               // return;
               System.out.println("Student Id");
               int studentId = scanner.nextInt();
                System.out.println("Name");
              String name = scanner.next();
               StudentData.addNewStudent(studentId, name);
             
                    System.out.println("You have successfully added "+name);
               
            }
              
              //(int id,int studentId,int classid, String date,boolean paid,boolean active)
               if(choice == 1){
               // return;
               System.out.println("Timetable Id");
               int timetableId = scanner.nextInt();
               System.out.println("Student Id");
               int studentId = scanner.nextInt();
               System.out.println("class Id");
               int classId = scanner.nextInt();
                System.out.println("date");
              String date = scanner.next();
              System.out.println("have you paid");
              boolean paid = scanner.nextBoolean();
               System.out.println("will you attend the class");
              boolean active = scanner.nextBoolean();
              // StudentData.addNewStudent(studentId, name);
          String response =   StudentExerciseClassBookingData.bookExerciseClass(timetableId, studentId, classId, date, paid, active);
             
                 System.out.println("You class booking is successful");
//                if (response == "Maximum allowed number of students reached, please choose another class"){
//                    System.out.println("You class booking is successful");
//                    
//                } else {
//                     System.out.println("You class booking was not successful");
//    //            }
               
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
            }
            if(choice == 5){
               // return;
               System.out.println("Thank you for visiting");
                System.exit(0);
            }
            
            if(choice == 3){
            GenerateReport rpt = new GenerateReport();
            rpt.GenerateStudentsPerClassWithRating();
            }
            if(choice == 4){
            GenerateReport rpt = new GenerateReport();
            rpt.GeneratGroupExercisesWithHighestIncome();
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
