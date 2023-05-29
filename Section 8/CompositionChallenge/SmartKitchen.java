public class SmartKitchen {


    CoffeeMaker brewMaster ;
    DishWasher dishWasher;
    Refrigerator iceBox ;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public SmartKitchen() {

        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();



    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater () {

        brewMaster.setHasWorkToDo(true);
        brewMaster.brewCoffee();
        brewMaster.setHasWorkToDo(false);
    }

    public void pourMilk () {
        iceBox.setHasWorkToDo(true);
        iceBox.orderFood();
        iceBox.setHasWorkToDo(false);
    }

    public void loadDishWasher () {
        dishWasher.setHasWorkToDo(true);
        dishWasher.doWishes();
        dishWasher.setHasWorkToDo(false);
    }

    public void setKitchenState (boolean dish , boolean coffee , boolean fridge) {

     dishWasher.setHasWorkToDo(dish);
     iceBox.setHasWorkToDo(fridge);
     brewMaster.setHasWorkToDo(coffee);
    }

    public void doKitchenWork () {

        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doWishes();

    }







}
