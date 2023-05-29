public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));
        System.out.println(canPack(5, 3, 24));
    }




    public static boolean canPack (int bigCount , int smallCount, int goal) {

        if ( bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {


            if (goal >= 5 && bigCount > 0 ) {
                int maxBigUsed = bigCount * 5  ;



                if (goal >= maxBigUsed) {
                    goal = goal - maxBigUsed;

                } else {
                    int remainer = goal % 5 ;
                    int neededBig = (goal - remainer) / 5;


                    goal = goal - (5 * neededBig);

                }

            }
            goal = goal - smallCount ;

            if (goal <= 0) {
                return true;

            } else {
                return false ;
            }
        }
    }
}
