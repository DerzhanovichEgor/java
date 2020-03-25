package StringAsObject;
//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Task2_4 {
    public void makeWordFromOtherWord() {
        String s = "информатика";
        char[] array = s.toCharArray();
        String str = "";// = s.copyValueOf(array,7,1) + s.copyValueOf(array,3,1) +
             //   s.copyValueOf(array,4,1) + s.copyValueOf(array,7,1);
       // System.out.println(str        );
        System.out.println(str
                .concat(s.copyValueOf(array,7,1))
                .concat(s.copyValueOf(array,3,1))
                .concat(s.copyValueOf(array,4,1))
                .concat(s.copyValueOf(array,7,1)));

    }
}
