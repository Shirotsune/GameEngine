package CV_Gamefication;

public class Main implements UserInterface
{
       /* 
        * Copyright: Tiamo Laitakari (Tiamo.Laitakari(ät)cs.helsinki piste äfii
    
        *   Main tekee:
        *   1.  alustaa ohjelman ja luo graaffisen käyttöliittymän.
        *   2.  lukee CV:n sisällön ja karttatiedoston sisällön. (pelillistys!)
        *   3.  Luodaan peli maailma ja CV tiedoston pohjalle.
        
        ::::: Luokat :::::
        * Main          
        - ohjelman ajo.
        
        * GUI           
        - graaffinen käyttöliittymä
        
        * UserInterface
        - eventlistener
        */
    
    public static void main(String[] args) 
    {
    
        /*********************************************************************
         * 1.
         * x-axis resoluutio
         * y-axis resoluutio
         * alustaa ja ajaa käyttöliittymän
         *********************************************************************/ 
        int resolutionX = 800;
        int resolutionY = 640;
        
        GUI start = new GUI(resolutionX, resolutionY);
        start.run();
        
        /*********************************************************************
         * 2.
         * file_nameCV  - CV:n sijainti
         * file_nameMap - karttatiedosto
         * lukee muistiin tarpeelliset eri luokkien rakentamiseen tarvittavat
         * tiedot. Map ja CV olio luodaan näiden kahden perusteella.
         * Huom! Map ja CV olio halutaan vain konstruktoida kertaalleen.
         *********************************************************************/
    
        String file_nameCV = "";
        String file_nameMap = "";
    
        Map world = new Map(file_nameMap);
        CV story = new CV(file_nameCV);
    
    
    }
    
}
