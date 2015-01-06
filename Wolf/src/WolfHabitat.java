import java.awt.*;
import java.applet.*;

public class WolfHabitat extends Applet {

	public void paint(Graphics g)
	{
		//Set color to light blue and draw sky
		g.setColor(new Color(100, 200, 255));
		g.fillRect(0, 0, 800, 350);
		
		//Set color to green and draw grass
		g.setColor(new Color(100, 255, 150));
		g.fillRect(0,350, 800, 250);
	}
	
}
