/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.manage;

import clinicmanagement.commons.Commons;
import clinicmanagement.commons.TxtFileManager;
import clinicmanagement.identities.Doctor;
import clinicmanagement.identities.Section;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ManageSections {

    private TxtFileManager txtFileManager;

    public ManageSections() {
        
        /**
         * In this constructor we create a managers file with TxtFileManager class to store data.
         */
        
        this.txtFileManager=new TxtFileManager("Sections.txt");
    }
    
    public void insert(Section section) {
        
        String row = section.getName() + Commons.SPLITTER + section.getType();
        
        this.txtFileManager.appendRow(row);
    }
    
    private Section stringToSection(String row){
        
        Section section = new Section();
        
        /**
         * in below function we split username and password by splitter and store them in an ArrayList
         */
        
       // ArrayList<String> save = new ArrayList<>(Arrays.asList(row.split(Commons.SPLITTER)));       
        
        String str[] = row.split("~~~");
	List<String> save = new ArrayList<String>();
	save = Arrays.asList(str);
	
        for(int i=0; i<save.size(); i++) {
            
            section.setName(save.get(0));
            section.setType(save.get(1));
            //section.setSecretary();
            
        }	
        
        return section;
    }
    
    public ArrayList<Section> ListOfSections(){
        
        ArrayList<Section> sections = new ArrayList<>();
        //first we save all of doctors in doctors file in an ArrayList<String>
        ArrayList<String> save = this.txtFileManager.getListFromFile();
        
        /** in this function we set an object from User class that we get by stringToUser()
        * method from save list in i index in list ArrayList
        */
        
        for(int i=0; i<save.size(); i++) {
            sections.add(stringToSection(save.get(i)));
        }       
        return sections;
    }

}
