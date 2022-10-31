/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yueyingliang
 */
public class adminset {
    private ArrayList<admin> set;
    admin ei = new admin();
    public adminset(){
        this.set = new ArrayList<admin>();
        person ps = new person();
        LocalDate dl = LocalDate.parse("2000-01-01");
        ei.setUsername("ABC");
        ei.setPassword("123");
        ps.setPhoneNum("1234567890");
        ps.setEmailAdd("sjwkeu@slk.com");
        ei.setEmployeeID(1);
        ps.setGender("Male");
        ps.setName("ABC");
        ps.setDOB(dl);
        ei.setDepartment("System");
        ei.setLevel(1);
        ei.setPerson(ps);
        
        set.add(ei);
    }

    public ArrayList<admin> getHistory() {
        return set;
    }

    public void setHistory(ArrayList<admin> set) {
        this.set = set;
    }
    
    public admin addNewAdmin(){
        
        admin newAdmin = new admin();
        set.add(newAdmin);
        return newAdmin;
    }
    
    public void deleteEmployee(admin ei){
        set.remove(ei);
    }
}
