package RestuarantBilling;

import java.util.List;

public class MenuItem {
    private String item;
    private int price;

    public MenuItem(String item,int price){
        this.item=item;
        this.price=price;
    }
    MenuItem(){}

    public String getItem(){
        return item;
    }
    public int getPrice(){
        return price;
    }
    public void setItem(String item){
        this.item=item;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public boolean isAvailable(String food,List<MenuItem> menu){
        for(MenuItem m:menu){
            if(m.getItem().equalsIgnoreCase(food)){
                return true;
            }
        }
        return false;
    }
}
