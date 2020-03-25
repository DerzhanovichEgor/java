package by.derzhanovich.learn.main;

import by.derzhanovich.learn.government.Government;

public class Main {
    public static void main(String[] args) {
        Government belarus  = new Government();
        System.out.println("Столица: " +  belarus.getCapital());
        System.out.println("В данном государстве: " + belarus.getQuantityOfRegions() + " областей");
        belarus.getAreaOfGovernment();
        belarus.printRegionalCenter();
    }
}
