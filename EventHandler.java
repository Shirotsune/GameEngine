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
