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
public class encounterhistory {
    private ArrayList<encounter> history;
    
    public encounterhistory(){
        this.history = new ArrayList<encounter>();
    }

    public ArrayList<encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<encounter> history) {
        this.history = history;
    }
    
    public encounter addNewEncounter(){
        
        encounter newEncounter = new encounter();
        history.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(encounter eh){
        history.remove(eh);
    }
}
