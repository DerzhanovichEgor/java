package by.derzhanovich.learn.main;

import by.derzhanovich.learn.program.Customer;

import static by.derzhanovich.learn.program.Program.*;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[]{
                new Customer(1,"Derzhanovich","Egor","Igorevich",
                        "Korjenevskogo 11-20, Minsk",1111222255557777L,1234567),
                new Customer(2,"Popov","Ivan","Berdrosovich",
                        "Lenina 58-256, Moscow",9997548547612385L,1236547),
                new Customer(3,"West","Adam","Smith",
                        "586 Pierce Street Hopewell Junction, NY 12533",2250000023689654L,9865325),
                new Customer(4,"Wick","John","Jovonovich",
                        "Zelenya 25-65, Brest",8888552222558888L,1597532),
                new Customer(5,"Bloblovsky","Blob","Blobovich",
                        "Paris Zoo's")

        };
        //System.out.println(Arrays.toString(getAllCustomersInAlphabetOrder(customers)));
        getCustomersWithCreditCard(customers);
    }

}
