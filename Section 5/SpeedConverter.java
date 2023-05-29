public class SpeedConverter {

    public static void main(String[] args) {
        printConversion((1.5));

        printConversion((10.25));

        printConversion((-5.6));

        printConversion((25.42));

        printConversion((75.114));





    }

    public static long toMilesPerHour (double kilometersPerHour){

        long rounded = Math.round(kilometersPerHour);

        long milesPerHour= 0;
        if (rounded < 0){
            milesPerHour = -1l ;
        } else if (rounded > 0) {
            milesPerHour =  Math.round( (kilometersPerHour / 1.609 ) );
        }

        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour){

        if ( kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }


    }





}
