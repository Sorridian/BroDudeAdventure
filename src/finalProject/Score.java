package finalProject;

public class Score {
	int playerscore;
	public Score()
{
	playerscore = 0;
}
	public void Add(int x)
	{
		playerscore = playerscore + x;
	}
	public int DisplayScore()
	{
		return playerscore;
	}
}
