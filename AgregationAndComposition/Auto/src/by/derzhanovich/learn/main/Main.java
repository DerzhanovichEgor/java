package by.derzhanovich.learn.main;

import by.derzhanovich.learn.auto.*;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(new Wheel(21),new Wheel(21),new Wheel(21),new Wheel(21),"Hoxy",new Engine());
        System.out.println(auto.getModel());

        auto.setLeftBackWheel(auto.changeWheel(auto.getLeftBackWheel()));
        auto.setLeftForwardWheel(auto.changeWheel(auto.getLeftForwardWheel()));
        auto.refuel();
        auto.go();
    }
}
