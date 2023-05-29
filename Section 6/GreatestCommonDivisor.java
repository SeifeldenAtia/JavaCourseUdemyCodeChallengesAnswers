public class GreatestCommonDivisor {


    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(153, 81));

    }


    public static int getGreatestCommonDivisor(int first, int second) {
        int num = 0 ;
        if (first < 10 || second < 10) {
            return -1;
        } else if (first < second) {
            for (int i = first; i >= 0; i--) {
                if (second % i == 0 && first % i == 0) {
                    num = i;
                    break;
                }
            }
        } else {
            for (int j = second; j >= 0; j--) {
                if (first % j == 0 && second % j == 0) {
                    num = j;
                    break;

                }
            }

        }
        return num;
    }
}
