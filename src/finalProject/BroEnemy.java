package finalProject;

import java.awt.Rectangle;
import java.util.ArrayList;

public class BroEnemy extends PlayerBase implements EnviromentObject
{
	private int startingX;
	private int x, y;
	private int changeX, changeY;
	private Rectangle rect = new Rectangle();
	
	private static String left = "src/data/Spider.png";
	private static String right = "src/data/Spider.png";
	
	private ArrayList <Bullet> Bullets = new ArrayList <Bullet>();
	
	public BroEnemy(int x, int y)
	{
		super(left,right,"left");
		this.x = x;
		this.startingX = x;
		this.y = y;
		this.rect.setSize(100, 100);
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
		changeY = 1;
	}

	@Override
	public void MoveDown() {
		// TODO Auto-generated method stub
		changeY = -1;
	}

	private Boolean goingLeft = false;
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
		if (x<startingX + 100 && !goingLeft)
		{
			x++;
		}
		else if(x==startingX + 100 && !goingLeft)
		{
			goingLeft=true;
		}
		else if (goingLeft && x > startingX-100)
		{
			x--;
		}
		else
		{
			goingLeft = false;
		}
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}
	
}
