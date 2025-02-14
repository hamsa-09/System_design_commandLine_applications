package FactoryMethod;

abstract class Pizza{
    public abstract void prepare();
}
class CheesePizza extends Pizza{
    public void prepare(){
        System.out.println("CheesePizza is ready");
    }
}
class VeggiePizza extends Pizza{
    public void prepare(){
        System.out.println("VeggiePizza is ready");
    }
}
interface PizzaFactory{
    Pizza createPizza();
    }
 class CheesePizzaFactory implements PizzaFactory{
    public Pizza createPizza(){
        return new CheesePizza();
    }
 }
 class VeggiePizzaFactory implements PizzaFactory{
    public Pizza createPizza(){
        return new VeggiePizza();
    }
 }

 class PizzaStore{
    private Pizza pizzaOrder;
    public PizzaStore(PizzaFactory factory){
        pizzaOrder=factory.createPizza();
    }
    public Pizza getPizza(){
        return pizzaOrder;
    }
 }
public class PizzaShop {
    public static void main(String[] args) {
        PizzaFactory cheesefactory=new CheesePizzaFactory();
        PizzaStore cheeseClient=new PizzaStore(cheesefactory);
        Pizza pizza=cheeseClient.getPizza();
        pizza.prepare();
    }
}
