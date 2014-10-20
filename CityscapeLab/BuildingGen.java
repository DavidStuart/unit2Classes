import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame; 
import java.util.Random;
/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildingGen
{
    /**x and y variables for the 2 points of the building*/
    private int xLeft;
    private int yTop;
    private int xRight;
    private int yBottom;
    private int yroadHeight;
    /**
     * sets values to the position variables
     */
    public BuildingGen(int xL,int y,int roadHeight,int xR)
    {
        this.yroadHeight = roadHeight;
        xLeft = xL;
        yTop = y;
        xRight = xR;
        yBottom = this.yroadHeight;
    }
    /**
     * Draw Method that is used in the component class
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(this.xLeft,this.yTop,xRight,yBottom);
        g2.draw(building);
        g2.setColor(Color.GRAY);
        g2.fill(building);
    }
}
