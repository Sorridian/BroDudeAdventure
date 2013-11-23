package finalProject;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class BroDude
{
int x;
int changeX;
int y;
int changeY;
Image still;
ImageIcon right = new ImageIcon("C:/BroDudeCharacterArrowRight.png");
ImageIcon left = new ImageIcon("C:/BroDudeCharacterArrowLeft.png");
private ArrayList <Bullet> Bullets = new ArrayList <Bullet>();

	public BroDude()
	{
		still = right.getImage();
		x = 10;
		y = 570;
	}
	
	public void move()
	{
		x = x + changeX;
		y = y + changeY;
		
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Image getImage()
	{
		return still;
	}
	
	
	public void keyPressed(KeyEvent e)
	{
		
		 /*switch (e.getKeyCode()) {
		   case KeyEvent.VK_UP:
		   break;

		   case KeyEvent.VK_DOWN:
		   break;

		   case KeyEvent.VK_LEFT:
		   break;

		   case KeyEvent.VK_RIGHT:
		   break;

		   case KeyEvent.VK_SPACE:
		   break;*/
		   
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		{
			changeX = -1;
			still = left.getImage();
		}
		
		if (key == KeyEvent.VK_RIGHT)
		{
			changeX = 1;
			still = right.getImage();
		}
		
		if (key == KeyEvent.VK_CONTROL)
		{
			shoot();
		}

	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		changeX = 0;
		
		if (key == KeyEvent.VK_RIGHT)
		changeX = 0;
	
	}
	
	public void shoot()
	{
		Bullet B = new Bullet(x, y);
		Bullets.add(B);
	}
	
	public ArrayList getBullets()
	{
		return Bullets;
	}
}

