import java.util.ArrayList;
import java.util.Scanner;



public class Doctor {
    private int id;
    private String name;
    private Scanner scan = new Scanner(System.in);

    ArrayList <People> nurses = new ArrayList<>();
    ArrayList <People> patients= new ArrayList<>();

    

    public void setter(){
       System.out.println("ENTER ID..");
       id = scan.nextInt();
       scan.nextLine();
       System.out.println("ENTER a NAME");
       name = scan.nextLine();
    }
    
    public int getID(){
        return id;
    }

   public void addNurse(){
    System.out.println("ENTER NURSE NAME");
    String nurseName = scan.nextLine();
    System.out.println("ENTER NURSE ID");
    int nurseID = scan.nextInt();
    scan.nextLine();
    People nurse = new People(nurseID,nurseName);
    nurses.add(nurse);

   }

   public void addPatient(){

        System.out.println("ENTER PATIENT NAME:");
       String patientName  = scan.nextLine();
       System.out.println("ENTER PATIENT ID:");
       int patientID = scan.nextInt();
       scan.nextLine();
       People patient = new People(patientID,patientName); 
       patients.add(patient);
   }

   public void show(){
        System.out.println(String.format("ID: %s, NAME: %s", id,name));

        System.out.println("-----------------");

        for(People temp: nurses){
                System.out.println(temp.show());
        }

        System.out.println("----------------");

        
        for(People temp: patients){
            System.out.println(temp.show());
        }
    }

}
