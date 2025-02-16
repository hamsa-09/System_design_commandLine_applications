package DocterPatient;
import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void getPatient(List<Patient> patient) {

    System.out.println("Enter email:");
    String email = sc.next();
    for(Patient p:patient){
    if(p.getEmail().equals(email)){
        System.out.println("Patient found");
        return;
    }
    else{
        System.out.println("Enter name:");
        String name = sc.next();
        String password=sc.next();
        patient.add(new Patient(patient.size()+1,name,email,password));
        return;
    }
    }
    }
    public static Doctor getSpecialist(List<Doctor> docList,String specialist){
        for(Doctor d:docList){
            if(d.getSpecialist().equals(specialist)){
                return d;
            }
        }
        return null;
    }

    public static void displayDocters(List<Doctor> doctors) {
        System.out.println("DocterId  "+"Name  "+"Specialist  "+"DateList  ");
        for(Doctor doc:doctors){

            System.out.println(doc.getUserId()+"        "+doc.getName()+"    "+doc.getSpecialist()+"       "+doc.getDateList());
        }
    }
    public static void main(String[] args) {

        List<Doctor> doctorList = new ArrayList<>();
        List<Patient> patientList=new ArrayList<>();
        List<Prescription> prescriptions=new ArrayList<>();
        List<MedicalRecord> medicalRecords=new ArrayList<>();

        doctorList.add(new Doctor(1,"han" , "han@gmail.com","han" ,"cardio",Arrays.asList("2025-03-21", "2025-04-09")));
        doctorList.add(new Doctor(2,"ars" , "ars@gmail.com","ars","ENT_spl", Arrays.asList("2025-05-10", "2025-06-15")));
        displayDocters(doctorList);

        patientList.add(new Patient(patientList.size()+1,"jhon","j@gamil.com","jhon"));
        patientList.add(new Patient(patientList.size()+1,"smith","s@gamil.com","smith"));

        while(true){
            System.out.println("Enter 1 to book appointment");
            System.out.println("Enter 2 to view MedicalRecord");
            System.out.println("Enter 3 to view Prescription");
            System.out.println("Enter 4 to get Bill");
            int option=sc.nextInt();
            switch(option){
                case 1:
                System.out.println("Enter patient details:");
                getPatient(patientList);
                System.out.println("Enter Specialist:");
                String specialist=sc.next();
                Doctor requireDoctor=getSpecialist(doctorList,specialist);
                if(requireDoctor==null){
                    System.out.println("Enter date:");
                    String date=sc.next();
                  

                }
                else{
                    System.out.println("Specialist is not available");
                }



            }
        }


    }

}
