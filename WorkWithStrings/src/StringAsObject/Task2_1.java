package StringAsObject;
//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Task2_1 {
    private int amountOfSpaces;
    private int count;

    public int findTheBiggestSequenceOfSpaces(String str){
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 32){
                count++;
                if(amountOfSpaces < count)
                amountOfSpaces = count;
            }else{
                count = 0;
            }
        }
        return amountOfSpaces;

    }
}
