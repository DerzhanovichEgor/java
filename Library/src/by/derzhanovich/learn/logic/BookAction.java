package by.derzhanovich.learn.logic;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BookAction {
    private List<Book> books = new ArrayList<>();
    private String fileName ="./src/resources/bookInfo.txt";


    public void saveBooks(List<Book> listOfBooks){
        try{
            //saving of object in a file
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //for Serialization
            oos.writeObject(listOfBooks);

            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Book> getListOfBooks(){

        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            books =(List<Book>) ois.readObject();

            ois.close();
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        return books;

    }

    public void addBook(Book book){
        books.add(book);
        saveBooks(books);
    }


    public void deleteBook(Book book){
        books.remove(book);
        saveBooks(books);
    }

    public void editAuthor(Book book, String author){
        book.setAuthor(author);
    }

    public void editDescription(Book book, String description){
        book.setDescription(description);
        saveBooks(books);
    }

    public void editBookName(Book book, String name){
        book.setName(name);
    }
}
