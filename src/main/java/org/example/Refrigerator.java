package org.example;

public class Refrigerator extends Appliances{

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public Refrigerator() {

    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("There is food to order");
        }
        hasWorkToDo = false;
    }

}
