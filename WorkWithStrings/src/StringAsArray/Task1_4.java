package StringAsArray;
//4. В строке найти количество чисел.
import java.util.Arrays;

public class Task1_4 {
    public void findAmountOfNumbers(String str){
        System.out.println("Amount of numbers in given String:"
                + (str.replaceAll("[^0-9]+"," ").trim().split(" ").length));
    }
}
