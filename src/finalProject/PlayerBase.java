package finalProject;

import java.awt.Image;

import javax.swing.ImageIcon;

public class PlayerBase 
{
	Image still;
	ImageIcon right;
	ImageIcon left;

	public PlayerBase(String left, String right, String Direction)
	{
		this.right = new ImageIcon(right);
		this.left = new ImageIcon(left);
		
		setImageFromDirection(Direction);
	}
	
	private void setImageFromDirection(String Direction)
	{
		switch(Direction.toLowerCase())
		{
		case "right":
			still = right.getImage();
			break;
		case "left":
			still = left.getImage();
			break;
		default:
			still = right.getImage();
			break;
		}
	}
	
	public Image getImage()
	{
		return still;
	}

}
