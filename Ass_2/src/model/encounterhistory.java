/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import model.VitalSigns;

/**
 *
 * @author chengzhishi
 */
public class encounterhistory {
    private ArrayList<encounter> history;
    encounter eh = new encounter();
    VitalSigns vitalsigns = new VitalSigns();
    public encounterhistory(){
        this.history = new ArrayList<encounter>();
        Date ed = new Date(99, 3, 10);
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
