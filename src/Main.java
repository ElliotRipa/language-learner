import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> defs = new ArrayList<>();
        defs.add("Cool thing");

        Word w1 = new Word("Yes", defs, "Noun");

        System.out.println(w1.getWord());
        System.out.println(w1.getDefinitions());

    }
}