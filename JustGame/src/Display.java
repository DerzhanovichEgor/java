import javax.swing.*;
import java.awt.*;


public class Display {

    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
      // frame.setSize(500,500);
       frame.setUndecorated(false);
        frame.add(new Main(frame));
       frame.setVisible(true);
       
      
    }
    
}
