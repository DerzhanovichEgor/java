package by.derzhanovich.learn.forms;

import by.derzhanovich.learn.logic.Book;
import by.derzhanovich.learn.logic.BookAction;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

    public class UserForm extends JFrame {
    private  BookAction bookAction = new BookAction();
    private JFrame userForm = new JFrame("UserForm");
    private JButton previousB = new JButton("Prev");
    private JButton nextB = new JButton("Next");
    private JTextField searchField = new JTextField(20);
    private JLabel searchLabel = new JLabel("Search:");
    private JLabel bookNameLabel = new JLabel();
    private JLabel authorField = new JLabel();
    private JTextArea description = new JTextArea(2,30);


    private List<Book> books = bookAction.getListOfBooks();
    private ListIterator<Book> booksIterator = books.listIterator();


    public void createFrame(){
        userForm.setSize(350,400);
        userForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        userForm.add(panel);
        placeComponent(panel);
        userForm.setVisible(true);
    }

    private void placeComponent(JPanel panel) {

        panel.setLayout(null);

        searchLabel.setBounds(180,20,50,25);
        panel.add(searchLabel);

        searchField.setBounds(230,20,90,25);
        panel.add(searchField);

        bookNameLabel.setBounds(10,100,250,35);
        bookNameLabel.setText(books.get(0).getName());
        bookNameLabel.setFont(new Font(bookNameLabel.getName(),Font.PLAIN,20));
        panel.add(bookNameLabel);

        authorField.setBounds(10,122,200,25);
        authorField.setText("Written by: " + books.get(0).getAuthor());
        authorField.setFont(new Font(authorField.getName(),Font.PLAIN,9));
        panel.add(authorField);

        description.setBounds(10,150,310,100);
        description.setEditable(false);
        description.setText("  " + books.get(0).getDescription());
        description.setDisabledTextColor(Color.BLACK);
        description.setLineWrap(true);
        description.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.add(description);



        previousB.setBounds(10,260,70,35);
        previousB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(booksIterator.hasPrevious()){
                    booksIterator.previous();
                   try {
                       bookNameLabel.setText(booksIterator.previous().getName());
                       booksIterator.next();
                       authorField.setText("Written by: " + booksIterator.previous().getAuthor());
                       booksIterator.next();
                       description.setText("  " + booksIterator.previous().getDescription());

                   }catch (NoSuchElementException e1){

                   }
                }
            }
        });
        panel.add(previousB);

        nextB.setBounds(250,260,70,35);
        nextB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(booksIterator.hasNext()){
                    booksIterator.next();

                      bookNameLabel.setText(booksIterator.next().getName());
                      booksIterator.previous();
                      authorField.setText("Wrritten by: " + booksIterator.next().getAuthor());
                      booksIterator.previous();
                      description.setText("  " + booksIterator.next().getDescription());


                  }

            }
        });
        panel.add(nextB);

     //   randomB.setBounds(90,260,150,35);
//        panel.add(randomB);
    }


    }

