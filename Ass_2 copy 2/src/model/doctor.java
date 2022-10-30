/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author chengzhishi
 */
public class doctor {
//    
    private person Person;
    private int EmployeeID;
    private hospital Hospital;
    private String Major;
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
    public hospital getHospital() {
        return Hospital;
    }

    public void setHospital(hospital Hospital) {
        this.Hospital = Hospital;
    }

    
    public person getPerson() {
        return Person;
    }

    public void setPerson(person Person) {
        this.Person = Person;
    }

//    public String getUsername() {
//        return Username;
//    }
//
//    public void setUsername(String Username) {
//        this.Username = Username;
//    }
//
//    public String getPassword() {
//        return Password;
//    }
//
//    public void setPassword(String Password) {
//        this.Password = Password;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

//    public String getGender() {
//        return Gender;
//    }
//
//    public void setGender(String Gender) {
//        this.Gender = Gender;
//    }
//
//    public Date getDOB() {
//        return DOB;
//    }
//
//    public void setDOB(Date DOB) {
//        this.DOB = DOB;
//    }
//
//    public String getPhoneNum() {
//        return PhoneNum;
//    }

//    public void setPhoneNum(String PhoneNum) {
//        this.PhoneNum = PhoneNum;
//    }
//
//    public String getEmailAdd() {
//        return EmailAdd;
//    }
//
//    public void setEmailAdd(String EmailAdd) {
//        this.EmailAdd = EmailAdd;
//    }

//    public String getHospital() {
//        return Hospital;
//    }
//
//    public void setHospital(String Hospital) {
//        this.Hospital = Hospital;
//    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }
    
    @Override
    public String toString(){
        String Name = this.getPerson().getName();
        return Name;
    }
    
}
