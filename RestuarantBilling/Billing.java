package RestuarantBilling;

public class Billing {
    MenuItem menuItem;
     int quantity;
    Billing(){}
    public Billing(MenuItem menuItem,int quantity){
        this.menuItem = menuItem;
        this.quantity = quantity;
    }
    public String toString(){
        return "Item: "+menuItem.getItem()+" Quantity: "+quantity+" Price: "+menuItem.getPrice()+" Price of item ordered: "+ menuItem.getPrice()*quantity;
    }
    public  void getdiscount(int total){
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


}
