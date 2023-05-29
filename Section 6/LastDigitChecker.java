public class LastDigitChecker {


//    public static void main(String[] args) {
//        System.out.println(hasSameLastDigit (41, 22, 71));
//        System.out.println(hasSameLastDigit (23, 32, 42));
//        System.out.println(hasSameLastDigit (9, 99, 999));
//
//    }


    public static boolean hasSameLastDigit (int x , int y, int z) {
    if (!isValid(x) || !isValid(y) || !isValid(z) ) {
        return false;
    }

    return ( x % 10 == y % 10 || x % 10 == z % 10 || z % 10 == y % 10);
    }

    public static boolean isValid (int x) {

        return (x >= 10 && x <= 1000);

    }


}
