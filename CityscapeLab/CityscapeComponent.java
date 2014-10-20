import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**Magic numbers for the Objects*/
    static final double ROAD_HEIGHT = .2;
    static final double BUILD1_HEIGHT = .3;
    static final double BUILD1_POS = .1;
    static final double BUILD2_HEIGHT = .1;
    static final double BUILD2_POS = .3;
    static final double BUILD3_HEIGHT = .5;
    static final double BUILD3_POS = .65;
    /**
     * Gets the current screen height and width
     * calculates heights and positions for all objects
     * draws objects
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        int screenLength = this.getWidth();
        int screenHeight = this.getHeight();
        
        int roadHeight = (int)(this.getHeight()*ROAD_HEIGHT);
        
        int building1Height = (int)(screenHeight*BUILD1_HEIGHT);
        int building1Pos = (int)(screenLength*BUILD1_POS);
        
        int building2Height = (int)(screenHeight*BUILD2_HEIGHT);
        int building2Pos = (int)(screenLength*BUILD2_POS);
        
        int building3Height = (int)(screenHeight*BUILD3_HEIGHT);
        int building3Pos = (int)(screenLength*BUILD3_POS);
        
        SkyGen sky = new SkyGen(screenHeight,screenLength);
        sky.draw(g2);
        
        BuildingGen build1 = new BuildingGen(building1Pos,building1Height,screenHeight-roadHeight,building1Pos + 20);
        build1.draw(g2);
        
        BuildingGen build2 = new BuildingGen(building2Pos,building2Height,screenHeight-roadHeight,building2Pos-20);
        build2.draw(g2);
        
        BuildingGen build3 = new BuildingGen(building3Pos,building3Height,screenHeight-roadHeight,building3Pos-350);
        build3.draw(g2);
        
        RoadGen road = new RoadGen(0,screenHeight-roadHeight,screenLength,roadHeight);
        road.draw(g2);
    }

}
