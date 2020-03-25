package StringAsObject;
//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task2_5 {
    private int count;
    public int howMuchSymbolAInString(String str) {
            char[] array = str.toCharArray();
        for (char i = 0; i < array.length; i++) {
            if(array[i] == 97|| array[i] == 224)
                count++;
            }

        return count;
    }
}
