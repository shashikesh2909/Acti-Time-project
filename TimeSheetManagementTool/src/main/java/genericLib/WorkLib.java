package genericLib;

import java.util.Random;

public class WorkLib 
{
	public int getRandomNumber()
	{
		Random r = new Random();
		return r.nextInt(10000);
	}
}
