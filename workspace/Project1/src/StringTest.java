
public class StringTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int playerId = 249;
		/*String strPlayerId = String.valueOf(playerId);
		String playerIdDigits = strPlayerId.substring(strPlayerId.length()-2);
		int playerIdDigitsNumeric = Integer.parseInt (playerIdDigits);
		
		if (playerIdDigitsNumeric <= 49 && playerIdDigitsNumeric >= 0)
		{
			System.out.println("The player is on the lucky list");
		}
		else 
		{
			System.out.println("The player is on the normal list");
		}*/
		int playerIdDigits = playerId % 100;

		if (playerIdDigits <= 49 && playerIdDigits >= 0)
		{
			System.out.println("The player is on the lucky list");
		}
		else 
		{
			System.out.println("The player is on the normal list");
		}
	}

}
