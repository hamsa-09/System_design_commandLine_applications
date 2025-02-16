import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Bus> buses = new ArrayList<>();
        List<Booking>  bookings = new ArrayList<>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,2));
        buses.add(new Bus(3,false,2));

        int option=1;
        while(option!=0){
            System.out.println("Enter the 1 to book and 0 to exit:");
            option=sc.nextInt();
            if(option==1){
               Booking booking=new Booking();
               if(booking.isAvailable(buses,bookings)){
                bookings.add(booking);
                System.out.println("----Your booking is done-----");
               }
               else{
                System.out.println("-------Bus is full,wanna try another bus?--------");
               }
            }
        }
        System.out.println("--Thanks for booking");
        sc.close();
    }

}
