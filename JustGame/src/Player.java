import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    
public class Player {
    enum Direction { UP,DOWN,LEFT,RIGHT,NONE };

    private int speed = 2;
    private int mapX = 0;
    private int mapY = 0;
    
    private Direction playerDirection = Direction.NONE;
    

    public int getMapX(){
        return mapX;
    }
    
    public int getMapY(){
        return mapY;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void move(){
        switch(playerDirection) {
		case UP:
			mapY-=speed;
			break;
		case DOWN:
			mapY+=speed;
			break;
		case LEFT:
			mapX-=speed;
			break;
		case RIGHT:
			mapX+=speed;
			break;
		default:
			break;
		}
    }
    
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyCode());
            }

            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if(key == KeyEvent.VK_W){
                    playerDirection = Direction.UP;
                }
                    if(key == KeyEvent.VK_S){
                        playerDirection = Direction.DOWN;
                    }
                    if(key == KeyEvent.VK_D){
                        playerDirection = Direction.RIGHT;
                    }
                    if(key == KeyEvent.VK_A){
                        playerDirection = Direction.LEFT;
                    }
            }

    
    
}
