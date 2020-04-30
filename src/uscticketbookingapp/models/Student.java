/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapp.models;

/**
 *
 * @author niyi
 */
public class Student {
    private String Name;
    private int Id;

    public Student(int id,String name)
    {
        setName(name);
        setId(id);
    }
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }
    
    public void addStudent(){
    
    }
    public Student[] getStudent(){
    return null;
    }
}
