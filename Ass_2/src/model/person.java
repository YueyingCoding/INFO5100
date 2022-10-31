/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chengzhishi
 */
public class person {
    private String Name;
    private String Gender;
    private Date DOB;
    private String PhoneNum;
    private String EmailAdd;
    private house House;

    public house getHouse() {
        return House;
    }

    public void setHouse(house House) {
        this.House = House;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getEmailAdd() {
        return EmailAdd;
    }

    public void setEmailAdd(String EmailAdd) {
        this.EmailAdd = EmailAdd;
    }
    
    @Override
    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");  
        String strDate = dateFormat.format(DOB);
        return strDate;
    }
    
}
