package FRQ9;

public class NumberSystem

{

    /** Precondition: a and b are positive integers.

     * Returns the greatest common factor of a and b, as described in part (a).

     */

    public static int gcf(int a, int b)

    {
        if (a%b == 0) {return b;}
    return gcf(b, a%b);

    }



    /** Precondition: numerator and denominator are positive integers.

     * Reduces the fraction numerator / denominator

     * and prints the result, as described in part (b).

     */

    public static void reduceFraction(int numerator, int denominator)

    {
        if (gcf(numerator, denominator) == denominator)
        {
            System.out.println(numerator + " over " + denominator + " reduces to " + String.valueOf(numerator/denominator));
        }

        int greatestCommonFactor = gcf(numerator, denominator);
        System.out.println(numerator + " over " + denominator + " reduces to " + numerator/greatestCommonFactor + " over " + denominator/greatestCommonFactor);


    }

}
