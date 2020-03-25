package by.derzhanovich.learn.airline;
import by.derzhanovich.learn.airline.DayOfWeek.Day;
import java.time.LocalTime;
/*
* Создать класс Airline, спецификкация ккоторого привеедена ниже. Определить кострукторы, set-,get- методы
* и метод toString(). Создать второй класс агрегирующий массив типа Airline, с подходящими конструкторами и
* методами. Задать критерии выбора данных и вывести их на консоль
* Airline: пункт назнач, номер рейса, тип самолета, время вылета, дни неделию
* Найти и вывести
* 1. Список рейсов для задданого пункта назначенения.
* 2. Список рейсов для задданого дня недели.
* 3. Список рейсов для задданого дня недели,время вылета для которых больше заданного.*/
public class Airline {
    private String destination;
    private int flightId;
    private String planeType;
    private Day day;
    private LocalTime departureTime;

    public Airline(String destination, int flightId, String planeType, Day day, LocalTime departureTime) {
        this.destination = destination;
        this.flightId = flightId;
        this.planeType = planeType;
        this.day = day;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightId=" + flightId +
                ", planeType='" + planeType + '\'' +
                ", day=" + day +
                ", departureTime=" + departureTime +
                '}' + "\n";
    }
}
