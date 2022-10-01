/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chengzhishi
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
    
    public List<EmployeeInfo> Search(String field, Object val){
        List<EmployeeInfo> filteredList = new ArrayList<EmployeeInfo>();
        if(field == "Name"){
            for(EmployeeInfo emp : history){
                if(emp.getName() == val){
                    filteredList.add(emp);
                }
            }
            return filteredList;
        }
        else if(field == "Level"){
            for(EmployeeInfo emp : history){
                if(emp.getGender() == val){
                    filteredList.add(emp);
                }
            }
            return filteredList;
        }
        else if(field == "Position Title"){
            for(EmployeeInfo emp : history){
                if(emp.getLevel() == val){
                    filteredList.add(emp);
                }
            }
            return filteredList;
        }
        else if(field == "Team Info"){
            for(EmployeeInfo emp : history){
                if(emp.getEmployeeID() == val){
                    filteredList.add(emp);
                }
            }
            return filteredList;
        }
//        else if(field == "Team Information"){
//            for(EmployeeInfo emp : history){
//                if(emp.getTeaminfo() == val){
//                    filteredList.add(emp);
//                }
//            }
//            return filteredList;
//        }
        
        return history;
    }
}
