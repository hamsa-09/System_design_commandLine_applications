package RestuarantBilling;

public class Billing {
    MenuItem menuItem;
     int quantity;

    public Billing(MenuItem menuItem,int quantity){
        this.menuItem = menuItem;
        this.quantity = quantity;
    }
    public String toString(){
        return "Item: "+menuItem.getItem()+" Quantity: "+quantity+" Price: "+menuItem.getPrice()+" Price of item ordered: "+ menuItem.getPrice()*quantity;
    }
   

}
