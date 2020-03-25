package StringAsObject;
//6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Task2_6 {
    public StringBuilder getNewStringByDoublingEachSymbol(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        return sb;
    }
}
