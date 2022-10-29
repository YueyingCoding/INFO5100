/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author chengzhishi
 */
public class admin {
    private person Person;
    private int EmployeeID;
    private String Department;
    private int Level;

    public person getPerson() {
        return Person;
    }

    public void setPerson(person Person) {
        this.Person = Person;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }
    
    @Override
    public String toString(){
        String Name = this.getPerson().getName();
        return Name;
    }
    
    
    
}
