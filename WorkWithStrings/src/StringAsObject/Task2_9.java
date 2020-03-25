package StringAsObject;
//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.
public class Task2_9 {
    public void getAmountOfLowerAndUpperCaseSymbols(String str){
        System.out.println("В данной строке " + str.replaceAll("[^a-z]","").toCharArray().length + " строчных(маленьких) символа(ов)");
        System.out.println("В данной строке " + str.replaceAll("[^A-Z]","").toCharArray().length + " прописных(больших) символа(ов)");

    }
}
