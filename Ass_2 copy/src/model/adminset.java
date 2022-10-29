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
public class adminset {
    private ArrayList<admin> set;
    
    public adminset(){
        this.set = new ArrayList<admin>();
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
