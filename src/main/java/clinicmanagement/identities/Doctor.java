/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.identities;

/**
 *
 * @author Administrator
 */
public class Doctor {
    
    private String name;
    private String specialty;
    private double amountOfVisits;
    private double amountOfSalary;

    public Doctor() {
    }

    public Doctor(String name, String specialty, double amountOfVisits, double amountOfSalary) {
        this.name = name;
        this.specialty = specialty;
        this.amountOfVisits = amountOfVisits;
        this.amountOfSalary = amountOfSalary;
    }

    public double getAmountOfSalary() {
        return amountOfSalary;
    }

    public void setAmountOfSalary(double amountOfSalary) {
        this.amountOfSalary = amountOfSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getAmountOfVisits() {
        return amountOfVisits;
    }

    public void setAmountOfVisits(double amountOfVisits) {
        this.amountOfVisits = amountOfVisits;
    }
    
    
    
}
