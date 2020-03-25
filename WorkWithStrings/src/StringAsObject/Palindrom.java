package StringAsObject;
//3. Проверить, является ли заданное слово палиндромом
public class Palindrom {
    private int count;
    private boolean isPalindrome = false;
    public boolean isPalindrom(String str){
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(array[i] == array[array.length-i-1]){
                count++;
                        if(count == array.length/2){
                        isPalindrome = true;
                        }
            }else
                return false;
        }
        return isPalindrome;
    }
}
