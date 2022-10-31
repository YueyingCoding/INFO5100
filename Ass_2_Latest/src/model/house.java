/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author yueyingliang
 */
public class house {
    private community community;
    private String Address;
    private String PostalCode;
    private float Area;

    public community getCommunity() {
        return community;
    }

    public void setCommunity(community community) {
        this.community = community;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }
    @Override
    public String toString(){
        String HomeAdd = Address;
        return HomeAdd;
    }
    
}
