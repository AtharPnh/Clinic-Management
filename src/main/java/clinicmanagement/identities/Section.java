/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.identities;

import clinicmanagement.manage.ManageDoctors;
import clinicmanagement.manage.ManagePatients;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Section {
    
    private String name;
    private String type;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private Secretary secretary;

    public Section() {
    }

    public Section(String name, String type, ArrayList<Doctor> doctors, ArrayList<Patient> patients, Secretary secretary) {
        this.name = name;
        this.type = type;
        this.doctors = doctors;
        this.patients = patients;
        this.secretary = secretary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    //retuen a list of doctors that gets from doctors file in ManageDoctors class
    public ArrayList<Doctor> getDoctors() {
        
        ManageDoctors md = new ManageDoctors();
        
        ArrayList<Doctor> doctors = md.ListOfDoctors();
        
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Patient> getPatients() {
        
        ManagePatients mp = new ManagePatients();
        
        ArrayList<Patient> patients = mp.ListOfPatients();
        
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
    
    
    
}
