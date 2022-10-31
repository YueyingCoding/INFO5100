/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yueyingliang
 */
public class community {
    private city city;
    private int population;
    private float area;
    private String Name;
    private ArrayList<house> houses;

    public community(){
        this.houses = new ArrayList<house>();
        house hs = new house();
        this.Name = "BB";
        hs.setAddress("101 MA Avenue");
        hs.setArea((float) 111.1);
        hs.setPostalCode("12345");
        hs.setCommunity(this);
        
        houses.add(hs);
    }
    public ArrayList<house> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<house> houses) {
        this.houses = houses;
    }

    
    public city getCity() {
        return city;
    }

    public void setCity(city city) {
        this.city = city;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    public house addNewHouse(){
        house newHouse = new house();
        houses.add(newHouse);
        return newHouse;
    }
    @Override
    public String toString(){
        String name = Name;
        return name;
    }
}
