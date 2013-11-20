package finalProject;

import javax.swing.JFrame;

public class Frame
{

	public static void main(String[] args)
	{
		new Frame();
	}
	
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
