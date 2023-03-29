public class Kitchen {

    Refrigerator refrigerator;
    CoffeeMaker coffeemaker;
    DishWasher dishwasher;

    public void addWater()
    {
        coffeemaker.brewCoffee();
    }

    public void pourMilk()
    {
        refrigerator.orderFood();
    }

    public void loadDishwasher()
    {
        dishwasher.doDishes();
    }

}
