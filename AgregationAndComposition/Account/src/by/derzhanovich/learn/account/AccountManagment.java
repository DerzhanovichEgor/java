package by.derzhanovich.learn.account;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AccountManagment {
   public static void findAccount(Client client){
        Scanner sc = new Scanner(System.in);
       System.out.println("Введите номер счета:");
        int number = sc.nextInt();
        boolean isExist = false;
        for (int i = 0; i < client.accounts.size(); i++) {
            if(client.accounts.get(i).getAccountNumber() == number)
            {isExist = true;
                System.out.println("Счет № " + client.accounts.get(i).getAccountNumber() + " найден:\n" +
                                    client.getName() + " " + client.getSurname() + "\n" +
                                    "Баланс на данном счету составляет " + client.accounts.get(i).getBalance() + "$");
           }


            }
       if(!isExist)
           System.out.println("Cчет № " + number + " не найден или его не существует!");

        }

        public static void sortByAccountNumber(Client client) {
            for (int i = 0; i < client.accounts.size(); i++) {
                for (int j =i+1; j < client.accounts.size(); j++) {
                    if (client.accounts.get(i).getAccountNumber() > client.accounts.get(j).getAccountNumber()) {
                        Account temp = client.accounts.get(i);
                        client.accounts.set(i, client.accounts.get(j));
                        client.accounts.set(j, temp);
                    }
                }
            }

            for (int i = 0; i < client.accounts.size(); i++) {
                System.out.println(client.accounts.get(i));
            }
   }

        public static void sum(Client client){
            double sum = 0.0;
                for (Account c : client.accounts) {sum+=c.getBalance();}
                    System.out.println(sum);
        }
        public static void getSumWithEvenBalance(Client client){
       double sum = 0.0;
            for (Account c : client.accounts) {
                if(c.getBalance() > 0){
                    sum +=c.getBalance();
                }

            }
            System.out.println("Сумма сччетов с положительным балансом равна: "+sum);
        }

    public static void getSumWithOddBalance(Client client){
        double sum = 0.0;
        for (Account c : client.accounts) {
            if(c.getBalance() < 0){
                sum +=c.getBalance();
            }

        }
        System.out.println("Сумма сччетов с отрицательным балансом равна: "+sum);
    }
}



