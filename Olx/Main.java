import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        List<Customer> customers=new ArrayList<>();
        List<Admin> admins=new ArrayList<>();
        //Lists of admin and customer
        admins.add(new Admin(1, "han", "han@gmail.com","han" ));
        customers.add(new Customer(customers.size()+1,"ars","ars@gmail.com","ars"));

        //loop to enter the shopping
        while(true){
            System.out.println("Enter 1 for customer and 2 for admin or 0 to exit:");
            int n=sc.nextInt();
            sc.nextLine();
            // login for customers
           if(n==1){
                Customer c=new Customer(null, null, null, null);
                System.out.println("Enter email:");
                String email=sc.nextLine();
                System.out.println("Enter password:");
                String password=sc.nextLine();
                if(c.authentication(customers,email,password)){
                    System.out.println("Logined Successfully");
                }
                else{
                    System.out.println("Not logged in");
                }
            }
            //login for admin
            else if(n==2){
                Admin a=new Admin(null, null, null, null);
                System.out.println("Enter email:");
                String email=sc.nextLine();
                System.out.println("Enter password:");
                String password=sc.nextLine();
                if(a.authentication(admins,email,password)){
                    System.out.println("Logined Successfully");
                }
                else{
                    System.out.println("Not logged in");
                }
            }
            else if(n==0){
                System.out.println("Exit");
                break;
            }
          else{
             System.out.println("Invalid input");
                }

        }

    }
}
