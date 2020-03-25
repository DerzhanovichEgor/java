package StringAsObject;
//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.
public class Task2_8 {
    public void findTheLongestWord(String str){
        String[] s = str.split(" ");
        String theLongestWord = "";
        for (int i = 0;  i < s.length; i++) {
            if (s[i].split("").length > theLongestWord.length()) {
                theLongestWord = s[i];
            }
        }
        System.out.println(theLongestWord);

    }
}
