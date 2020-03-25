package by.derzhanovich.learn.main;

import by.derzhanovich.learn.text.Sentence;
import by.derzhanovich.learn.text.Text;
import by.derzhanovich.learn.text.Word;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Header");
      Word word1 = new Word("Hi");
        Sentence sentence = new Sentence();
      sentence.addWord(word1);
        sentence.addWord("my");
        sentence.addWord("name is Egor");
        Text text = new Text(word);
        text.addSentence(sentence);
     //   text.addWord(word);
        System.out.println("Header: " + text.getHeader());
        System.out.println("Text:" + text.getText());

    }
}
