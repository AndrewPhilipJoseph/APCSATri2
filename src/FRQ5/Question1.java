package FRQ5;

public class Question1 {
}

class Ing {

    private String[] words;

    public Ing(String[] input) {
        words = input;
    }

    public void printWords() {
        for (String word : words) {
            if (word.contains("ing")) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String[] testInput = {"Hello", "Testing", "Helping"};
        Ing test = new Ing(testInput);
        test.printWords();
    }

}