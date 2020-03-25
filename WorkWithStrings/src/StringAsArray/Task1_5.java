package StringAsArray;
//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить
public class Task1_5 {
    public void removeExtraSpaces(String str){
        System.out.println(str.replaceAll("\\s+"," ").trim().replaceAll("(\\s,)",","));
    }
}
