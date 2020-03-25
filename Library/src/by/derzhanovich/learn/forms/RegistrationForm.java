package by.derzhanovich.learn.forms;

import by.derzhanovich.learn.logic.User;
import by.derzhanovich.learn.logic.VerifyLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
   private JFrame frame = new JFrame("RegistrationForm");
    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel passwordLabel = new JLabel("Password:");
    private JLabel passwordLabel1 = new JLabel("Password:");
    private JPasswordField passwordField1 = new JPasswordField(20);
    private JTextField userText = new JTextField(20);
    private JButton confirmButton = new JButton("Submit");
    private JPasswordField passwordField = new JPasswordField(20);
    private JButton resetButton = new JButton("Reset");
    private JLabel emailLabel = new JLabel("E-mail");
    private JTextField emailField = new JTextField(20);

    public RegistrationForm(){
        confirmButton.addActionListener(this);
    }

    public void createFrame(){
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        setComponents(panel);
        frame.setVisible(true);

    }
    //draws components on the field
    private void setComponents(JPanel panel){
        panel.setLayout(null);

        emailLabel.setBounds(10,20,80,25);
        panel.add(emailLabel);

        emailField.setBounds(100,20,170,25);
        panel.add(emailField);

        usernameLabel.setBounds(10,55,80,25);
        panel.add(usernameLabel);

        userText.setBounds(100,55,170,25);
        panel.add(userText);

        passwordLabel.setBounds(10, 90 , 80,25);
        panel.add(passwordLabel);

        passwordField.setBounds(100,90,170,25);
        panel.add(passwordField);

        passwordLabel1.setBounds(10, 125 , 80,25);
        panel.add(passwordLabel1);

        passwordField1.setBounds(100,125,170,25);
        panel.add(passwordField1);

        confirmButton.setBounds(10,160,80,25);
        panel.add(confirmButton);

        resetButton.setBounds(100,160,80,25);
        panel.add(resetButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == confirmButton){
            if(!VerifyLogin.verifyUserName(userText.getText())){
                JOptionPane.showMessageDialog(this,"This username is already exist, try again");
            }else{
                User.addNewUser(userText.getText(),passwordField.getPassword(),passwordField1.getPassword(),emailField.getText());
            }
        }
    }
}
