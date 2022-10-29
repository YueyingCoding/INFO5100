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
public class personset {
    private ArrayList<person> set;
    
    person ps = new person();
    public personset(){
        this.set = new ArrayList<person>();
        
        Date dl = new Date(2009,9,20);
        ps.setDOB(dl);
        ps.setUsername("ABCDEF");
        ps.setPassword("123456");
        ps.setPhoneNum("2143658709");
        ps.setEmailAdd("sjje9wi@slwk.com");
        ps.setGender("Male");
        ps.setName("ABCDEF");
        
        set.add(ps);
    }

    public ArrayList<person> getHistory() {
        return set;
    }

    public void setHistory(ArrayList<person> set) {
        this.set = set;
    }
    
    public person addNewPerson(){
        
        person newPerson = new person();
        set.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(person ei){
        set.remove(ei);
    }
    
}
