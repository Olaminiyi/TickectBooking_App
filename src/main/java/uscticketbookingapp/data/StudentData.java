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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import uscticketbookingapps.FIleHelper;
import static uscticketbookingapp.data.StudentExerciseClassBookingData.getStudentExerciseClassBookings;
import static uscticketbookingapp.data.StudentExerciseClassBookingData.gson;
import static uscticketbookingapp.data.StudentExerciseClassBookingData.studentExerciseBookinig;
import uscticketbookingapp.models.Student;
import uscticketbookingapp.models.StudentExerciseClassBooking;

/**
 *
 * @author niyi
 */
public class StudentData {
    static  List<Student> students=new ArrayList<Student>();
    public static List<Student> getStudents()
    {
      
//       students.add(new Student(1,"Neyo"));
//       students.add(new Student(2,"Ibro"));
//       students.add(new Student(3,"Mike"));   

//      
       Gson gson=new Gson();
//       String data= gson.toJson(students);
//        FIleHelper.writeToFile("students.json", data);

        String data =FIleHelper.readFile("students.json");
        
        Type listType = new TypeToken<ArrayList<Student>>(){}.getType();
      students =  gson.fromJson(data, listType);
       return students;
    }
    
    public static Student getStudent(int id)
    {
        List<Student> data = getStudents().stream().filter(c -> c.getId() == id).collect(Collectors.toList());
        if (data.size() > 0) {
            return data.get(0);
        }
        return null;
    }
    
    public static void addNewStudent(int id, String name)
    {
        students=getStudents();
        Student myClass = new Student(id,name);
        students.add(myClass);
         String data= gson.toJson(students);
        FIleHelper.writeToFile("students.json", data);

    }
      
   
    
    
}

