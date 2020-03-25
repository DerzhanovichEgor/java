package by.derzhanovich.learn.main;

import by.derzhanovich.learn.account.Account;
import by.derzhanovich.learn.account.Client;

import java.util.ArrayList;
import java.util.Arrays;

import static by.derzhanovich.learn.account.AccountManagment.*;

public class Main {


    public static void main(String[] args) {
        Client james = new Client("James", "Bolly", "876585222BB15PD2",
                new ArrayList<Account>(Arrays.asList(new Account(0.0, 1212144, 0.0),
                        new Account(-1000.25, 1234567, 0.3),
                        new Account(-20003.25, 1, 0.3),
                        new Account(30020.25, 2, 0.3),
                new Account(5000.25, 17, 0.3))));

        //james.blockAccount(1212144);
        //System.out.println(james);
       // findAccount(james);
       // sortByAccountNumber(james);
        james.addAccount(new Account(2222.0,1232345,0.0));
        sum(james);
        james.deleteAccount(1232345);
        james.printAccounts();
        getSumWithEvenBalance(james);
        getSumWithOddBalance(james);
    }
}
