import java.util.Scanner;

public class minAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double min = 0.0 ;
        double max = 0.0 ;
        int dataEntered = 0;

        for (int i = 0; true;i++){
            System.out.println("Hello! Please enter a number");
            try {
                String input = scanner.nextLine();
                double number = Double.parseDouble(input);
                if (i == 0) {
                    min = number;
                    max = number;
                } else {
                    if ( number >= max) {
                        max = number ;
                    }
                    if (number <= min) {
                        min = number ;
                    }
                }
                dataEntered++;
            } catch (NumberFormatException E) {
            break;
            }
        }
        if (dataEntered >0) {
            System.out.println("Your Max number = " + max);
            System.out.println("Your Min Number = " + min);
        } else System.out.println("No Data Entered");
    }
}
