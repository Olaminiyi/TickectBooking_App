/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import uscticketbookingapp.FIleHelper;
import static uscticketbookingapp.data.StudentData.getStudents;
import static uscticketbookingapp.data.StudentData.students;
import uscticketbookingapp.models.ExerciseClassesTimetable;
import uscticketbookingapp.models.Student;

import uscticketbookingapp.models.StudentExerciseClassBooking;

/**
 *
 * @author niyi
 */
public class StudentExerciseClassBookingData {
 static Gson gson=new Gson();
    static List<StudentExerciseClassBooking> studentExerciseBookinig = new ArrayList<StudentExerciseClassBooking>();

    public static List<StudentExerciseClassBooking> getStudentExerciseClassBookings() {

        studentExerciseBookinig = new ArrayList<StudentExerciseClassBooking>();
        
        //read from file
//        //new StudentExerciseClassBooking(Id,StudentId,ExerciseClassId,Date,isPaid,isActive)
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(1, 1, 1, "2020-04-10", true, true));
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(2, 2, 1, "2020-04-10", true, true));
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(3, 3, 1, "2020-04-10", true, true));
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(4, 4, 1, "2020-04-10", true, true));
//
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(5, 1, 2, "2020-04-10", true, true));
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(6, 2, 2, "2020-04-10", true, true));
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(7, 3, 2, "2020-04-10", true, true));
//        studentExerciseBookinig.add(new StudentExerciseClassBooking(8, 4, 2, "2020-04-10", true, true));
//        
//        
        
        
//       String data= gson.toJson(studentExerciseBookinig);
//        FIleHelper.writeToFile("studentexercixebookings.json", data);

       String  data =FIleHelper.readFile("studentexercixebookings.json");
        Type listType = new TypeToken<ArrayList<StudentExerciseClassBooking>>(){}.getType();
      studentExerciseBookinig =  gson.fromJson(data, listType);
       return studentExerciseBookinig;
    }

    public static StudentExerciseClassBooking getStudentExerciseClassBooking(int id) {
        List<StudentExerciseClassBooking> data = getStudentExerciseClassBookings().stream().filter(c -> c.getId() == id).collect(Collectors.toList());
        if (data.size() > 0) {
            return data.get(0);
        }
        return null;
    }
    
     public static List<StudentExerciseClassBooking> getStudentExerciseClassBookingByClass(int classid) {
        List<StudentExerciseClassBooking> data = getStudentExerciseClassBookings().stream().filter(c -> c.getExclassId()== classid && c.isIsActive()==true).collect(Collectors.toList());
        if (data.size() > 0) {
            return data;
        }
        return null;
    }
     
    
      public static String bookExerciseClass(int id,int studentId,int classid, String date,boolean paid,boolean active)
    {
        String response="";
        studentExerciseBookinig=getStudentExerciseClassBookings();
        //check if active entries is greater than 4
        List<StudentExerciseClassBooking> studentsBookedInClass = getStudentExerciseClassBookingByClass(classid);
        if(studentsBookedInClass.size()>=4)
        {
            //no more space
            response="Maximum allowed number of students reached, please choose another class";
            return response;
        }
        StudentExerciseClassBooking myClass = new StudentExerciseClassBooking(id,studentId,classid,date,paid,active);
        studentExerciseBookinig.add(myClass);
         String data= gson.toJson(studentExerciseBookinig);
        FIleHelper.writeToFile("studentexercisebookings.json", data);
        response="Student successfully booked in for exercise class";
        System.out.println(response);
        return response;
    }

    public static int changeExerciseClass(int bookingId, int newExerciseClassId) {
        int done = 0;
        StudentExerciseClassBooking myClass = getStudentExerciseClassBooking(bookingId);
        //change to new class
        studentExerciseBookinig.remove(myClass);
        myClass.setExclassId(newExerciseClassId);
        studentExerciseBookinig.add(myClass);
        done = myClass.getExclassId() == newExerciseClassId ? 1 : 0;
        //store back in file
         String data= gson.toJson(studentExerciseBookinig);
        FIleHelper.writeToFile("studentexercixebookings.json", data);
        return done;
    }
}
