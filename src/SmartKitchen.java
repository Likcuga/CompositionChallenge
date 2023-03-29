public class SmartKitchen {

    private Refrigerator refrigerator;
    private CoffeeMaker coffeemaker;
    private DishWasher dishwasher;

    public SmartKitchen()
    {
        refrigerator = new Refrigerator();
        coffeemaker = new CoffeeMaker();
        dishwasher = new DishWasher();
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public CoffeeMaker getCoffeemaker() {
        return coffeemaker;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag)
    {
        coffeemaker.setHasWorkToDo(coffeeFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
        dishwasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork()
    {
        coffeemaker.brewCoffee();
        refrigerator.orderFood();
        dishwasher.doDishes();
    }

}

class Refrigerator
{
   private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood()
   {
       if(hasWorkToDo)
       {System.out.println("Ordering food!");
           hasWorkToDo = false;}
   }

}

class DishWasher
{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes()
    {
        if(hasWorkToDo)
        {System.out.println("Doing Dishes");
            hasWorkToDo = false;}
    }

}

class CoffeeMaker
{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee()
    {
        if(hasWorkToDo)
        {System.out.println("Brewing Coffee");
            hasWorkToDo = false;}
    }
}
