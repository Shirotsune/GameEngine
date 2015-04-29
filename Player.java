package CV_Gamefication;

import java.awt.Graphics;

public class Player
{

    /* Note on this game: the world is always drawn around the player-character!!!*/
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

    public Player()
    {
        /* Overloaded constructor for Cardinal utility. */
    }

    public Player(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.w = false;
        this.a = false;
        this.s = false;
        this.d = false;
        this.space = false;
        this.gravity = 0;
        this.jump_duration = 30;
    }

    /**
     * **************************************************************************
     * Note! Player getX and GetY are constant "origo" inside the game.
     * Rendering will always follow the player.
     ***************************************************************************
     */
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

        graphics.fillOval(x, y, 60, 80);
    }

    /**
     * **********************************************************
     * jump() is called when player jumps right() is called when player wants to
     * move right left() is called when player wants to move left drop()
     * functionality is WIP (not yet designed).
     * **********************************************************
     */


    public void jump()
    {
        w = true;
    }

    public void jumpEnds()
    {
        w = false;
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

    /**
     * **
     * PlayerAction(boolean input) handles the movement input. Returns false, if
     * fails.
     */


    public void PlayerAction()
    {
        if (w == true)
        {
            this.y -= 4;
            this.gravity += 4;
            jump_duration--;
        }
        if ((w != true) || jump_duration <= 0)
        {
            if (this.gravity > 0)
            {
                this.y += this.falling;
                this.gravity -= this.falling;
                if(falling != 10)
                ++falling; 
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
            }
        }

        if (a == true)
        {
            this.x -= 3;
        }
        if (s == true)
        {

        }
        if (d == true)
        {
            this.x += 3;
        }

    }

}
