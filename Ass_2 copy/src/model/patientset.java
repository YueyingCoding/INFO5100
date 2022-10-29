/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chengzhishi
 */
public class patientset {
    private ArrayList<patient> set;
    
    public patientset(){
        this.set = new ArrayList<patient>();
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
