package by.derzhanovich.learn.forms;

import by.derzhanovich.learn.logic.Book;
import by.derzhanovich.learn.logic.BookAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class AdminForm {
    private JTextField searchField = new JTextField(20);
    private JLabel searchLabel = new JLabel("Search:");
    private BookAction bookAction = new BookAction();
    private JFrame adminForm = new JFrame("AdminForm");
    private JButton previousB = new JButton("Prev");
    private JButton nextB = new JButton("Next");
    private JLabel bookNameLabel = new JLabel();
    private JLabel authorField = new JLabel();
    private JTextArea description = new JTextArea();
    private JButton saveB = new JButton("Save");
    private JButton addB = new JButton("Add Book");

    private JButton editB = new JButton("Edit");
    private JButton deleteB = new JButton("Delete");

    public void createFrame(){
        adminForm.setSize(350,400);
        adminForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        adminForm.add(panel);
        placeComponent(panel);
        adminForm.setVisible(true);
    }
    private List<Book> books = bookAction.getListOfBooks();
    private ListIterator<Book> booksIterator = books.listIterator();

    private void placeComponent(JPanel panel) {

        panel.setLayout(null);

        bookNameLabel.setBounds(10,100,250,35);
        bookNameLabel.setText(books.get(0).getName());
        bookNameLabel.setFont(new Font(bookNameLabel.getName(),Font.PLAIN,20));
        panel.add(bookNameLabel);

        authorField.setBounds(10,122,100,25);
        authorField.setText(books.get(0).getAuthor());
        authorField.setFont(new Font(authorField.getName(),Font.PLAIN,9));
        panel.add(authorField);


            description.setBounds(10, 150, 310, 100);
            description.setEnabled(false);
            description.setText(books.get(0).getDescription());
            description.setDisabledTextColor(Color.BLACK);
            description.setLineWrap(true);
            description.setEditable(true);
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
                        authorField.setText(booksIterator.previous().getAuthor());
                        booksIterator.next();
                        description.setText(booksIterator.previous().getDescription());

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
                    authorField.setText(booksIterator.next().getAuthor());
                    booksIterator.previous();
                    description.setText(booksIterator.next().getDescription());
                }


            }
        });
        panel.add(nextB);

        saveB.setBounds(10,300,150,35);
        panel.add(saveB);
        saveB.setVisible(false);
        addB.setBounds(170,300,150,35);
        panel.add(addB);
        addB.setVisible(false);
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        editB.setBounds(90,260,70,35);
        editB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    description.setEnabled(true);
                saveB.setVisible(true);
                addB.setVisible(true);
                String text = description.getText();
                saveB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for (int i = 0; i < books.size(); i++) {
                            if(books.get(i).getDescription().equalsIgnoreCase(text)){
                                bookAction.editDescription(books.get(i),description.getText());
                                saveB.setEnabled(false);
                            }
                        }
                    }
                });

            }

        });
        panel.add(editB);


        deleteB.setBounds(170,260,70,35);
        panel.add(deleteB);

        searchField.setBounds(150,20,170,25);
        panel.add(searchField);

        searchLabel.setBounds(100,20,50,25);
        panel.add(searchLabel);
    }
}
