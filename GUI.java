import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import javax.swing.SwingUtilities;


/* Runs the graphical UI */


public class GUI implements Runnable  
{
    
    /* Resolution */
    private static int resolutionX;
    private static int resolutionY; 
    private Player player;
    private JFrame frame;
    GraphicsEngine GE;  

    /* Constructor */
    public GUI(int resolutionX, int resolutionY) 
    {   /*Player pos. hacked */
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        
        this.player = new Player(resolutionX/2, (resolutionY-(resolutionX/6)));
        this.GE = new GraphicsEngine(player);
       
    }

    @Override
    public void run() 
    {
        frame = new JFrame("Example");
        frame.setPreferredSize(new Dimension(resolutionX, resolutionY));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Create(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void Create(Container container) 
    {
        container.add(GE); // Renders player object.
        
        frame.addKeyListener(new EventHandler(player)); //Allows monitoring keybord input in swing utilities.
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
