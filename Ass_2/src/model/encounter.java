/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chengzhishi
 */
public class encounter {
    private String DoctorName;
    private String PatientName;
    private int BloodPressure;
    private int HeartRate;
    private int Temperature;
    private Date EncounterDate;
    private String Diagnosis;
    private String Notes;

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

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public Date getEncounterDate() {
        return EncounterDate;
    }

    public void setEncounterDate(Date EncounterDate) {
        this.EncounterDate = EncounterDate;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    @Override
    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");  
        String strDate = dateFormat.format(EncounterDate);
        return strDate;
    }
    
}
