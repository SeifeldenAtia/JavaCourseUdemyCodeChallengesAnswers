public class SalariedEmployee extends Employee{

    private  double annualSalay ;
    private boolean isRetired ;


    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String birthDay, String endDate, long employeed, String hireDate,
                            double annualSalay, boolean isRetired) {
        super(name, birthDay, endDate, employeed, hireDate);
        this.annualSalay = annualSalay;
        this.isRetired = isRetired;
    }

    public void retire () {



        System.out.println(getName() + " will retire at " + (super.getAge() + 2023));
        System.out.println("");


    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalay=" + annualSalay +
                ", isRetired=" +(( isRetired ) ? " Yes" :" No" )  +
                '}';
    }
}
