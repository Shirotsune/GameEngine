package CV_Gamefication;

public class Cardinal extends Main
{
boolean playing = true;
static CV story;    
static Map world;    
    
    public Cardinal(Map world, CV story)
    {
        this.story = story;
        this.world = world;
    }
    
    
    
    
    
    /************************************************************
     * 1.
     * Game main loop
     * 
     * 
     * 
     * 
     * 
     ************************************************************/
   void link_Start()
   {
       /*******************************
       * Multi-thread / fork event-listener.
       * utilise mutex-locks, if player has to move.
       ********************************/ 
       while(playing == true)
       {
       
           
           
           
       }
   }
    
    
}
