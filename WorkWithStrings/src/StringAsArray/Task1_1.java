package StringAsArray;
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_1 {
    public String[] camelCaseTo_snake_case() {
        String[] camelCaseArray = new String[]{"camelCase", "hiHowAreYou", "myNameIsEgor", "niceToMeetYou"};
        String[] snake_case_array = new String[camelCaseArray.length];
        for (int i = 0; i < camelCaseArray.length; i++) {
         snake_case_array[i] =  camelCaseArray[i].replaceAll("([^A-Z])([A-Z])", "$1_$2").toLowerCase();
        }
        return snake_case_array;
    }
}
