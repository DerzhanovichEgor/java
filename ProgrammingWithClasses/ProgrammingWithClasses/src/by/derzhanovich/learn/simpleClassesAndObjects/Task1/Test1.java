package by.derzhanovich.learn.simpleClassesAndObjects.Task1;
/*Создайте ккласс Test1 с двумя переменными. Добавьте методы вывода на экран и методы изменения этих переменных.
* Добавьте метод, который находит сумму значений  этих переменных, и мето, который находит
* наибольшее значение*/
public class Test1 {
    private int firstVar;
    private int secondVar;

    public int getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(int firstVar) {
        this.firstVar = firstVar;
    }

    public int getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(int secondVar) {
        this.secondVar = secondVar;
    }

    public double getSum(){
        return firstVar + secondVar;
    }
    public int findMaxValue(){
        if(firstVar > secondVar) return firstVar;
        else
            return secondVar;
    }
}
