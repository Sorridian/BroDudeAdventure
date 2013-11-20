package finalProject;

import javax.swing.JFrame;

/**
 *Creates a frame that will call a method to draw a level and a character into the frame, then allow the player to move left or right in the window.
 *We used a tutorial to help get us started and understand how to create the methods and classes required to make the character move in the window.
 *We will use this tutorial as our jumping off point.
 *@author Derek Borden, Stephen Marsh and Charles Dieffenbach
 *@date 11/10/2013
 *@course CIS 111B Online
 *@instructor Dr. Kendall Martin
 * 
*/
public class Frame
{

	public static void main(String[] args)
	{
		new Frame();

	}
	
	 //Create a frame with a specific size to build the level for the character to interact with.
	 //Calls the GameWorld method to get the information and images for the background and character
	 //Have a way to exit the game, by closing the window
		

	public Frame()
	{
		JFrame frame = new JFrame("BroDude Adventure");
		frame.add(new GameWorld());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1152, 695);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
				
	}


}
