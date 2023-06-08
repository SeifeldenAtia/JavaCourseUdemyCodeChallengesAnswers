public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name ;

    private double healthyExtra1Price;

    private String healthyExtra2Name ;

    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1 (String healthyExtra1Name , double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name ;
        this.healthyExtra1Price = healthyExtra1Price ;

    }

    public void addHealthyAddition2 (String healthyExtra2Name , double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name ;
        this.healthyExtra2Price = healthyExtra2Price ;
    }

    @Override
    public double itemizeHamburger() {
       double total = super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
       if (healthyExtra1Price > 0) {
           System.out.printf("Added %s for an extra %.2f %n", healthyExtra1Name , healthyExtra1Price);
       }
        if (healthyExtra2Price > 0) {
            System.out.printf("Added %s for an extra %.2f %n", healthyExtra2Name , healthyExtra2Price);
        }
        return total ;
    }

}
