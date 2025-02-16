import java.text.SimpleDateFormat;
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
        passengerName = sc.nextLine();
        System.out.println("Enter the Bus Number: ");
        busNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Date in this format dd-MM-yyyy");
        String dateString=sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=sdf.parse(dateString);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean isAvailable(List<Bus> buses,List<Booking> bookings){
        int busCapacity=0;
        for(Bus b:buses){
            if(b.getBusno()==busNo){
                busCapacity=b.getCapacity();
            }
        }
        int totalBooked=0;
        for(Booking booking:bookings){
            if(booking.getBusno()==busNo && booking.getDate().equals(date)){
                totalBooked++;
            }

        }
        return totalBooked<busCapacity?true:false;
    }
}
