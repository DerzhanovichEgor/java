package by.derzhanovich.learn.text;

public class Text {
    private String header = "";
    private String text = "";

    public Text(Word word){
        header = word.getWord();
    }
    public Text(Sentence sentence){
        header = sentence.getSentence();
    }

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }

    public void addWord(Word word){
        text +=word.getWord();
    }
    public void addSentence(Sentence sentence){
        text += sentence.getSentence();
    }
}
