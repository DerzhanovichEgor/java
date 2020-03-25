package by.derzhanovich.learn.forms;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static by.derzhanovich.learn.logic.VerifyLogin.verifyLogin;

public class LoginForm extends JFrame implements ActionListener {

    private JFrame frame = new JFrame("Login");
    private static JButton resetButton = new JButton("Reset");
    static private JTextField userText = new JTextField(20);
    static private JPasswordField passwordField = new JPasswordField(20);
    static private JButton loginB = new JButton("Log In");
    static private JButton signIn = new JButton("Sign In");


    public LoginForm() {
        loginB.addActionListener(this);
        resetButton.addActionListener(this);
        signIn.addActionListener(this);
    }
    public JFrame getFrame() {
        return this.frame;
    }

    public void createFrame() {
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);

    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText.setBounds(100, 20, 170, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);


        passwordField.setBounds(100, 50, 170, 25);
        panel.add(passwordField);


        loginB.setBounds(10, 80, 80, 25);
        panel.add(loginB);

        signIn.setBounds(100, 80, 80, 25);
        panel.add(signIn);

        resetButton.setBounds(190, 80, 80, 25);
        panel.add(resetButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signIn) {
           // frame.setVisible(false);
            RegistrationForm r = new RegistrationForm();
            r.createFrame();

        }
        if (e.getSource() == loginB) {

            if(verifyLogin(userText.getText(),passwordField.getPassword())){
                JOptionPane.showMessageDialog(frame, "Username or Password is wrong:");
            }}


        if (e.getSource() == resetButton) {
            userText.setText("");
            passwordField.setText("");

        }


    }
}




