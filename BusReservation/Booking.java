import java.util.*;

public class Booking {
    private String passengerName;
    private int busNo;
    private Date date;

    public int getBusno(){
        return busNo;
    }
    public Date getDate(){
        return date;
    }
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Passanger Name: ");
        passangerName = sc.nextLine();
        System.out.println("Enter the Bus Number: ");
        busNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Date in this format dd-MM-yyyy");
    }
}
