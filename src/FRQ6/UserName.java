package FRQ6;

import java.util.ArrayList;

public class UserName

{

// The list of possible user names, based on a user’s first and last names and initialized by the constructor.

    private ArrayList<String> possibleNames = new ArrayList<String>();

    /** Constructs a UserName object as described in part (a).

     * Precondition: firstName and lastName have length greater than 0

     * and contain only uppercase and lowercase letters.

     */

    public UserName(String firstName, String lastName)

    {

        for (int i = -1; i < firstName.length(); i++) {
            String addedPart = firstName.substring(0, i+1);
           possibleNames.add(lastName+addedPart);
        }


    }



    /** Returns true if arr contains name, and false otherwise. */

    public boolean isUsed(String name, String[] arr)
    {
        for (String singleName : arr) {
        if (name.equals(singleName)) return true;
    }
    return false;
    }



    /** Removes strings from possibleNames that are found in usedNames as described in part (b).

     */

    public void setAvailableUserNames(String[] usedNames) {
        ArrayList<String> temp = new ArrayList<String>();
     for (int i = 0; i < possibleNames.size(); i++) {


         if (isUsed(possibleNames.get(i), usedNames)) {
             temp.add(possibleNames.get(i));
         }

     }
        for (String name : temp) {
            possibleNames.remove(name);
        }

    }


    public static void main(String[] args) {
        String[] usedNames = {"SmithJohn", "SmithJoh", "SmithJo"};
        UserName user = new UserName("John", "Smith");
        user.setAvailableUserNames(usedNames);
       System.out.println(user.possibleNames);
    }

}
