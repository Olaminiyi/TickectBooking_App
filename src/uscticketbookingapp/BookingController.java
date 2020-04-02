/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp;

import uscticketbookingapp.models.Student;
import java.util.Scanner;

/**
 *
 * @author niyi
 */
public class BookingController {
    
    public void bookAClass( Student s, String exCourseName ){
        Scanner scanner = new Scanner(System.in);
        // shows different options to pick from
        System.out.println("choose a day for your booking");
        System.out.println("press 1 for Saturday");
        System.out.println("press 2 for Sunday");
        System.out.println("press 3 to Exit");
        try{
            int choice = scanner.nextInt();
            if(!((choice == 1)||(choice == 2)||(choice ==3))){
                System.out.println("invalid input");
                
            }
            if(choice == 3){
                return;
            }
            
        }
        catch(Exception e)
        {
            //choice = -1;
            
        }
    }
}
