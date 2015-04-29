package CV_Gamefication;
import javax.swing.SwingUtilities;

public class Main 
{
       /* 
        * Copyright: Tiamo Laitakari (Tiamo.Laitakari(ät)cs.helsinki piste äfii
    
        *   Main tekee:
        *   1.  alustaa ohjelman ja luo graaffisen käyttöliittymän.
        *   2.  lukee CV:n sisällön ja karttatiedoston sisällön. (pelillistys!)
        *   3.  Luodaan peli Map ja CV tiedoston pohjalta. (Konstruktoidaan Cardinal)
        *   4.  Suoritetaan pelin suoritus looppi.
    
        ::::: Luokat :::::
        * Main          
        - ohjelman ajo.
        
        * Cardinal
        - Pelin päärunko.
        - Ylläpitää primääri looppia. (ns. main logiikka)
    
        * GUI           
        - graaffinen käyttöliittymä
        
        * CV
        - lukee ja käsittelee CV:n sisällön ja muuttaa sen pelin sisäiseksi tarinaksi.
        
        * Map
        - lukee ja käsittelee kartta tiedoston sisällön ja muuttaa sen pelin sisäiseksi tarinaksi.
    
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
        SwingUtilities.invokeLater(start);
       
        
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
    
        /**********************************************************************
         * 3. 
         * Alustetaan pelimaailma CV ja Map filejen perusteella.
         * Maailma generaattori on käytännössä vastuussa koko pelin rakenteesta.
         * Pelin päälooppi kutsutaan myös tämän luokan kautta.  
         **********************************************************************/
        Cardinal CV_Art_Offline = new Cardinal(world, story);
        /* Sword Art Online tribuutti. */
        
        /**********************************************************************
         * 4.
         * (Cardinalin API dokumentaatio löytyy Cardinal tiedoston sisältä.)
         **********************************************************************/
    
        
        CV_Art_Offline.link_Start();
        
        /**************
         * Main loppuu!
         **************/
    }
    
}
