public class Refrigerator {

    private boolean hasWorkToDo ;


    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Refrigerator() {
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood () {
        System.out.println(hasWorkToDo ? "Refrigerator is on" : "Refrigerator is off");
    }

}
