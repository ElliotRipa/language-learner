import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<>();

        words = FileHelper.readLanguage("tokipona.txt");

        words.add(new Word("Mi", "I", "Pronoun"));
        words.add(new Word("Sine", "You", "Pronoun"));
        words.add(new Word("Ona", "They", "Pronoun"));
        words.add(new Word("Ni", "This", "Pronoun"));

        System.out.println(Quizzer.ofFourWords(words));

    }
}