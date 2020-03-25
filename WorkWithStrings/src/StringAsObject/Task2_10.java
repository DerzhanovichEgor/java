package StringAsObject;
//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.
public class Task2_10 {
    public void determineAmountOfSentences(String str) {

        System.out.println(str.split("[!\\.\\?]").length);

    }
}
