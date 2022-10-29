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
public class doctorset {
    private ArrayList<doctor> set;
    
    public doctorset(){
        this.set = new ArrayList<doctor>();
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
