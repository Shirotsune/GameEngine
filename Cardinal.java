package CV_Gamefication;

import javax.swing.SwingUtilities;




public class Cardinal extends Main
{

    /**********************************************************
     * Datatypes of Cardinal. playing - main game loop variable playerAction -
     * at the end of maingame loop verify, if player input is given.
     *********************************************************/
    private boolean playing = true;
    private static boolean playerAction = false;
    private Player player = new Player(); /* Overloaded constructor */

    private EventHandler handler = new EventHandler(player); /* High responsibility. */

    private GUI start;

    public Cardinal(GUI start)
    {
        this.start = start;
        SwingUtilities.invokeLater(start);
    }

    //Main game loop starts here!

    void link_Start()
    {

        while (playing == true)
        {
            // While this is true and running: The game will not wait for any type of input.
            // The loop will check with PlayerAction(), if a keybord action is given but there is no turn-based logic.
            // Should or should not a player action be given the loop still runs relatively at same time.
            // With milliseconds of difference? The FPS enforcement will ensure that the game runs smoothly real-time
            // refresh function of GUI will draw any updates on the location of player.
            try 
            {
                Thread.sleep(25); /* Defines FPS */
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            
            player.PlayerAction(); /* Checks player keybord inputs. */
            start.refresh(); /* Refresh the frame after all actions have been computed. */
            
        }
    }


}
