package by.derzhanovich.learn.simpleClassesAndObjects.Task6;

/*
*Составьте описание класса для представления времени. Предусмотрите возможности установкки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой допустимых вводимых значений. В Случае недопустимых
  *  поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут, секунд.*/

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    Time(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    Time(int hours,int minutes,int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }


    public void setHours(int hours) {
        if(hours < 24 && hours >= 0 ) {
            this.hours = hours;
        }else
            this.hours = 0;
    }

    public void setMinutes(int minutes) {
        if(minutes < 60 && minutes >= 0 ) {
            this.minutes = minutes;
        }else
            this.minutes = 0;
    }

    public void setSeconds(int seconds) {
        if(seconds < 60 && seconds >= 0 ) {
            this.seconds = seconds;
        }else
            this.seconds = 0;
    }

    public void changeTime(int hours,int minutes,int seconds){

        this.seconds +=seconds;
        for(int i = seconds; i > 0; i = i - 60){
            if (this.seconds >= 60) {
                this.minutes += 1;
                if (this.minutes >= 60) {
                    this.hours += 1;
                    if (this.hours >= 24) {
                        this.hours -= 24;
                    }
                    this.minutes = this.minutes - 60;
                }
                this.seconds = this.seconds - 60;
            }}

        this.minutes +=minutes;
    for(int i = minutes; i > 0; i = i - 60)
        if(this.minutes >=60){
            this.hours += 1;
            if(this.hours >=24)
                this.hours -=24;
            this.minutes = this.minutes - 60;
        }

        this.hours = this.hours + hours;
        for(int i = hours; i > 0; i = i - 24)
        if(this.hours >= 24){
            this.hours = this.hours - 24;
        }


    }

    @Override
    public String toString() {
        return "Текущее время: " + this.hours + ":" + this.minutes + ":" + this.seconds + ".";
    }
}
class Program{
    public static void main(String[] args) {
        Time time = new Time(25,59,60);
        System.out.println(time);
       time.changeTime(0,87465,849);
        System.out.println(time);
    }
}


