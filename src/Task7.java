import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int one = 14;
        int two = 6;
        int three = 16;

        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        }
        else  {
            if (three > one && three > two)
            System.out.println("Число " + three + " самое большое");
        }
    }
}
