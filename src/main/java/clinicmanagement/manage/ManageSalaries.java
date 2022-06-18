/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.manage;

import clinicmanagement.commons.TxtFileManager;
import clinicmanagement.identities.Doctor;
import clinicmanagement.identities.Secretary;

/**
 *
 * @author Administrator
 */
public class ManageSalaries {
    
    private TxtFileManager txtFileManager;

    
    public ManageSalaries() {
        
         /**
         * In this constructor we create a Salaries file with TxtFileManager class to store data.
         */
        
        this.txtFileManager=new TxtFileManager("Salaries.txt");
    }
    
    //------------------------- insert doctors salary to manageSalaries file
    public void insertDrSalary(Doctor dr) {

        
        String row = "Dr. " + dr.getName() + ": " + Double.toString(dr.getAmountOfSalary());
        
        this.txtFileManager.appendRow(row);
    }
    
    //------------------------- insert secretarys salary to manageSalaries file
      public void insertSecrSalary(Secretary secr) {

        
        String row = "Secretary " + secr.getName() + ": " + Double.toString(secr.getSalary());
        
        this.txtFileManager.appendRow(row);
    }
    
}
