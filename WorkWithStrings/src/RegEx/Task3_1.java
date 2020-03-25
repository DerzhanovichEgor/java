package RegEx;
//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task3_1 {
    public void task3_1(String str) {
        //System.out.println(Arrays.toString(sortParagraphsByAmountOfSentences(str)));
        //sortSentencesAsc(str);
    }





    public void sortSentencesAsc(String str) {
         String a = str.replaceAll("(\\n*)(,*)(\\(*)(\\)*)(\"*)","");

        String[] sentences = a.split("[.?!]+");
        for (int i = 0; i < sentences.length; i++) {
                    String[] s = sentences[i].split(" ");
            for (int j = 0; j < s.length ; j++) {
                for (int k = 0; k < s.length; k++) {


                    if (s[j].split("").length < s[k].split("").length) {
                        String temp = s[j];
                        s[j] = s[k];
                        s[k] = temp;
                    }
                }
            }

           System.out.println(Arrays.toString(s));

        }


    }

    public String[] sortParagraphsByAmountOfSentences(String str){
        String pattern = "(?<=(\\r\\n|\\r|\\n))([ \\t]*$)";
        String[] paragraphs = Pattern.compile(pattern,Pattern.MULTILINE).split(str);
        for (int i = 0; i < paragraphs.length; i++) {
            for (int j = i + 1; j < paragraphs.length; j++) {
                if (paragraphs[i].split("[!.?]+").length > paragraphs[j].split("[!.?]+").length) {
                    String temp = paragraphs[i];
                    paragraphs[i] = paragraphs[j];
                    paragraphs[j] = temp;
                }
            }

        }
        return paragraphs;
    }

}
