package by.derzhanovich.learn.government;

import java.util.HashSet;
import java.util.Set;

public class Government {


    private String capital;



    City[] cities = new City[]{
            new City("Борисов", false, new Region("Минская",39854.0), new District("Минский"), false),
            new City("Минск", true, new Region("Минская",39854.0), new District("Минский"), true),
            new City("Могилев", true, new Region("Могилевская ",28652.0), new District("Могилеский"), false),
            new City("Гомель", true, new Region("Гомельская ",40372.0), new District("Гомельский"), false),
            new City("Гродно", true, new Region("Гродненская ",29689.5), new District("Гродненский"), false),
            new City("Брест", true, new Region("Брестская ",32000.0), new District("Брестский"), false),
            new City("Витебск", true, new Region("Витебская ",33415.9), new District("Витебский"), false),
            new City("Старые Дороги", false, new Region("Минская ",39854.0), new District("Стародорожский"), false)
    };



    public String getCapital() {
        for (int i = 0; i <cities.length ; i++) {
            if(cities[i].isCapital() == true){
                capital = cities[i].getName();
            }
        }
        return capital;
    }
    public int getQuantityOfRegions(){
        int count = 0;
        for (int i = 0; i < cities.length ; i++) {
            if(cities[i].isRegionalCenter() == true){
                count++;
            }
        }
        return count;
    }
    public void getAreaOfGovernment(){
        double areaOfGovernment = 0;
        Set<Double> area = new HashSet<>();
        for (int i = 0; i < cities.length; i++) {
            area.add(cities[i].getAreaOfRegion());
        }
        for (double d : area) {
            areaOfGovernment +=d;
        }
        System.out.println("Площаль государства равна: " + areaOfGovernment);
    }

    public void printRegionalCenter(){
        System.out.print("Областные центры: ");
        for (int i = 0; i < cities.length; i++) {

            if(cities[i].isRegionalCenter() == true){
                System.out.print(cities[i].getName() + ", ");
        }

        }
    }
}