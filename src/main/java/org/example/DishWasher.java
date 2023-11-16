package org.example;

public class DishWasher extends Appliances{

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public DishWasher() {

    }

    public void doDishwasher() {
        if(hasWorkToDo) {
            System.out.println("Washing the dishes ");
        }
        hasWorkToDo = false;
    }

}
