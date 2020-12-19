package FRQ2;

public class Restauraunt {


    boolean rsvp;
    int selection;
    String food1;
    String option1;
    String option2;

    public String getFood(int i) {

        switch (i) {
            case 1: this.food1 = "beef"; return "beef";
            case 2: this.food1 = "chicken"; return "chicken";
            case 3: this.food1 = "pasta"; return "pasta";
            default: this.food1 = "fish"; return  "fish";


        }
    }





    /*
    a boolean variable named rsvp
an int variable named selection, where 1 represents "beef", 2 represents "chicken",
3 represents "pasta", and all other values represent "fish"
a String variable named option1
a String variable named option2
     */

    public void hasRSVP() {
        if (rsvp == true) {
            System.out.println("Attending");
        }
        else {
            System.out.println("Not attending");
        }
    }

    public void store() {
        if (rsvp == true) {
            this.option1 = "Thanks for attending, you will be served" + food1;
        }
        else {
            System.out.println("You will not be attending");
        }
    }


    public void compare() {
        if (this.option1.equals(this.option2)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }



    public static void main(String[] args) {
        Restauraunt res = new Restauraunt();
        res.hasRSVP();
        res.getFood(res.selection);
        System.out.println(res.food1);
        res.store();
        res.compare();



    }

}
