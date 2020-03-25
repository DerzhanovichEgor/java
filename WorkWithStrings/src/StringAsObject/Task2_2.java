package StringAsObject;
//2. В строке вставить после каждого символа 'a' символ 'b'.
public class Task2_2 {
    public void insertBafterA(String str){

        System.out.println(str.replaceAll("a","ab"));
    }
}
