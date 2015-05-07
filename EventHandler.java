package CV_Gamefication;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventHandler implements KeyListener
{

    private static Player player;
    private static boolean isAction; //Skeleton Code
    private static boolean actionD; //Skeleton Code
    private static boolean actionA; //Skeleton Code
    private static boolean actionW; //Skeleton Code
    /* Utilises Cardinal version. Player cordinates are not relevant for action listener. */

    public EventHandler(Player player) // -!!!- Constructor functions well -!!!-
    {
        this.player = player;

        this.actionA = false; //Skeleton Code
        this.actionD = false; //Skeleton Code
        this.actionW = false; //Skeleton Code
    }

    boolean getPlayerState() /* Skeleton Code */
    {

        if (actionD | actionA | actionW == true)
        {
            return true;
        }

        return false;
    } /* Skeleton Code */

    @Override
    public void keyPressed(KeyEvent e)
    {


        if (e.getKeyCode() == (KeyEvent.VK_D))
        {
            player.right();
            actionD = true; //Skeleton Code
        }
        if (e.getKeyCode() == (KeyEvent.VK_A))
        {
            player.left();
            actionA = true; //Skeleton Code
        }
        if (e.getKeyCode() == (KeyEvent.VK_W))
        {
            player.jump();
            actionW = true; //Skeleton Code
        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == (KeyEvent.VK_D))
        {
            player.rightEnds();
            actionD = false; //Skeleton Code
        }
        if (e.getKeyCode() == (KeyEvent.VK_A))
        {
            player.leftEnds();
            actionA = false; //Skeleton Code
        }
        if (e.getKeyCode() == (KeyEvent.VK_W))
        {
            player.jumpEnds();
            actionW = false; //Skeleton Code
        }



    }

    @Override
    public void keyTyped(KeyEvent ke)
    {

    }



}
