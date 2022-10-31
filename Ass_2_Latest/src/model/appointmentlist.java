/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yueyingliang
 */
public class appointmentlist {
    appointment a = new appointment();
    patientset patientset;
    doctorset doctorset;
    hospitallist hospitallist;
    private ArrayList<appointment> list;
    
    public appointmentlist(){
        this.list = new ArrayList<appointment>();
        
        this.patientset = new patientset();
        this.doctorset = new doctorset();
        this.hospitallist = new hospitallist();
        a.setPatientName("ABCDE");
        a.setDoctorName("ABCD");
        LocalDate da = LocalDate.parse("1999-09-09");
        a.setAppointmentDate(da);
        for (doctor nd : doctorset.getHistory()){
            if((a.getDoctorName()).equals(nd.getPerson().getName())){
                a.setHospital(nd.getHospital().getHospitalName());
            }
        }
        
        for (hospital nh : hospitallist.getHistory()){
            if ((a.getHospital()).equals(nh.getHospitalName())){
                a.setCommunity(nh.getCommunity().getName());
                a.setHospitalAdd(nh.getHospitalAdd());
                a.setHospitalEmail(nh.getHospitalEmail());
                a.setHospitalNum(nh.getHospitalNum());
                a.setPostalCode(nh.getPostalCode());
            }
        }
        list.add(a);
    }

    public ArrayList<appointment> getHistory() {
        return list;
    }

    public void setHistory(ArrayList<appointment> list) {
        this.list = list;
    }
    
    public appointment addNewAppointment(){
        
        appointment newAppointment = new appointment();
        list.add(newAppointment);
        return newAppointment;
    }
    
    public void cancelAppointment(appointment ca){
        list.remove(ca);
    }
    
}
