package FRQ3;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FRQ3 {

    ArrayList<String> characters = new ArrayList<>();

    public static void longestStreak(String str) {

        int previousAmount = 0;
        int currentAmount = 1;
        char mostChar = ' ';

        int stringLength = str.length();
        for (int i = 0; i < stringLength-1; i++) {
            char c = str.charAt(i);

            if (c == str.charAt(i+1)) {
                currentAmount++;

                if (previousAmount < currentAmount) {
                    previousAmount = currentAmount;
                    mostChar = c;
                }

            }
            else {
                currentAmount = 1;
            }


        }

        System.out.println(String.valueOf(previousAmount) + " " + String.valueOf(mostChar));

    }






    public static void main(String[] args) {
        longestStreak("CCAAAAATTT!");
        longestStreak("hello world");
    }

}
