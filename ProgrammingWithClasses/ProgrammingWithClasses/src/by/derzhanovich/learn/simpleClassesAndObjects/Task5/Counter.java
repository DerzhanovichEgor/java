package by.derzhanovich.learn.simpleClassesAndObjects.Task5;

import java.util.Random;

/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единиц в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличеня и уменьшения состояния и метод позволяющиее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */
public class Counter {
    private int curentState;
    private int maxValue;
    private int minValue;

    public Counter(){
        this.curentState = 2;
        this.maxValue = 9;
        this.minValue = 0;
    }

    public Counter(int maxValue, int minValue) {
        this.curentState = minValue;//текущему состоянию присваиваем начальную позицию
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public void getCurentState() {
        System.out.println("Текущее состояние счетчика равно: " + curentState);
    }
    public void increase(){
        if(curentState >= maxValue){//если счетчик доходит до последней позиции то он возвращается начало
            curentState = minValue;
        }else
            curentState++;
    }
    public void decrease(){
        if(curentState <= minValue){
            curentState = maxValue;
        }else
        curentState--;
    }

}
class Programm{
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.getCurentState();
        counter.increase();
        counter.getCurentState();
        counter.decrease();
    }
}
