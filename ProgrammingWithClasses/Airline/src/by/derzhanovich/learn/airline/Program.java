package by.derzhanovich.learn.airline;
import by.derzhanovich.learn.airline.DayOfWeek.Day;
import java.time.LocalTime;
import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void getFlightsWithSpecificDestination(Airline[] array) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Введите пункт назначения:");
        String destination = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDestination().toLowerCase().equals(destination.toLowerCase())) {
                count++;
                System.out.println("Рейс №" + array[i].getFlightId() + " вылетает в " + array[i].getDepartureTime() +
                        ". Пункт назначения: " + array[i].getDestination() + "  " + array[i].getDay());
            }
        }
        if (count == 0) {
            System.out.println("Рейсов в данный пукнт назнаечния нет.");
        }

    }

    public static void getSpecificFlightsWithGivenDaysOfWeek(Airline[] array,Day day){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(day == array[i].getDay()){
                count++;
                System.out.println("Flight №" + array[i].getFlightId() + " departure time: " + array[i].getDay() +
                        " at " + array[i].getDepartureTime() + ". Destination: " + array[i].getDestination());
            }
        }
        if(count == 0){
            System.out.println("Рейсов в данный день нет.");
        }

    }
//метод выводит на
    public static void getFlightsWithSpecificTimeDay(Airline[] array, Day day, LocalTime time){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(day == array[i].getDay() && array[i].getDepartureTime().isAfter(time)){
                count++;
                System.out.println("Flight №" + array[i].getFlightId() + " departure time: " + array[i].getDay() +
                        " at " + array[i].getDepartureTime() + ". Destination: " + array[i].getDestination());
            }
        }
        if(count == 0){
            System.out.println("Рейсов в данный день нет.");
        }
    }
}
