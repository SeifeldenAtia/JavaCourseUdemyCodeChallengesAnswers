public class DishWasher {

    private boolean hasWorkToDo ;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public DishWasher() {
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doWishes () {
        System.out.println(hasWorkToDo ? "Dishwasher is on ":"Dishwasher is off");
    }

}
