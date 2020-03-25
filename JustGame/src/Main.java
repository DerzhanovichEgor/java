
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class Main extends JPanel implements ActionListener{
    JFrame frame;
    Player player = new Player();   
    
    Timer timer = new Timer(20,this);
    Image img = new ImageIcon("player.png").getImage();

    public Main(JFrame frame) {
        
        timer.start();
        this.frame = frame;
        frame.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                player.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                player.keyPressed(e);
            }
        
        });
    }
    
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, player.getMapX(), player.getMapY(), frame.getWidth(), frame.getHeight(), null); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       
        repaint();
         player.move();//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
