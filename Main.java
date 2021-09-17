import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
        Scanner scan = new Scanner(System.in);


        while(true){
            String selection = scan.nextLine();
            if(selection.equals("1")){
                Doctor doctor = new Doctor();
                doctor.setter();
                doctorList.add(doctor);

            }
            else if(selection.equals("2")){
                System.out.println("ENTER the ID of the DOCTOR : ");
                int id = scan.nextInt();
                scan.nextLine();
                for(int i = 0;i<doctorList.size();i++){
                   if( doctorList.get(i).getID()==id){
                       doctorList.get(i).addNurse();
                   }
                }
            }
            else if(selection.equals("3")){
                System.out.println("ENTER the ID of the DOCTOR : ");
                int id = scan.nextInt();
                scan.nextLine();
                for(int i  = 0;i<doctorList.size();i++){
                    if(doctorList.get(i).getID() == id){
                        doctorList.get(i).addPatient();
                    }
                }
            }
            else if (selection.equals("4")){
                System.out.println("INFORMATION:");
                for(Doctor temp: doctorList){
                    temp.show();
                }
            }
            else{
                scan.close();
                break;
            }
           
        }
    
    }
         
}  


    

