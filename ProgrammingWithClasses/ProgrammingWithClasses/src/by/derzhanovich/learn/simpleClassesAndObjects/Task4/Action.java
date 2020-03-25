package by.derzhanovich.learn.simpleClassesAndObjects.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Action {
    static  Train[] sortByTrainNumber(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            for (int j = 1 + i; j <trains.length; j++) {
                if(trains[i].getTrainNumber() > trains[j].getTrainNumber()){
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
            System.out.println("Train destination: " + trains[i].getDestination() +
                    " - Train's number: " + trains[i].getTrainNumber() +
                    " - Departure time: " + trains[i].getDepartureTime());
        }

        return trains;
    }
    static void getInfo(Train[] trains) throws IOException {
        System.out.println("Do you want to get information about trains? Y/N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine() == "N"){
            return;
        }else{
            System.out.println("Insert train's number to get Information");
            int s = Integer.parseInt(br.readLine());
            for (int i = 0; i <trains.length ; i++) {

                if (s == (trains[i].getTrainNumber())) {
                    System.out.println("Train destination: " + trains[i].getDestination() +
                            " - Train's number: " + trains[i].getTrainNumber() +
                            " - Departure time: " + trains[i].getDepartureTime());
                }
            }
        }


    }
    static  Train[] sortByDestination(Train[] trains){
        for (int i = 0; i < trains.length; i++) {
            for (int j = 1 + i; j <trains.length ; j++) {
                if(trains[i].getDestination().compareTo(trains[j].getDestination()) > 0){
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;

                }
                if(trains[i].getDestination().compareTo(trains[j].getDestination()) == 0 &&
                        trains[i].getDepartureTime().compareTo(trains[j].getDepartureTime()) > 0){
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
            System.out.println("Train destination: " + trains[i].getDestination() +
                    " - Train's number: " + trains[i].getTrainNumber() +
                    " - Departure time: " + trains[i].getDepartureTime());
        }

        return trains;
    }




}
