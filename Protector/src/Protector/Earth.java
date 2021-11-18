package Protector;

import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Earth{
    public ImageIcon earth;
    public int x = 2;
    public int y = 100; 
    Earth(){
        earth = new ImageIcon(getClass().getResource("/Image/earth.png"));
    }
    
    
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,y,180,40));
    }
}