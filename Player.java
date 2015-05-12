import java.awt.Graphics;

public class Player
{
    /* Double-jump >> if EventHandler recieves W, use getDoubleJump boolean*/
    /* If this condition is true > set +25 to jump duration and reset falling.*/
    /* This will give an illusion of a perfect double jump. */



    private static int x;
    private static int y;
    /* MOST IMPORANT X AND Y COORDS EVER! */
    private static boolean w;
    private static boolean a;
    private static boolean s;
    private static boolean d;
    private static boolean space;
    private static int gravity;
    private static int jump_duration;
    private static int falling;
    private static int doubleJump;

    public Player()
    {
        /* Overloaded constructor for Cardinal utility. */
    }

    public Player(int x, int y)
    {   /* Should check constructor-styles. Potential overlap, if called at wrong order.*/
        /* Constructed by GUI - variables should be static @ all times. */
        this.x = x;
        this.y = y;
        this.w = false;
        this.a = false;
        this.s = false;
        this.d = false;
        this.space = false;
        this.gravity = 0;
        this.jump_duration = 30;

        this.doubleJump = 0; /* Extra functionality */

    }

    /*****************************************************************************
     * Note! Player getX and GetY are constant "origo" inside the game.
     * Rendering will always follow the player.
     * ***************************************************************************/
    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void draw(Graphics graphics)
    {
        /* Temporary - will use animated sprites. */
        graphics.fillOval(x, y, 60, 80);
    }

    /*************************************************************
     * jump() is called when player jumps right() is called when player wants to
     * move right left() is called when player wants to move left drop()
     ************************************************************/


    public void jump()
    {
        w = true;
    }

    public void jumpEnds()
    {
        w = false;
        if (doubleJump == 0)
        {
            this.doubleJump = 1;
        }
    }

    public void right()
    {
        d = true;
    }

    public void rightEnds()
    {
        d = false;
    }

    public void left()
    {
        a = true;
    }

    public void leftEnds()
    {
        a = false;
    }

    public void drop()
    {
        s = true;
    }

  
    // Handles player movement logic. Is called from Cardinal.
    // The boolean values is the reason why the game can function real time. At each frame (or game cycle)
    // the game will check, PlayerAction. If any of the motions are true then an action will be taken.

    public void PlayerAction()
    {

        /* Player jump */
        if (w == true)
        {
            /* gravity data-type will prevent falling through floor reliably regardless of velocity */
            this.y -= 4;
            this.gravity += 4;
            jump_duration--;
            if (doubleJump == 1)
            {
                this.doubleJump = 2;
                this.falling = 0;
                this.jump_duration = 25;
            }
        }
        if ((w != true) || jump_duration <= 0)
        {
            if (this.gravity > 0)
            {
                this.y += this.falling;
                this.gravity -= this.falling;
                if (falling != 10)
                {
                    ++falling;
                }
                if (this.gravity < 0)
                {
                    this.y += this.gravity;
                    this.gravity = 0;
                }
            }
            if (this.gravity == 0)
            {
                this.falling = 0;
                this.jump_duration = 30;
                this.doubleJump = 0;
            }
        }
        /* Player move left */
        if (a == true)
        {
            this.x -= 3;
        }
        if (s == true)
        {

        }
        /*  Player move right */
        if (d == true)
        {
            this.x += 3;
        }

    }

}
