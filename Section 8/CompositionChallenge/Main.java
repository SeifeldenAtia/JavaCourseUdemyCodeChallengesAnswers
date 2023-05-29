public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen() ;

        smartKitchen.getIceBox().setHasWorkToDo(false);
        smartKitchen.getIceBox().orderFood();

        smartKitchen.loadDishWasher();


        System.out.println("-------------------");


        smartKitchen.setKitchenState(true,false,true);
        smartKitchen.doKitchenWork();


    }
}
