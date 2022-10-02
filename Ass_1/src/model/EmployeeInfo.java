/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author yueyingliang
 */
public class EmployeeInfo {
    private String Name;
    private int EmployeeID;
    private int Age;
    private String Gender;
    private Date StartDate;
    private int Level;
    private String Teaminfo;
    private String PositionTitle;
    private String CellNum;
    private String EmailAdd;
    private ImageIcon image;

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }
    
    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    

    public String getTeaminfo() {
        return Teaminfo;
    }

    public void setTeaminfo(String Teaminfo) {
        this.Teaminfo = Teaminfo;
    }

    public String getPositionTitle() {
        return PositionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.PositionTitle = PositionTitle;
    }

//    public String getContactInfo() {
//        return ContactInfo;
//    }
//
//    public void setContactInfo(String ContactInfo) {
//        this.ContactInfo = ContactInfo;
//    }

    public String getCellNum() {
        return CellNum;
    }

    public void setCellNum(String CellNum) {
        this.CellNum = CellNum;
    }

    public String getEmailAdd() {
        return EmailAdd;
    }

    public void setEmailAdd(String EmailAdd) {
        this.EmailAdd = EmailAdd;
    }
    
    @Override
    public String toString(){
        return Name;
    }
}
