public class LargestPrime {




// 21  =   7 * 3 ;
//  21
// 45    5 3 3
// 45 3   15    3    5

    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));

        System.out.println(getLargestPrime (0));

        System.out.println(getLargestPrime (45));

        System.out.println(getLargestPrime (-1));

    }


    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        } else {

            for (int i = 2;i < number ;i++) {
                if (number % i == 0) {
                    number = number / i ;
                   i-- ;
                }
            }

            return number;
        }
    }




}
