public class Worker {



    private String name ;
    private String birthDay ;
    private String endDate ;

    public Worker() {
    }

    public Worker(String name, String birthDay, String endDate) {
        this.name = name;
        this.birthDay = birthDay;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    protected int getAge () {


        System.out.println(name + " born at " + birthDay);
        System.out.println(name + " is " + (2023 - Integer.parseInt(birthDay)) + " years old");
        return 2023 - Integer.parseInt(birthDay) ;

    }

    protected double collectPay () {


        return 15 ;
    }

    protected void terminate (String endDate) {

        this.endDate = endDate ;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }


}
