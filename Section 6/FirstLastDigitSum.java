public class FirstLastDigitSum {


//    public static void main(String[] args) {
//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(10));
//        System.out.println(sumFirstAndLastDigit(-10));
//
//
//    }



    public static int sumFirstAndLastDigit (int number) {

        if (number < 0){
            return -1;
        }

        int firstDigit ;
        int lastDigit = number % 10 ;

        while (true) {
            if ( number < 10){
            firstDigit = number ;
            break;
            }
            number = number / 10 ;
        }

        return firstDigit + lastDigit ;
    }




}
