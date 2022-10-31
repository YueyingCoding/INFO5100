/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import model.VitalSigns;

/**
 *
 * @author yueyingliang
 */
public class encounterhistory {
    private ArrayList<encounter> history;
    encounter eh = new encounter();
    VitalSigns vitalsigns = new VitalSigns();
    public encounterhistory(){
        this.history = new ArrayList<encounter>();
        LocalDate ed = LocalDate.parse("1999-08-08");
        eh.setDoctorName("ABCD");
        eh.setPatientName("ABCDE");
        eh.setEncounterDate(ed);
        vitalsigns.setBloodPressure(100);
        vitalsigns.setHeartRate(90);
        vitalsigns.setTemperature((float) 36.5);
        eh.setVitalSigns(vitalsigns);
        eh.setDiagnosis("Diabetes");
        eh.setNotes("Eat Less Sugar");
        
        history.add(eh);
    }

    public ArrayList<encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<encounter> history) {
        this.history = history;
    }
    
    public encounter addNewEncounter(){
        
        encounter newEncounter = new encounter();
        history.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(encounter eh){
        history.remove(eh);
    }
}
