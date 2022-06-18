/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.identities;


import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Clinic {
    
    private String name;
    private Manager manager;
    private String[] type={"boarding", "normal"};
    private ArrayList<Section> sections;

    public Clinic() {
    }

    public Clinic(String name, Manager manager, String[] type, ArrayList<Section> sections) {
        this.name = name;
        this.manager = manager;
        this.type = type;
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
 
    
}
