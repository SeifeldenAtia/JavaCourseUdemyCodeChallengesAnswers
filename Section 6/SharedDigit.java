public class SharedDigit {

//  58    18   80   15
//    58 % 10   8    58/ 10   5

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(-15, 55));
        System.out.println(hasSharedDigit(10, 55));



    }
//
    public static boolean hasSharedDigit (int firstNumber, int secondNumber){

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false ;
        }

        return (firstNumber % 10 == secondNumber % 10 || firstNumber % 10 == secondNumber / 10
        || firstNumber / 10 == secondNumber % 10 || firstNumber / 10 == secondNumber/10
        );


    }
}
