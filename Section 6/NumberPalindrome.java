public class NumberPalindrome {

//
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }



//    -1221 % 10 = -1      -1221 / 10 = -122
//    -122 % 10 = -2       -122 / 10 = -12
//     -12 % 10 = -2       -12 / 10 = -1
//     -1 % 10 = -1        -1 / 10 = 0

//    reverse = 0     reverse = 10 * 0   -1  = -1        mylastdigit = -1
//    reverse = -1    reverse = 10 * -1    -2  = -12        mylastdigit = -2
//    reverse = -12    reverse = 10 * -12 -2  = -122       mylastdigit = -2
//    reverse = -122     reverse = 10 * -122   -1  = -1221        mylastdigit = -1


//  707 % 10 = 7     707 // 10 = 70
//  70 % 10 = 0      70 / 10 = 7
//  7 % 10 = 7       7 / 10 = 0

//    reverse = 0     reverse = 10 * 0   + 7  = 7         mylastdigit = 7
//    reverse = 7    reverse = 10 * 7    + 0  = 70        mylastdigit = 0
//    reverse = 70    reverse = 10 * 70  + 7  = 707        mylastdigit = 7



    public static boolean isPalindrome (int number) {
        int firstNumber = number;
        int reverse = 0;

        while (number != 0) {
            int myLastDigit = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + myLastDigit;
        }

        return (reverse == firstNumber);

    }

}
