import java.util.ArrayList;

public class Word {

    private String word;

    private ArrayList<String> definitions;

    private String wordType;

    public Word(String word, ArrayList<String> definitions, String wordType) {
        this.word = word;
        this.definitions = definitions;
        this.wordType = wordType;
    }

    //Getters
    public String getWord() {
        return word;
    }

    public ArrayList<String> getDefinitions() {
        return definitions;
    }

    public int getNrOfDefinitions() {
        return definitions.size();
    }

    public String getNthDefinition(int n) {
        return definitions.get(n);
    }

    //Setters
    public void setWord(String w) {
        this.word = w;
    }

    public void setDefinitions(ArrayList<String> defs) {
        this.definitions = defs;
    }

    public void setWordType(String type) {
        this.wordType = type;
    }

    public int addDefinition(String def) {
        this.definitions.add(def);
        return definitions.size()-1;
    }

}
