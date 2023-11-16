package org.example;

public class CoffeeMaker extends Appliances{

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public CoffeeMaker() {

    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }

    }
}
