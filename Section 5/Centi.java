public class Centi {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(15,1)) ;
        System.out.println(convertToCentimeters(5));

    }

    public static double convertToCentimeters (int inches)  {

        double centimeters = (inches * 2.54) ;

        return centimeters ;

    }

    public static double convertToCentimeters (int feets, int inches) {

        inches = inches + (feets * 12 ) ;

        return convertToCentimeters(inches) ;

    }

}
