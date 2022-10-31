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
 * @author yueyingliang
 */
public class encounter {
    private String DoctorName;
    private String PatientName;
    private LocalDate EncounterDate;
    private String Diagnosis;
    private String Notes;
    private VitalSigns VitalSigns;

    public LocalDate getEncounterDate() {
        return EncounterDate;
    }

    public void setEncounterDate(LocalDate EncounterDate) {
        this.EncounterDate = EncounterDate;
    }

    
    public VitalSigns getVitalSigns() {
        return VitalSigns;
    }

    public void setVitalSigns(VitalSigns VitalSigns) {
        this.VitalSigns = VitalSigns;
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
        String strDate = String.valueOf(EncounterDate);
        return strDate;
    }
    
}
