package by.derzhanovich.learn;

import java.util.*;

public class TourSelection {
    public static Tour getListOfTours(String type) {
        Map<String, Tour> tours = new HashMap<>();
    tours.put("treatment",new Treatment(true,"train",4));
    tours.put("cruise", new Cruise(true,"ship",7));
    tours.put("excursion",new Excurrsion(false,"bus",1));
    tours.put("resort",new Resort(true,"airplane",8));
    tours.put("shopping", new Shopping(false,"bus",1));
    return tours.get(type);
    }

    public void selectTour(List<Tour> chosenTours, String...tours){
        for (int i = 0; i < tours.length; i++) {
            if(getListOfTours(tours[i]).getType().toLowerCase().equals(tours[i])){
                chosenTours.add(getListOfTours(tours[i]));
            }
        }
    }

    public void sortTour(ClientOffers obj){
        Collections.sort(obj.getTour(),new Comparator(){
            public int compare(Object o1, Object o2){
                Tour tour1 = (Tour)o1;
                Tour tour2 = (Tour)o2;
                if(tour1.getDays() > tour2.getDays()){
                    return 1;
                }
                if(tour1.getDays() < tour2.getDays()){
                    return -1;
                }
                else {
                    return 0;
                }
            }

        });
    }
}
