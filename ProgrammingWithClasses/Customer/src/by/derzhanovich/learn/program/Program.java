package by.derzhanovich.learn.program;

import java.util.Scanner;

public class Program {
    Customer[] customers;

    public Program(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public static Customer[] getAllCustomersInAlphabetOrder(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            for (int j = 1 + i; j < customers.length; j++) {
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;

                }
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) == 0 &&
                        customers[i].getName().compareTo(customers[j].getName()) > 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) == 0 &&
                        customers[i].getName().compareTo(customers[j].getName()) == 0 &&
                        customers[i].getSecondName().compareTo(customers[j].getSecondName()) > 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }

            }

        }
        return customers;
    }
    public static void getCustomersWithCreditCard(Customer[] customers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 16-ти значный номер, с которого будет начинаться поиск");
        double startNumber = sc.nextDouble();
        System.out.println("Введите 16-ти значный номер, до которого будет происходить поиск");
        double finalNumber = sc.nextDouble();
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getCreditCardNumber() >= startNumber
                    && customers[i].getCreditCardNumber() <= finalNumber){

                System.out.println(customers[i].getSurname() + " "
                        + customers[i].getName() + " " + customers[i].getSecondName() + ".");
            }
        }
    }
}
