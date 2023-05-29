public class LeapYear {
    public static void main(String[] args) {


        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));


    }


    public static boolean isLeapYear (int year) {

        if (year <= 9999 && year >= 1  ){

            if ( year % 4 == 0) {
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        return true ;
                    } else return false ;

                }
                return true ;

            } else return false ;









        } else {
            return false ;
        }


    }





}
