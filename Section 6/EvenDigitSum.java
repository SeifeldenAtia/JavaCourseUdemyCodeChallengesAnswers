public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(2));
    }



    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            return -1 ;
        }

        int evenSum= 0;
            while (number > 0) {

                if ((number % 10) % 2 == 0) {
                    evenSum += (number % 10);
                }
                number = number / 10;

            }

        return  evenSum ;
    }

}
