/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author yueyingliang
 */
public class city {
    private String Name;
    private String State;
    private int Population;
    private float Area;
    private ArrayList<community> communities;

    public city(){
        this.communities = new ArrayList<community>();
        community cm = new community();
        
        ArrayList<house> houses = new ArrayList<house>();
        house hs = new house();
        hs.setAddress("101 MA Avenue");
        hs.setArea((float) 111.1);
        hs.setPostalCode("12345");
        hs.setCommunity(cm);
        houses.add(hs);
        
        this.Name = "BBCity";
        cm.setArea(1111111);
        cm.setName("BB");
        cm.setPopulation(12345);
        cm.setHouses(houses);
        cm.setCity(this);
        communities.add(cm);
    }
    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    
    public ArrayList<community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<community> communities) {
        this.communities = communities;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int Population) {
        this.Population = Population;
    }
    
    public community addNewCommunity(){
        
        community newCommunity = new community();
        communities.add(newCommunity);
        return newCommunity;
    }
    
    @Override
    public String toString(){
        String name = Name;
        return name;
    }
}
