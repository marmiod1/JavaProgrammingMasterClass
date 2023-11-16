package org.example;

public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeMaker) {
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        refrigerator.orderFood();
        coffeeMaker.brewCoffee();
        dishWasher.doDishwasher();
    }


}
