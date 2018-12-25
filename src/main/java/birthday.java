import java.util.Random;


public class birthday {
    public static String helenBday () {
        Random rand = new Random();
        int n = rand.nextInt(1000000000);

        if (n==6654) {
            return ":tada: CONGRATULATIONS YOU GOT THE SECRET NUMBER Helen's birthday is March 29th :)";
        } else {
            return "you didn't get the secret number hahahhahaah get rekt scrub :tingers:";
        }
    }

}
