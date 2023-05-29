public class Main {


    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee( "Seif","1996", "2026" , 18 ,
                "2021" , 167000 , false );


       salariedEmployee.retire() ;
        System.out.println(salariedEmployee);
    }

}
