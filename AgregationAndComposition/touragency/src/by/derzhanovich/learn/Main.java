package by.derzhanovich.learn;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      List<Tour> tour = new ArrayList<>();
      Client johnny = new Client("Johnny","Don","+375689568953");
        TourSelection t = new TourSelection();
        t.selectTour(tour,"excursion","cruise","shopping");
        ClientOffers clientOffers = new ClientOffers(johnny,tour);
        t.sortTour(clientOffers);
        System.out.println(clientOffers);


    }




}
