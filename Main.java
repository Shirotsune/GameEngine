public class Main
{
    /* 
     * Copyright: Tiamo Laitakari (Tiamo.Laitakari(ät)cs.helsinki piste äfii
    
     * Real-time game engine for side-scroller game.
     * This is a stripped down example of how to do a game engine that reacts to player input in a FPS enviorement.
     * 
     * Classes::
     *
     * Cardinal         - Maingame loop
     * Player           - Player constructor
     * GraphicsEngine   - Rendering
     * GUI              - Rendering
     * EventHandler     - Handles keybord input.
    
     */

    public static void main(String[] args)
    {

        /****************************************************************
         * Starting resolution.
         ****************************************************************/
        int resolutionX = 800;
        int resolutionY = 640;

        GUI start = new GUI(resolutionX, resolutionY); //Start up rendering a box.



        Cardinal CV_Art_Offline = new Cardinal(start); //Initialize the main game loop with it's constructor.


        CV_Art_Offline.link_Start(); //Main game loop.

// End of main.
    }

}
