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
public class hospitallist {
    private ArrayList<hospital> list;
    hospital a = new hospital();
    hospital b = new hospital();
    public hospitallist(){
        this.list = new ArrayList<hospital>();
        community cm = new community();
        cm.setName("BB");
        a.setHospitalName("AAA");
        a.setCommunity(cm);
        a.setHospitalAdd("100 Sandra Str");
        a.setHospitalEmail("bbbbno1@bb.com");
        a.setHospitalNum("1212123456");
        a.setPostalCode("01234");
        
        community cm2 = new community();
        b.setHospitalName("CCC");
        cm2.setName("CC");
        b.setCommunity(cm2);
        b.setHospitalAdd("10 Sandra Str");
        b.setHospitalEmail("CCCCno1@cc.com");
        b.setHospitalNum("1313123456");
        b.setPostalCode("03234");
        list.add(a);
        list.add(b);
        
    }

    public ArrayList<hospital> getHistory() {
        return list;
    }

    public void setHistory(ArrayList<hospital> list) {
        this.list = list;
    }
    
    public hospital addNewHospital(){
        
        hospital newHospital = new hospital();
        list.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(hospital dh){
        list.remove(dh);
    }
}
