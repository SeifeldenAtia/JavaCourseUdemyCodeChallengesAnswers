public class Employee extends Worker {


    private long employeed ;
    private String hireDate ;


    public Employee() {
    }

    public Employee(String name, String birthDay, String endDate, long employeed, String hireDate) {
        super(name, birthDay, endDate);
        this.employeed = employeed;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeed=" + employeed +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
