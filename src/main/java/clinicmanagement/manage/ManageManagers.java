/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.manage;

import clinicmanagement.commons.Commons;
import clinicmanagement.commons.TxtFileManager;
import clinicmanagement.identities.Doctor;
import clinicmanagement.identities.Manager;

/**
 *
 * @author Administrator
 */
public class ManageManagers {
    
    private TxtFileManager txtFileManager;

    public ManageManagers() {
        
         /**
         * In this constructor we create a managers file with TxtFileManager class to store data.
         */
        
        this.txtFileManager=new TxtFileManager("Managers.txt");
    }
    
    // -------------------------------------- this method add a row(a manager) to list of managers in Managers file
    public void insert(Manager manager) {
        String row = manager.getName() + Commons.SPLITTER + manager.getPassword() + Commons.SPLITTER +
                     manager.getClinic() + Commons.SPLITTER + Double.toString(manager.getSalary());
        
        this.txtFileManager.appendRow(row);
    }
    
    // -------------------------------------- this method set salary to doctor
    public void setSalary(Doctor dr, Double amount) {
        
        double newSalary;
        
        newSalary = dr.getAmountOfSalary() + amount;
    }

    
}
