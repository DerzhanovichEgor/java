package by.derzhanovich.learn.simpleClassesAndObjects.Task2;
/*Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор инициализирующий члены класса по умолчанию. Добавьте геттеры и сеттеры для полей класса*/
public class Test2 {
    private String test;
    private boolean isItTest;
    public Test2(){
        test = "This is a test String";
        isItTest = true;
    }
   public  Test2(String s, boolean b){
        test = s;
        isItTest = b;
    }

    public String getTest() {
        return test;
    }
    public void setTest(String test){
         this.test = test;
    }

    public boolean isItTest() {
        return isItTest;
    }

    public void setItTest(boolean itTest) {
        isItTest = itTest;
    }
}
