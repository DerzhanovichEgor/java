package by.derzhanovich.learn.account;

import java.util.ArrayList;

public class Client {
    private String name;
    private String surname;
    private String identificationNumber;
    ArrayList<Account> accounts;

    public Client(String name, String surname, String identificationNumber, ArrayList<Account> accounts) {
        this.name = name;
        this.surname = surname;
        this.identificationNumber = identificationNumber;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public void blockAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.get(i).setBlocked(true);
            }
        }
    }

    public void unblockAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber && accounts.get(i).isBlocked() == true) {
                accounts.get(i).setBlocked(false);
            }
        }
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void deleteAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if(accountNumber == accounts.get(i).getAccountNumber()) {
                accounts.remove(i);
            }
        }
    }
    public void printAccounts(){
        accounts.stream().forEach(System.out::println);
    }

}
