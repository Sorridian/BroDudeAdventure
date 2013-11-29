package finalProject;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;

import javax.swing.ImageIcon;

public class BroDude extends PlayerBase implements EnviromentObject
{
	int x, y;
	int changeX, changeY;
	
	private static String left = "src/data/brodudeleft.png";
	private static String right = "src/data/broduderight.png";
	
	private ArrayList <Bullet> Bullets = new ArrayList <Bullet>();

	public BroDude()
	{
		super(left,right,"right");
		x = 10;
		y = 570;
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
		   
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		{
			changeX = -1;
			still = super.left.getImage();
		}
		
		if (key == KeyEvent.VK_RIGHT)
		{
			changeX = 1;
			still = super.right.getImage();
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

	@Override
	public void OnCollision() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MoveRight() {
		// TODO Auto-generated method stub
		changeX = 1;
	}

	@Override
	public void MoveLeft() {
		// TODO Auto-generated method stub
		changeX = -1;
	}

	@Override
	public void MoveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MoveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		x = x + changeX;
		y = y + changeY;
	}
}

