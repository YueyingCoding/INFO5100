/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chengzhishi
 */
public class hospitaladminset {
    private ArrayList<admin> set;
    admin ei = new admin();
    public hospitaladminset(){
        this.set = new ArrayList<admin>();
        person ps = new person();
        Date dl = new Date(11,11,2000);
        ps.setUsername("ABc");
        ps.setPassword("123");
        ps.setPhoneNum("123456789");
        ps.setEmailAdd("sjwkeu@slk.com");
        ei.setEmployeeID(1);
        ps.setGender("Male");
        ps.setName("ABC");
        ps.setDOB(dl);
        ei.setDepartment("Hospital");
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
