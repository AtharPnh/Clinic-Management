/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.manage;

import clinicmanagement.commons.Commons;
import clinicmanagement.commons.TxtFileManager;
import clinicmanagement.identities.Doctor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ManageDoctors {
    
    private TxtFileManager txtFileManager;

    public ManageDoctors() {
        
         /**
         * In this constructor we create a managers file with TxtFileManager class to store data.
         */
        
        this.txtFileManager=new TxtFileManager("Doctors.txt");
    }
    
    public void insert(Doctor dr) {
        
        String row = dr.getName() + Commons.SPLITTER + dr.getSpecialty() + Commons.SPLITTER +
                     Double.toString(dr.getAmountOfVisits()) + Commons.SPLITTER + Double.toString(dr.getAmountOfSalary());
        
        this.txtFileManager.appendRow(row);
    }
    
    private Doctor stringToDoctor(String row){
        
        Doctor doctor = new Doctor();
        
        /**
         * in below function we split username and password by splitter and store them in an ArrayList
         */
        
       // ArrayList<String> save = new ArrayList<>(Arrays.asList(row.split(Commons.SPLITTER)));       
        
        String str[] = row.split("~~~");
	List<String> save = new ArrayList<String>();
	save = Arrays.asList(str);
	
        for(int i=0; i<save.size(); i++) {
            
            doctor.setName(save.get(0));
            doctor.setSpecialty(save.get(1));
            doctor.setAmountOfVisits(Double.parseDouble(save.get(2)));
            doctor.setAmountOfSalary(Double.parseDouble(save.get(3)));
        }
	
        
        return doctor;
    }
    
    public ArrayList<Doctor> ListOfDoctors() {
        
        ArrayList<Doctor> doctors = new ArrayList<>();
        //first we save all of doctors in doctors file in an ArrayList<String>
        ArrayList<String> save = this.txtFileManager.getListFromFile();
        
        /** in this function we set an object from User class that we get by stringToUser()
        * method from save list in i index in list ArrayList
        */
        
        for(int i=0; i<save.size(); i++) {
            doctors.add(stringToDoctor(save.get(i)));
        }
        
        return doctors;
    }
    
    //---------------------------------------------------------this method show to us amount of doctor salary
    public String showSalary(Doctor dr) {
        String salary = Double.toString(dr.getAmountOfSalary());
        return salary;
    }
    
    
    
}
