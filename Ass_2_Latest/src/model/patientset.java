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
 * @author chengzhishi
 */
public class patientset {
    private ArrayList<patient> set;
    
    patient ei = new patient();
    public patientset(){
        this.set = new ArrayList<patient>();
        
        LocalDate dl = LocalDate.parse("1989-02-02");
        person ps = new person();
        city ct = new city();
        community cm = new community();
        house hs = new house();
        hs.setAddress("001 Harvard Street");
        ps.setDOB(dl);
        ei.setUsername("ABCDE");
        ei.setPassword("12345");
        ps.setPhoneNum("2143658709");
        ps.setEmailAdd("sjje9wi@slwk.com");
        ps.setGender("Male");
        ps.setName("ABCDE");
        ct.setName("AA");
        ei.setCity(ct);
        cm.setName("AB");
        ei.setCommunity(cm);
        ei.setHomeAdd(hs);
        ei.setPostalCode("01234");
        ei.setInsurance(Boolean.TRUE);
        ei.setPerson(ps);
        
        set.add(ei);
    }

    public ArrayList<patient> getHistory() {
        return set;
    }

    public void setHistory(ArrayList<patient> set) {
        this.set = set;
    }
    
    public patient addNewPatient(){
        
        patient newPatient = new patient();
        set.add(newPatient);
        return newPatient;
    }
    
    public void deleteEmployee(patient ei){
        set.remove(ei);
    }
    
}
