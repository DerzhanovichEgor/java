package by.derzhanovich.learn.logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class User{
    //this method add's new user. And save data to File
    public static void addNewUser(String username, char[] password,char[] password1,String email){
        {
            if(checkPassword(password,password1)){
                File file = new File("./src/userrnameInfo.txt");
                FileWriter fr = null;
                try{
                    fr = new FileWriter(file,true);

                      fr.write(username);
                      fr.write(",");
                      fr.write(password );
                      fr.write(",");
                      fr.write(email);
                    fr.write("\n");

                }catch (IOException e){
                    e.printStackTrace();
                }finally {
                    try{
                        fr.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }

    }


    private static boolean checkPassword(char[] password, char[] password1){
        if(Arrays.equals(password,password1) && password.length == password1.length)
            return true;
        return false;
    }
}
