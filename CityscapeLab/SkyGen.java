import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame; 
import java.util.Random;
public class SkyGen
{
    /** sH is screen height and sW is screen width. */
    private int sH;
    private int sW;
    /**
     * gets screen height and width from component
     */
    public SkyGen(int screenHeight, int screenWidth)
    {
        sH = screenHeight;
        sW = screenWidth;
    }
    /**
     * Used in component to draw the sky.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0,0,sW,sH);
        g2.draw(sky);
        g2.setColor(Color.CYAN);
        g2.fill(sky);
    }
}
