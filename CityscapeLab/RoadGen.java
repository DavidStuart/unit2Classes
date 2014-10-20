import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame; 
public class RoadGen
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int xroadLength;
    private int yroadHeight;
    /**
     * Gets the neccissary position info from component and remembers it.
     */
    public RoadGen(int x,int y, int roadLength, int roadHeight)
    {
        this.xroadLength = roadLength;
        this.yroadHeight = roadHeight;
        
        xLeft = x;
        yTop = y;
    }
    /**
     * Draws the Road using the position variables.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(this.xLeft,this.yTop,this.xroadLength,this.yroadHeight);
        g2.draw(road);
        g2.setColor(Color.BLACK);
        g2.fill(road);
    }
}
