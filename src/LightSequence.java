import java.awt.*;
import java.math.*;
public class LightSequence {


// attributes not shown


    /** The parameter seq is the initial sequence used for
     * * the light display

     */

    public LightSequence(String seq)

    { /* implementation not shown */ }



    /** Inserts the string segment in the current sequence,

     * starting at the index ind. Returns the new sequence.

     */

    public String insertSegment(String segment, int ind) {

         /* implementation not shown */
        return "";
    }

    /** Updates the sequence to the value in seq

     */

    public void changeSequence(String seq)

    { /* implementation not shown */ }



    /** Uses the current sequence to turn the light on and off

     * for the show

     */

    public void display()
    {
        /* implementation not shown */


    }

    public void alterSeg(String oldSeg, String Seg)
    {
        String newSeg = oldSeg.replaceFirst(Seg, "");

        System.out.println(newSeg); //used for testing purposes

    }

    public double getDistance(double a, double b)

    { return  Math.sqrt((a*a + b*b)); }




}
