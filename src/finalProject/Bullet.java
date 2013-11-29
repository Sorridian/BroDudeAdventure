package finalProject;

import java.awt.*;

import javax.swing.ImageIcon;

public class Bullet
{	
	int x;
	int y;
	Image img;
	boolean visible;
	int speedX = 7;
	int speedY = -10;
	
	public Bullet(int startX, int startY)
	{
		x = startX;
		y = startY;
		ImageIcon newBullet = new ImageIcon("src/data/BroLava.png");
		img = newBullet.getImage();
		visible = true;		
	}
	
	public void move()
	{
		x += speedX;
		y += speedY++;
	}
	
	

}
