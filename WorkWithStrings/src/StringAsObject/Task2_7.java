package StringAsObject;
//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".
public class Task2_7 {
    public void deleteAllDiplicates(String str){
        StringBuilder sb = new StringBuilder();
        str.replaceAll(" ", "").chars().distinct().forEach(c -> sb.append((char)c));
        System.out.println(sb);
    }
}
