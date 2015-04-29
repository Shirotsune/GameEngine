package CV_Gamefication;
import java.awt.Graphics;

public class Player 
{

    /* Note on this game: the world is always drawn around the player-character!!!*/
    private static int x;
    private static int y;
    /* MOST IMPORANT X AND Y COORDS EVER! */
    private static boolean w = false;
    private static boolean a = false;
    private static boolean s = false;
    private static boolean d = false;
    private static boolean space = false;
    
    public Player()
    {
        /* Overloaded constructor for Cardinal utility. */
    }
    
    public Player(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public void draw(Graphics graphics)
    { /* Temporary - will use animated sprites. */
        graphics.fillOval(x, y, 10, 10);
    }
    
    /************************************************************
     * jump() is called when player jumps
     * right() is called when player wants to move right
     * left() is called when player wants to move left
     * drop() functionality is WIP (not yet designed).
     ************************************************************/
    
    
    public void jump()
    {
        w = true;
    }
    
    public void right()
    {
        d = true;
    }
    
    public void left()
    {
        a = true;
    }
    
    public void drop()
    {
        s = true;
    }
    
    /****
     * PlayerAction(boolean input)
     * handles the movement input.
     */
    
    public boolean PlayerAction(boolean input)
    {
        if(w==true)
        {
            
        }
        if(a==true)
        {
            
        }
        if(s==true)
        {
            
        }
        if(d==true)
        {
            
        }
        
        return input;
    }

}
