package RestuarantBilling;
import java.util.*;

public class BillingSystem {
    public static MenuItem getMenu(String item,List<MenuItem> menuItems) {
            for(MenuItem m:menuItems){
                if(m.getItem().equalsIgnoreCase(item)){
                    return m;
            }
    }
    return null;
}
public static void getdiscount(int total){
    double discount=0;
    if(total>500){
        discount = total-((total*10)/100);
        System.out.println("Total after discount 10%: "+discount);

    }
    else if(total>300){
        discount = total-((total*5)/100);
        System.out.println("Total after discount 5%: "+discount);

    }
    else
    System.out.println("Total: "+total);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<MenuItem> menu = new ArrayList<>();
        List<Billing> bill=new ArrayList<>();
        menu.add(new MenuItem("Burger", 100));
        menu.add(new MenuItem("Pizza", 300));
        menu.add(new MenuItem("FrenchFries", 60));
        int choice=1;

        while(choice==1){
            MenuItem m=new MenuItem();
            System.out.println("Enter item:");
            String item=sc.next();
             if(m.isAvailable(item,menu)){
                MenuItem selecteditem=getMenu(item,menu);
                System.out.println("Enter quantity:");
                int quantity=sc.nextInt();
                Billing b=new Billing(selecteditem,quantity);
                //System.out.println(b.menuItem.getItem()+" "+b.quantity);
                bill.add(b);
                System.out.println("Do you want to order more:");
                choice=sc.nextInt();
            }

        }
        for(Billing b:bill){
            System.out.println(b);
        }
        int total=0;
        for(Billing b:bill){
             total=total+ b.menuItem.getPrice()*b.quantity;
        }
        getdiscount(total);
        sc.close();
    }
}
