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
public class ActionHistory {
    private ArrayList<Action> list;
    Action ai = new Action();
    public ActionHistory(){
        this.list = new ArrayList<Action>();
        ai.setPerson("Doctor");
        ai.setName("ABCD");
        ai.setModification("Add new Encounter.");
        
        list.add(ai);
    }

    public ArrayList<Action> getHistory() {
        return list;
    }

    public void setHistory(ArrayList<Action> list) {
        this.list = list;
    }
    
    public Action addNewAction(){
        
        Action newAction= new Action();
        list.add(newAction);
        return newAction;
    }
    
    public void deleteAction(Action ai){
        list.remove(ai);
    }
}
