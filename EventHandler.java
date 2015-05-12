package CV_Gamefication;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventHandler implements KeyListener
{

    private Player player;
    /* Utilises Cardinal version. Player cordinates are not relevant for action listener. */

    public EventHandler(Player player) 
    {
        this.player = player;
    }
 
    @Override
    public void keyPressed(KeyEvent e)
    {
    
    // When a key is pressed, the players boolean changing function is called. After it is released it becomes false.
    // This is used in conjugation of the playerAction(); inside cardinal to determine, if the player wants to move.
    // current keymapping is W A D.
    
    // W is jump. Pressing W while in air again will double jump.
    // D is for moving right.
    // A is for moving left.
    

        if (e.getKeyCode() == (KeyEvent.VK_D))
        {
            player.right();
        }
        if (e.getKeyCode() == (KeyEvent.VK_A))
        {
            player.left();
        }
        if (e.getKeyCode() == (KeyEvent.VK_W))
        {
            player.jump();
        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == (KeyEvent.VK_D))
        {
            player.rightEnds();
        }
        if (e.getKeyCode() == (KeyEvent.VK_A))
        {
            player.leftEnds();
        }
        if (e.getKeyCode() == (KeyEvent.VK_W))
        {
            player.jumpEnds();
        }



    }

    @Override
    public void keyTyped(KeyEvent ke)
    {

    }



}
