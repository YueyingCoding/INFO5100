/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author yueyingliang
 */
public class patient {
    private house HomeAdd;
    private city City;
    private community Community;
    private String PostalCode;
    private person person;
    private Boolean Insurance;
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

    public house getHomeAdd() {
        return HomeAdd;
    }

    public void setHomeAdd(house HomeAdd) {
        this.HomeAdd = HomeAdd;
    }
    
    

    public person getPerson() {
        return person;
    }

    public void setPerson(person person) {
        this.person = person;
    }

    
    public Boolean getInsurance() {
        return Insurance;
    }

    public void setInsurance(Boolean Insurance) {
        this.Insurance = Insurance;
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
//
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
//
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


    public city getCity() {
        return City;
    }

    public void setCity(city City) {
        this.City = City;
    }

    public community getCommunity() {
        return Community;
    }

    public void setCommunity(community Community) {
        this.Community = Community;
    }

    
    

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }
    
    @Override
    public String toString(){
        String Name = this.getPerson().getName();
        return Name;
    }
}
