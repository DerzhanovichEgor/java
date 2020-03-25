package by.derzhanovich.learn.main;
import by.derzhanovich.learn.airline.Airline;
import by.derzhanovich.learn.airline.DayOfWeek.Day;
import java.time.LocalTime;

import static by.derzhanovich.learn.airline.DayOfWeek.Day.*;
import static by.derzhanovich.learn.airline.Program.*;

public class Main {
    public static void main(String[] args) {
        Airline[] airlines = new Airline[]{
                new Airline("New York",2586,"EG-6325",Day.MONDAY,LocalTime.of(18,50,20)),
                new Airline("San Marino",8865,"TU-65",Day.SUNDAY,LocalTime.of(06,50)),
                new Airline("Hong Kong",7984,"PLA-195",Day.WEDNESDAY,LocalTime.of(14,35)),
                new Airline("Tokyo",1256,"GLU-8",Day.FRIDAY,LocalTime.of(10,30)),
                new Airline("Roma",9541,"787-5",Day.SATURDAY,LocalTime.of(12,30)),
                new Airline("Kioto",3857,"J-8695",TUESDAY,LocalTime.of(10,50))

        };
        getFlightsWithSpecificDestination(airlines);
        getSpecificFlightsWithGivenDaysOfWeek(airlines,TUESDAY);

        getFlightsWithSpecificTimeDay(airlines,Day.WEDNESDAY,LocalTime.of(01,30));
    }
}
