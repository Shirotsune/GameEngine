package CV_Gamefication;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import javax.swing.SwingUtilities;


/* ajaa ohjelman graaffisen käyttöliittymän. */


public class GUI implements Runnable  
{
    
    /* resoluutio */
    private static int resolutionX;
    private static int resolutionY; 
    private Player player;
    private JFrame frame;
    GraphicsEngine GE;  

    /* konstruktori */
    public GUI(int resolutionX, int resolutionY) 
    {   /*Player pos. hacked */
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        
        this.player = new Player(resolutionX/2, (resolutionY-(resolutionX/6)));
        this.GE = new GraphicsEngine(player);
       // SwingUtilities.invokeLater(this.GE);
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
        container.add(GE);
        
        frame.addKeyListener(new EventHandler(player));
    }

    public JFrame getFrame() 
    {
        return frame;
    }

    public void refresh()
    {
        GE.repaint();
    }
 
    
}
