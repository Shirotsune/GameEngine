package CV_Gamefication;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;


public class GraphicsEngine extends JPanel {

    private Player player;

    
    public GraphicsEngine(Player player) {
        this.player = player;
        super.setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        player.draw(graphics); /* Utilisation ok */
    }

}
