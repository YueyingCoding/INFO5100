/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author yueyingliang
 */
public class EmployeeInfoHistory {
    private ArrayList<EmployeeInfo> history;
    
    public EmployeeInfoHistory(){
        this.history = new ArrayList<EmployeeInfo>();
    }

    public ArrayList<EmployeeInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeInfo> history) {
        this.history = history;
    }
    
    public EmployeeInfo addNewEmployees(){
        
        EmployeeInfo newEmployees = new EmployeeInfo();
        history.add(newEmployees);
        return newEmployees;
    }
    
    public void deleteEmployee(EmployeeInfo ei){
        history.remove(ei);
    }
    
    
//    public List<EmployeeInfo> Search(String field, Object val){
//        List<EmployeeInfo> filteredList = new ArrayList<EmployeeInfo>();
        
        //        else if(field == "Team Information"){
//            for(EmployeeInfo emp : history){
//                if(emp.getTeaminfo() == val){
//                    filteredList.add(emp);
//                }
//            }
//            return filteredList;
//        }
        
//        return history;
//    }
}
