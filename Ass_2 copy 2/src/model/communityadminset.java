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
public class communityadminset {
    private ArrayList<admin> set;
    admin a = new admin();

    public communityadminset(){
        this.set = new ArrayList<admin>();
        person ps = new person();
        
        Date dt = new Date(20020202);
        ps.setName("abc");
        ps.setUsername("abc");
        ps.setPassword("123");
        ps.setPhoneNum("1234567890");
        ps.setEmailAdd("abcd@gfm.com");
        ps.setGender("Female");
        ps.setDOB((dt));
        
        a.setDepartment("Community");
        a.setEmployeeID(1);
        a.setLevel(1);
        a.setPerson(ps);
        
        set.add(a);
    }

    public ArrayList<admin> getHistory() {
        return set;
    }

    public void setHistory(ArrayList<admin> set) {
        this.set = set;
    }
    
    public admin addNewCommunityAdmin(){
        
        admin newCommunityAdmin = new admin();
        set.add(newCommunityAdmin);
        return newCommunityAdmin;
    }
    
    public void deleteCommunityAdmin(admin a){
        set.remove(a);
    }
}
