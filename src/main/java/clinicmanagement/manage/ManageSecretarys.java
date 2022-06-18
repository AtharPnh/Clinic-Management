/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.manage;

import clinicmanagement.commons.Commons;
import clinicmanagement.commons.TxtFileManager;
import clinicmanagement.identities.Doctor;
import clinicmanagement.identities.Secretary;

/**
 *
 * @author Administrator
 */
public class ManageSecretarys {
    
    private TxtFileManager txtFileManager;

    public ManageSecretarys() {
        
         /**
         * In this constructor we create a managers file with TxtFileManager class to store data.
         */
        
        this.txtFileManager=new TxtFileManager("Secretarys.txt");
    }
    
    // -------------------------------------- this method add a row(a manager) to list of managers in Managers file
    public void insert(Secretary  secr) {
        String row = secr.getName() + Commons.SPLITTER + secr.getPassword() + Commons.SPLITTER +
                     secr.getSection() + Commons.SPLITTER + Double.toString(secr.getSalary());
        
        this.txtFileManager.appendRow(row);
    }
    
    //---------------------------------------------------------this method show to us amount of secretary salary
    public String showSalary(Secretary sec) {
        String salary = Double.toString(sec.getSalary());
        return salary;
    }
    
}
