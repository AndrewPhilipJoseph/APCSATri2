package FRQ4;

import java.util.ArrayList;

public class Passgen {
}

class PasswordGenerator {

    private int digits;
    private String prefix;

    private ArrayList<String> passwords = new ArrayList<>();
    private int numOfPasswords;

    public PasswordGenerator(int digits, String prefix)
    {
    this.digits = digits;
    this.prefix = prefix;
    numOfPasswords = 0;
    }

    public PasswordGenerator(int digits)
    {
        this.digits = digits;
        this.prefix = "A";
        numOfPasswords = 0;
    }


    public void pwGen() {
        passwords.add(numOfPasswords, prefix + ".");

        for (int i = 0; i < digits; i++) {

            passwords.set(numOfPasswords, (passwords.get(numOfPasswords) + (String.valueOf((int) (Math.random()*10)))));

        }

        numOfPasswords++;

    }


    public void readPassword(int index) {
        System.out.println(String.valueOf(passwords.get(index-1)));
    }


    public void pwCount()
    {
        System.out.println(String.valueOf(numOfPasswords));
    }

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(6);
        pw1.pwGen();
        pw1.pwCount();
        pw1.readPassword(1);
    }

}



