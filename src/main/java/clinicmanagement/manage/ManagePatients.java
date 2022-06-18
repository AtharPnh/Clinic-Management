/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.manage;

import clinicmanagement.commons.Commons;
import clinicmanagement.commons.TxtFileManager;
import clinicmanagement.identities.Doctor;
import clinicmanagement.identities.Patient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Administrator
 */
public class ManagePatients {
    
    private TxtFileManager txtFileManager;

    public ManagePatients() {
        
         /**
         * In this constructor we create a managers file with TxtFileManager class to store data.
         */
        
        this.txtFileManager=new TxtFileManager("Patients.txt");
    }
    
    // -------------------------------------- this method add a row(a manager) to list of managers in Managers file
    public void insert(Patient patient) {
        String row = patient.getName() + Commons.SPLITTER + patient.getType();
        
        this.txtFileManager.appendRow(row);
    }
    
    private Patient stringToPatient(String row){
        
        Patient patient = new Patient();
        
        /**
         * in below function we split username and password by splitter and store them in an ArrayList
         */
        
       // ArrayList<String> save = new ArrayList<>(Arrays.asList(row.split(Commons.SPLITTER)));       
        
        String str[] = row.split("~~~");
	List<String> save = new ArrayList<String>();
	save = Arrays.asList(str);
	
        for(int i=0; i<save.size(); i++) {
            
            patient.setName(save.get(0));
            patient.setType(save.get(1));
            patient.setBalance(Double.parseDouble(save.get(2)));
        }
	
        
        return patient;
    }
    
    public ArrayList<Patient> ListOfPatients() {
        
        ArrayList<Patient> patients = new ArrayList<>();
        //first we save all of doctors in doctors file in an ArrayList<String>
        ArrayList<String> save = this.txtFileManager.getListFromFile();
        
        /** in this function we set an object from User class that we get by stringToUser()
        * method from save list in i index in list ArrayList
        */
        
        for(int i=0; i<save.size(); i++) {
            patients.add(stringToPatient(save.get(i)));
        }
        
        return patients;
    }
    
}
