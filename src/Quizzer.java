import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quizzer {

    public static boolean ofFourDefinitions(ArrayList<Word> words) {

        Random rand = new Random();

        ArrayList<Word> fourWords = generateFourWords(words);

        int correctAnswer = rand.nextInt(4);

        System.out.println();
        System.out.println("Which definition fits the word " + fourWords.get(correctAnswer).getWord() + "?");
        System.out.println();
        System.out.println("1. " + fourWords.get(0).getDefinitions());
        System.out.println("2. " + fourWords.get(1).getDefinitions());
        System.out.println("3. " + fourWords.get(2).getDefinitions());
        System.out.println("4. " + fourWords.get(3).getDefinitions());
        System.out.println(">");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt() == correctAnswer + 1;
    }


    public static boolean ofFourWords(ArrayList<Word> words) {

        Random rand = new Random();

        ArrayList<Word> fourWords = generateFourWords(words);

        int correctAnswer = rand.nextInt(4);

        System.out.println();
        System.out.println("Which word fits the definition " + fourWords.get(correctAnswer).getDefinitions() + "?");
        System.out.println();
        System.out.println("1. " + fourWords.get(0).getWord());
        System.out.println("2. " + fourWords.get(1).getWord());
        System.out.println("3. " + fourWords.get(2).getWord());
        System.out.println("4. " + fourWords.get(3).getWord());
        System.out.println(">");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt() == correctAnswer + 1;
    }


    public static ArrayList<Word> generateFourWords(ArrayList<Word> words) {

        Random rand = new Random();

        ArrayList<Integer> wordIndices = new ArrayList<>();

        for(int i = 0 ; i < 4 ; i++) {
            int num = rand.nextInt(words.size());
            while (wordIndices.contains(num)) {
                num = rand.nextInt(words.size());
            }
            wordIndices.add(num);
        }

        ArrayList<Word> result = new ArrayList<>();

        for (Integer index : wordIndices) {
            result.add(words.get(index));
        }

        return result;
    }

}
