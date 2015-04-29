package CV_Gamefication;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventHandler implements KeyListener
{

    private static Player player;
    private static boolean isAction;
    private static boolean actionD;
    private static boolean actionA;
    private static boolean actionW;
    /* Utilises Cardinal version. Player cordinates are not relevant for action listener. */

    public EventHandler(Player player)
    {
        this.player = player;

        this.actionA = false;
        this.actionD = false;
        this.actionW = false;
    }

    boolean getPlayerState()
    {

        if (actionD | actionA | actionW == true)
        {
            return true;
        }

        return false;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {


        if (e.getKeyCode() == (KeyEvent.VK_D))
        {
            player.right();
            actionD = true;
        }
        if (e.getKeyCode() == (KeyEvent.VK_A))
        {
            player.left();
            actionA = true;
        }
        if (e.getKeyCode() == (KeyEvent.VK_W))
        {
            player.jump();
            actionW = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == (KeyEvent.VK_D))
        {
            player.rightEnds();
            actionD = false;
        }
        if (e.getKeyCode() == (KeyEvent.VK_A))
        {
            player.leftEnds();
            actionA = false;
        }
        if (e.getKeyCode() == (KeyEvent.VK_W))
        {
            player.jumpEnds();
            actionW = false;
        }



    }

    @Override
    public void keyTyped(KeyEvent ke)
    {

    }



}
