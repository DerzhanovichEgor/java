package by.derzhanovich.learn.book;


import java.util.Scanner;

public class Program {
    //Выводит список книг заднного автора
    public static void getSpecificBooks(Book[] books) {
       Scanner sc = new Scanner(System.in);
        String author = "";
        do{
            System.out.println("Введите автора для получения списка книг(пример Крутов К.К.)");
            author = sc.nextLine();
        }
        while(!author.matches("^[А-Я][а-я]+\\s[А-Я]\\.[А-Я]\\."));
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equals(author)){
                System.out.println(books[i].getTitle() + " (год публикации: " + books[i].getPublishingYear() + ")");
                count++;
            }

        }
        if(count == 0){
            System.out.println("Книг данного автора нет в наличии");
        }

    }

    //выводит списокк книг, выпущенных заданноым издательстом
    public static void getGivenPublishingHouse(Book[] books){
            Scanner sc = new Scanner(System.in);
            int count = 0;

            System.out.println("Введите желаемое издательство:");
            String publishingHouse = sc.nextLine();
        System.out.println("Список книг:");
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPublishingHouse().toLowerCase().equals(publishingHouse.toLowerCase())){
                count++;
                System.out.println(count + ". " + books[i].getTitle() + ".");

            }
        }
        if(count == 0){
            System.out.println("Книг данного издательста нет в наличии!");
        }
    }
//выводит список книг, выпущенных после заданного года
    public static void getBooksAfterSpecificYear(Book[] books){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите год издательства (пример - 1999):");
        int year = sc.nextInt();
        System.out.println("Список книг выпущенных после " + year + " года:");
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPublishingYear() >= year){
                count++;
                System.out.println(count + ". " + books[i].getTitle() + ".");
            }
        }
        if(count == 0){
            System.out.println("Книг выпущенных после " + year + " нет в наличии!");
        }



    }
}
