package by.derzhanovich.learn.text;

public class Sentence {
    private String sentence = "";

    public void addWord(Word word){
        sentence += " " + word.getWord();

    }
    public void addWord(String s){
        sentence += " " + s;
    }

    public String getSentence() {
        return sentence;
    }
}
