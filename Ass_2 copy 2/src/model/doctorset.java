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
public class doctorset {
    private ArrayList<doctor> set;
    doctor a = new doctor();

    public doctorset(){
        this.set = new ArrayList<doctor>();
        Date dl = new Date(20020902);
        person ps = new person();
        hospital hp = new hospital();
        a.setUsername("ABCD");
        a.setPassword("1234");
        ps.setPhoneNum("9876543210");
        ps.setEmailAdd("swiau@sme.com");
        ps.setGender("Male");
        ps.setName("ABCD");
        ps.setDOB(dl);
        a.setPerson(ps);
        a.setEmployeeID(2);
        hp.setHospitalName("AAA");
        a.setHospital(hp);
        a.setMajor("BBB");
        
        set.add(a);
//        set.add(b);
    }

    public ArrayList<doctor> getHistory() {
        return set;
    }

    public void setHistory(ArrayList<doctor> set) {
        this.set = set;
    }
    
    public doctor addNewDoctor(){
        
        doctor newDoctor = new doctor();
        set.add(newDoctor);
        return newDoctor;
    }
    
    public void deleteEmployee(doctor ei){
        set.remove(ei);
    }
    
}
