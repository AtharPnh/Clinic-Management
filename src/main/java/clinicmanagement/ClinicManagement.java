/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clinicmanagement;


import clinicmanagement.commons.TxtFileManager;

/**
 *
 * @author Administrator
 */
public class ClinicManagement {

    public static void main(String[] args) {
        
    TxtFileManager txt = new TxtFileManager("Managers.txt");
    
    TxtFileManager txt2 = new TxtFileManager("Doctors.txt");
    
    TxtFileManager txt3 = new TxtFileManager("Secretarys.txt");
    
    TxtFileManager txt4 = new TxtFileManager("Users.txt");
    
    TxtFileManager txt5 = new TxtFileManager("Patients.txt");
    
    TxtFileManager txt6 = new TxtFileManager("Sections.txt");
    
    TxtFileManager txt7 = new TxtFileManager("Salaries.txt");
    
    
//    System.out.println(txt.getListFromFile());
//    txt.updateRow(1, "neda nadaf~~~9874ljh~~~khanevade~~~100000.0");
//    System.out.println(txt.getListFromFile());
//    System.out.println(txt2.getListFromFile().size());
//    System.out.println(txt3.getListFromFile().size());
//    System.out.println(txt4.getListFromFile().size());
//    System.out.println(txt5.getListFromFile().size());
//    System.out.println(txt6.getListFromFile().size());
//    
//    System.out.println(txt.getListFromFile());
//    System.out.println(txt2.getListFromFile());
//    System.out.println(txt3.getListFromFile());
//    System.out.println(txt4.getListFromFile());
//    System.out.println(txt5.getListFromFile());
//    System.out.println(txt6.getListFromFile());
//    System.out.println(txt6.getListFromFile().size());
//    
//    txt6.deleteRow(1);
//    System.out.println(txt6.getListFromFile());
//    System.out.println(txt6.getListFromFile().size());
//    
//    txt6.deleteRow(1);
//    System.out.println(txt6.getListFromFile());
//    System.out.println(txt6.getListFromFile().size());
//    
//    txt6.deleteRow(1);
//    System.out.println(txt6.getListFromFile());
//    System.out.println(txt6.getListFromFile().size());
//    
//    txt6.deleteRow(1);
//    System.out.println(txt6.getListFromFile());
//    System.out.println(txt6.getListFromFile().size());
    
//    for(int i=0; i<save.length; i++) {
//        System.out.print(save);
//    }
//    
//      String num = "ath~~~5412987";
//
//	String str[] = num.split("~~~");
//	List<String> al = new ArrayList<String>();
//	al = Arrays.asList(str);
//	
//	System.out.println(al.get(0));
//      System.out.println(al.get(1));
//      
//	System.out.println(str.length);
//        System.out.println(al.size());
//        System.out.println(al.indexOf(al.get(0)));
        
//        
//        String managerName="Dr.Green";
//        txt.writeToFile(managerName);
//
//        String managerName2="Dr.Babolkhani";
//        txt.writeToFile(managerName2);
//
//        String managerName3="Dr.BSadeghi";
//        txt.writeToFile(managerName3);
//
//        System.out.print(txt.readData());
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               // new clinicmanagement.add.AddNewSection().setVisible(true);
               
              // new clinicmanagement.add.AddNewDoctor().setVisible(true);
                
                //new clinicmanagement.add.AddNewDoctor().setVisible(true);
                
                //new clinicmanagement.GUI.ManagerForm().setVisible(true);
                
                new clinicmanagement.GUI.StartPage().setVisible(true);
                
            }
        });
    }
}
