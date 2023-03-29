public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishwasher().setHasWorkToDo(true);
//        kitchen.getCoffeemaker().setHasWorkToDo(true);
//        kitchen.getRefrigerator().setHasWorkToDo(true);
//
//        kitchen.getDishwasher().doDishes();
//        kitchen.getRefrigerator().orderFood();
//        kitchen.getCoffeemaker().brewCoffee();


        kitchen.setKitchenState(true, false,true);
        kitchen.doKitchenWork();

    }

}
