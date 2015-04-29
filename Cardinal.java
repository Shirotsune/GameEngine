package CV_Gamefication;

/*********************************************************
 * Cardinal execution order.
 * 1. level construction.
 * 2. main game loop.
 * 
 * 
 *********************************************************/




public class Cardinal extends Main
{
/*********************************************************
 * Datatypes of Cardinal.
 * playing - main game loop variable
 * playerAction - at the end of maingame loop verify, if player input is given
 * story used for level generation.
 * world used for level generation.
 *********************************************************/
private boolean playing = true;
private static boolean playerAction = false;    
private static CV story;    
private static Map world;    
private Player player = new Player(); /* Overloaded constructor */
private EventHandler handler = new EventHandler(player); /* High responsibility. */
    public Cardinal(Map world, CV story)
    {
        this.story = story;
        this.world = world;
        build(story, world);
    }
    
    /*****************************************************
     * 1. Level construction - called next. @Constructor.
     * 
     * 
     *****************************************************/
    void build(CV story, Map world)
    {
    /* Level Intro */    
    String Yhteystiedot;
    /* Level One   */
    String studies_and_languages;    
    /* Level Two   */
    String IT_skills;    
    /* Level Three */    
    String Projects;
    /* Level Four  */
    String hobbies;
    }
    
    
    /************************************************************
     * 2.
     * Game main loop
     * 
     * 
     * 
     * 
     * 
     ************************************************************/
   void link_Start()
   {
       /*********************************************************
       * Multi-thread / fork event-listener.
       * utilise mutex-locks, if player has to move.
       **********************************************************/ 
       while(playing == true)
       {
        
           
           
        
            if(playerAction==true) //Check, if player activity needs to be taken care of.  
            {
            player.PlayerAction(playerAction);
            }
            
        }
   }
    
    
}
