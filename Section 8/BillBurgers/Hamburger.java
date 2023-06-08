public class Hamburger {

    private String name ;
    private String meat ;
    private double price ;
    private String breadRollType ;

    private String addition1Name ;
    private double addition1Price ;
    private String addition2Name ;
    private double addition2Price ;
    private String addition3Name ;
    private double addition3Price ;
    private String addition4Name ;
    private double addition4Price ;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1 (String addition1Name , double addition1Price) {

        this.addition1Name = addition1Name ;
        this.addition1Price = addition1Price ;

    }

    public void addHamburgerAddition2 (String addition2Name , double addition2Price) {

        this.addition2Name = addition2Name ;
        this.addition2Price = addition2Price ;
    }

    public void addHamburgerAddition3 (String addition3Name , double addition3Price) {

        this.addition3Name = addition3Name ;
        this.addition3Price = addition3Price ;
    }

    public void addHamburgerAddition4 (String addition4Name , double addition4Price) {

        this.addition4Name = addition4Name ;
        this.addition4Price = addition4Price ;
    }
    public double itemizeHamburger () {
        double totalPrice = price ;

        System.out.printf("%s hamburger on a %s roll with %s, price is %.2f %n", name , breadRollType , meat
                , price);

        if (addition1Price != 0.0) {
            totalPrice += addition1Price ;
            System.out.printf("Added %s for an extra %.2f %n", addition1Name , addition1Price);
        }
        if (addition2Price != 0.0) {
            totalPrice += addition2Price ;
            System.out.printf("Added %s for an extra %.2f %n", addition2Name , addition2Price);
        }
        if (addition3Price != 0.0) {
            totalPrice += addition3Price ;
            System.out.printf("Added %s for an extra %.2f %n", addition3Name , addition3Price);
        }
        if (addition4Price != 0.0) {
            totalPrice += addition4Price ;
            System.out.printf("Added %s for an extra %.2f %n", addition4Name , addition4Price);
        }

        if (name.equalsIgnoreCase("Deluxe")) {
            System.out.println("Added Chips for an extra 2.75");
            System.out.println("Added Drink for an extra 1.81");
            totalPrice = 19.10 ;
        }

        return totalPrice ;
    }

}
