/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.identities;

/**
 *
 * @author Administrator
 */
public class Manager {
    
    private String name;
    private String password;
    private double salary;
    private String clinic;
    private String section;
    
    

    public Manager() {
    
    }

    public Manager(String name, String password, double salary, String clinic, String section) {
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.clinic = clinic;
        this.section = section;
    }
    
    // -------------------------------------- setters and getters
    public String getName() {    
        return name;
    }

    public void setName(String name) {    
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }
    
    public String getSection() {
        return section;
    }
    
    
    
    // -------------------------------------- this method add a section
    public void setSection(String section) {
        this.section = section;
    }
       
    
    // -------------------------------------- this method delete a section
    
    public void deleteSection(Section sectin) {
        
        
    }
    
    // -------------------------------------- this method add a doctor
    public void addDoctor(Doctor doctor){
  
        
    }
    
}
