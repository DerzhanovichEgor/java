package StringAsArray;
//3. В строке найти количество цифр.
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_3 {
    public void getAllDigitsFromString(String str){
        System.out.println((str.replaceAll("[^0-9]","").toCharArray().length));


    }
}
