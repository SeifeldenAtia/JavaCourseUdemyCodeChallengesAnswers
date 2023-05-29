public class NumberToWords {
    
    public static void main(String[] args) {
        System.out.println(reverse(15));
        System.out.println(reverse(1552));
        System.out.println(reverse(-1552));
        System.out.println(reverse(0));
        System.out.println(reverse(5));

        numberToWords(1000);
        numberToWords(-12);
        numberToWords(57812);
        numberToWords(57810);

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(100));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5));
        System.out.println(getDigitCount(5210));
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            int deference = getDigitCount(number) - getDigitCount(reverseNumber) ;

            for (int i = 0; true; i++) {
                int remainder = reverseNumber % 10;

                switch (remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                }

                reverseNumber = reverseNumber / 10;

                if (reverseNumber == 0) {
                    break;
                }
            }
            for (int i = 1; i <= deference;i++){
                System.out.println("Zero");
            }
        }
    }
    public static int reverse (int x) {
        int y = 0 ;

        for (int i = 0 ;x != 0; i++){
            y = (y*10) + x%  10 ;
            x = x/10 ;
        }
        return y;
    }
    public static int getDigitCount (int number) {
        int countDigits = 0;

        if (number < 0) {
            return -1 ;
        } else if (number == 0) {
            return 1;
        }
         else {
                for (int i = 0; number > 0 ;i++){
                    number = number / 10 ;
                    countDigits++;
                }
        }
        return countDigits;
    }
}
