/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chengzhishi
 */
public class Action {
    private String Person;
    private String Name;
    private String Modification;
    private admin Admin;
    private doctor Doctor;
    private patient Patient;

    public admin getAdmin() {
        return Admin;
    }

    public void setAdmin(admin Admin) {
        this.Admin = Admin;
    }

    public doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(doctor Doctor) {
        this.Doctor = Doctor;
    }

    public patient getPatient() {
        return Patient;
    }

    public void setPatient(patient Patient) {
        this.Patient = Patient;
    }
    

    
    public String getPerson() {
        return Person;
    }

    public void setPerson(String Person) {
        this.Person = Person;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getModification() {
        return Modification;
    }

    public void setModification(String Modification) {
        this.Modification = Modification;
    }
    
    @Override
    public String toString(){
        String Person = this.getPerson();
        return Person;
    }
    
}
