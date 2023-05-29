public class CoffeeMaker {


    private boolean hasWorkToDo ;


    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public CoffeeMaker() {
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee () {
        System.out.println(hasWorkToDo ? "Coffee Maker is on":"Coffee Maker is off");
    }




}
