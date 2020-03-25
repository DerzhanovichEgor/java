package by.derzhanovich.learn.logic;

import by.derzhanovich.learn.forms.AdminForm;
import by.derzhanovich.learn.forms.LoginForm;
import by.derzhanovich.learn.forms.UserForm;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class VerifyLogin {

    private static Scanner x;

    //checks if given user exist
    public static boolean verifyLogin(String username, char[] password) {
        boolean found = false;
        boolean result =true;
        String usernameT = "";
        char passwordT[];
        try {
            x = new Scanner(new File("./src/resources/userrnameInfo.txt"));
            x.useDelimiter("\r?[,\n]");

            while (x.hasNext() && !found) {

                usernameT = x.next();
                passwordT = x.next().toCharArray();
                String email = x.next();//without this string mu regex doesn't work correctly((

                if (usernameT.trim().equals("admin") && (password.length == passwordT.length &&
                        Arrays.equals(password, passwordT))) {
                    AdminForm forrm = new AdminForm();
                    forrm.createFrame();
                } else if (usernameT.trim().equals(username.trim()) && (password.length == passwordT.length &&
                        Arrays.equals(password, passwordT))) {
                    UserForm form = new UserForm();
                    form.createFrame();

                }
                else if(!usernameT.trim().equals(username.trim()) && (password.length == passwordT.length &&
                        Arrays.equals(password, passwordT))){
                     result = false;
                }
            }
          x.close();
        }catch (Exception e){
           e.printStackTrace();
        }
        return result;

    }
    //return true if given username does not exist
    public static boolean verifyUserName(String username){
        try {
            x = new Scanner(new File("./src/resources/userrnameInfo.txt"));
            String s[];
            while(x.hasNext()){
                s = x.next().split(",");
                if(username.equals(s[0])){
                    return false;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

}
