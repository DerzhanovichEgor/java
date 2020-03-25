package by.derzhanovich.learn.simpleClassesAndObjects.Task4;
/*
* Создать класс Train, содержащий поля: название пкнкта назначения, номер поезда, время отправления.
* Добавьте возможность сортировки элементов массива по номерам поездов.
* Добавьте возможность вывода инфо о поезде, номер которого введен пользователем.
* Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения
* должны быть упорядочены по времени отправления*/
import java.io.IOException;

import static by.derzhanovich.learn.simpleClassesAndObjects.Task4.Action.getInfo;
import static by.derzhanovich.learn.simpleClassesAndObjects.Task4.Action.sortByDestination;
import static by.derzhanovich.learn.simpleClassesAndObjects.Task4.Action.sortByTrainNumber;

public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train() {
    }

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;

    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }


    public String getDepartureTime() {
        return departureTime;
    }


}