package finalProject;

import javax.swing.*;

import twitter4j.Twitter;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;


	public class GameWorld extends JPanel implements ActionListener
	{
		/**
		 * 
		 */
		private static final long	serialVersionUID	= 1L;
		private BroDude player;
		public Image img;
		Timer time;
		ArrayList<Bullet> Bullets = new ArrayList<Bullet>();
		ArrayList<BroEnemy> enemies = new ArrayList<BroEnemy>();
		
		public GameWorld()
		{	
			enemies.add(new BroEnemy(800,570));
			enemies.add(new BroEnemy(400,570));
			enemies.add(new BroEnemy(200,570));
			
			player = new BroDude();
			addKeyListener(new AL());
			setFocusable(true);
			ImageIcon background = new ImageIcon("src/data/BroDudeBackground.png");
			img = background.getImage();
			time = new Timer(5, this);
			time.start();
			Bullets = player.getBullets();
		}
		//Paints the background when an action is performed by the player
		public void actionPerformed(ActionEvent e)
		{
			repaint();
			player.Update();
			for(BroEnemy enemy : enemies)
			{
				enemy.Update();
			}
		}
		//Draws the images of the background and the player
		public void paint(Graphics g)
		{
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(img, 0, 0, null);
			
			g2d.drawImage(player.getImage(), (player.getX() - 50), (player.getY() - 25), null);
			
			for(BroEnemy enemy : enemies)
			{
				g2d.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(), null);
			}
			
			for (int i = 0; i < Bullets.size(); i++)
			{
				Bullet temp = Bullets.get(i);
				g2d.drawImage(temp.img, temp.x, temp.y, null);
				if(temp.x > 1152){
					Bullets.remove(i);
				}
				temp.move();
			}
		}
		//Gets the events that happen when a key is pressed and released.
		private class AL extends KeyAdapter
		{
			public void keyReleased(KeyEvent e)
			{
				player.keyReleased(e);
			}
			
			public void keyPressed(KeyEvent e)
			{
				player.keyPressed(e);
			}

		}

}
