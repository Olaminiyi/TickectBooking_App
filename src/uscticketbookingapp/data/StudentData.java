/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.data;

import java.util.ArrayList;
import java.util.List;
import uscticketbookingapp.models.Student;

/**
 *
 * @author niyi
 */
public class StudentData {
    public static List<Student> getStudents()
    {
       List<Student> students=new ArrayList<Student>();
       students.add(new Student("Neyo",1));
       students.add(new Student("Ibro",2));
       students.add(new Student("Abba Kyari",3));   
       students.add(new Student("Buhari",4));
       students.add(new Student("Tinubu",5));
       students.add(new Student("Fani-Kayode",6));
       students.add(new Student("Sanwo-olu",7));
       students.add(new Student("Atiku",8));
       students.add(new Student("Ambode",9));
       students.add(new Student("El Rufai",10));
        students.add(new Student("Tunde",11));
       students.add(new Student("Denise",12));
       return students;
    }
}
