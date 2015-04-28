package CV_Gamefication;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/* ajaa ohjelman graaffisen käyttöliittymän. */


public class GUI implements Runnable 
{

    /* resoluutio */
    private static int resolutionX;
    private static int resolutionY; 
    
    private JFrame frame;

    /* konstruktori */
    public GUI(int resolutionX, int resolutionY) 
    {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public void run() 
    {
        frame = new JFrame("CV");
        frame.setPreferredSize(new Dimension(resolutionX, resolutionY));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) 
    {
    
    }

    public JFrame getFrame() 
    {
        return frame;
    }

}
