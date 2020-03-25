package by.derzhanovich.learn.book;

/*
* Создать класс Book, спецификация ккоторого приведена ниже. Определить set- get- методы, конструкторы,
* метод toString().
* Создать второй класс агрегирующий массив типа Book.
* Задать критерии выбора данных и вывести на консоль.
* Book: id, название, автор, издательство, год издания,количество страниц, цена, тип переплета
* Найти и вывести:
* 1. Список книг, заданного автора.
* 2. Список книг, выпущенных заданным издательством.
* 3. Список книг, выпущенных после заданного года.*/

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int publishingYear;
    private int numberOfPages;
    private double price;
    private String bindingType;

    public Book(int id, String title, String author, String publishingHouse, int publishingYear, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
