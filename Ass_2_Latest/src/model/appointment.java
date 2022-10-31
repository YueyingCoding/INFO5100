/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author chengzhishi
 */
public class appointment {
    private String DoctorName;
    private String PatientName;
    private LocalDate AppointmentDate;
    private String Hospital;
    private String Community;
    private String HospitalAdd;
    private String HospitalNum;
    private String HospitalEmail;
    private String PostalCode;

    public LocalDate getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(LocalDate AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

    
    public String getHospitalAdd() {
        return HospitalAdd;
    }

    public void setHospitalAdd(String HospitalAdd) {
        this.HospitalAdd = HospitalAdd;
    }

    public String getHospitalNum() {
        return HospitalNum;
    }

    public void setHospitalNum(String HospitalNum) {
        this.HospitalNum = HospitalNum;
    }

    public String getHospitalEmail() {
        return HospitalEmail;
    }

    public void setHospitalEmail(String HospitalEmail) {
        this.HospitalEmail = HospitalEmail;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }
    
    
    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }
    
    @Override
    public String toString(){
        String strDate = String.valueOf(AppointmentDate);
        return strDate;
    }
}
