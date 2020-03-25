package by.derzhanovich.learn.main;

import by.derzhanovich.learn.book.Book;


import java.io.IOException;

import static by.derzhanovich.learn.book.Program.getBooksAfterSpecificYear;
import static by.derzhanovich.learn.book.Program.getGivenPublishingHouse;
import static by.derzhanovich.learn.book.Program.getSpecificBooks;

public class Main {
    public static void main(String[] args) throws IOException {
        Book[] books = new Book[]{
                new Book(1,"Ветер в голове","Клапанов Н.В.","ООО Дом у дороги",
                        2019,400,52.99,"Твердый переплет"),
                new Book(2,"Таратара","Некто Е.И.","ООО Вччерашний день",
                        2012,350,5.20,"Мягкий переплет"),
                new Book(3,"Ветер в голове 2","Плитракад Д.В.","ООО Дом у дороги",
                        2020,480,57.99,"Твердый переплет"),
                new Book(4,"Дом на одного","Пушкин А.С.","ООО Платиновая оградка",
                        1985,342,16.89,"Кожаный переплет"),
                new Book(5,"Сборник упущенных возможностей","Держанович Е.И.","Неизвестная контора",
                        2019,986,78.99,"Твердый переплет"),
                new Book(6,"Завтра","Держанович Е.И.","ООО Дом печати",
                        2019,986,78.99,"Твердый переплет")
        };
        getGivenPublishingHouse(books);
       getSpecificBooks(books);
        getBooksAfterSpecificYear(books);
    }
}
