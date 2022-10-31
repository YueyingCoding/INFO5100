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
public class citylist {
    private ArrayList<city> list;
    city ct = new city();

    public citylist(){
        
//        ArrayList<community> communities = new ArrayList<community>();
//        community cm = new community();
//        communities.add(cm);
        
        ArrayList<community> communities = new ArrayList<community>();
        community cm = new community();
        
        ArrayList<house> houses = new ArrayList<house>();
        house hs = new house();
        hs.setAddress("101 MA Avenue");
        hs.setArea((float) 111.1);
        hs.setPostalCode("12345");
        hs.setCommunity(cm);
        houses.add(hs);
        
        cm.setArea(1111111);
        cm.setName("BB");
        cm.setPopulation(12345);
        cm.setHouses(houses);
        cm.setCity(ct);
        communities.add(cm);
        
        this.list = new ArrayList<city>();
        ct.setName("BBCity");
        ct.setPopulation(13579);
        ct.setState("MA");
        ct.setArea(2222);
        ct.setCommunities(communities);
        
        
        list.add(ct);
//        set.add(b);
    }

    public ArrayList<city> getHistory() {
        return list;
    }

    public void setHistory(ArrayList<city> list) {
        this.list = list;
    }
    
    public city addNewCity(){
        
        city newCity = new city();
        list.add(newCity);
        return newCity;
    }
    
    public void deleteCity(city ct){
        list.remove(ct);
    }
    
}
