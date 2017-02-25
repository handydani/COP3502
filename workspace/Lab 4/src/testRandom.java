
public class testRandom 
{
	
	public static void main (String[] args)
	{
	/*	double randomNum = Math.random()*10;
		long randomRound = Math.round(randomNum);
		System.out.println(randomRound);*/
		
		//System.out.println(temp);
		
		int randomNum = (Math.random() <= .5) ? 0:1;
		
		String strParameter = "";
		if (randomNum == 0)
		{
			strParameter = "FALSE";

		}
		else
		{
			strParameter = "TRUE";

		}
		
		System.out.print(strParameter);

	}
}
