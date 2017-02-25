import java.util.Scanner;
import java.lang.Math;

public class CaptureCalculator 
{

	public static void main (String[] args)
	{
		
		System.out.println("Hello and welcome to the Monster Capture Possibility Calculator.");
		
		Scanner input = new Scanner(System.in);
		
		//monster information
		System.out.println("Please enter the latitude of the monster (1-10): ");
		int latitudeMonster = input.nextInt(); //y1

		System.out.println("Please enter the longitude of the monster (1-10): ");
		int longitudeMonster = input.nextInt(); //x1

		System.out.println("Please enter the time of the monster appear (1-1440):");
		int Ta = input.nextInt();

		System.out.println("Please enter the possible time of the monster will exist (10-59):");
		int Te = input.nextInt();

		//player information
		System.out.println("Please enter the player's ID (8 digits):");
		int playerId = input.nextInt();

		System.out.println("Please enter the time of the player noticing monster (1-1440 and greater than the time the monster appears):");
		int Tn = input.nextInt();

		System.out.println("Please enter the latitude of the player (1-10): ");
		int latitudePlayer = input.nextInt(); //y2

		System.out.println("Please enter the longitude of the player (1-10): ");
		int longitudePlayer = input.nextInt(); //x2

		System.out.println("Please enter the player's walking speed (10-200): \n");
		double S = input.nextInt();
		

		//determine player state
		
		//lucky/normal
		
		String strPlayerId = String.valueOf(playerId);
		String playerIdDigits = strPlayerId.substring(6);
		int playerIdDigitsNumeric = Integer.parseInt (playerIdDigits);
			
		//when player arrives (d formula and S)

		double x21 = Math.pow( ( ( longitudePlayer * 1000 ) - ( longitudeMonster * 1000 ) ), 2);
		double y21 = Math.pow( ( ( latitudePlayer * 1000 ) - ( latitudeMonster * 1000 ) ), 2);
		double d = Math.round ( ( Math.pow(x21 + y21, 0.5) ) * 10 ) / 10.0 ;
		double Tg = Math.round( ( (Tn + ( d / S ) ) * 10 ) ) / 10.0  ;
		int Tm = Ta + Te;
		double probability = ( (Tg - Tm) / Te) * 100 ;
			
			
		//lucky list
			
		if (playerIdDigitsNumeric <= 49 && playerIdDigitsNumeric >= 0)
			{
				//output framework
				
			System.out.println("Player " + playerId + " who is on the lucky list, ");
			System.out.println("noticed the monster at time " + Tn + ", ");
			System.out.println("is " + d + " m away from the monster, ");
			System.out.println("and will arrive at time " + Tg + ". ");
			System.out.println("The monster's disappear time is about " + Tm + ". ");
				
				//likeliness for lucky people
				
				if (Tg <= Tm)
					{
						String likeliness = "definitely";
						System.out.print("So the player will capture this monster with " + likeliness + " possibility.");
					}
				
				else 
					{

						if (probability > 0 && probability <= 10)
						{
							System.out.print("So the player will capture this monster with highly likely possibility.");
						}
						else if (probability > 10 && probability <= 30)
						{
							System.out.print("So the player will capture this monster with likely possibility.");

						}
						else if (probability > 30 && probability <= 40)
						{
							System.out.print("So the player will capture this monster with unsure possibility.");

						}
						else if (probability > 40 && probability <= 50)
						{
							System.out.print("So the player will capture this monster with unlikely possibility.");

						}
						else if (probability >50)
						{
							System.out.print("So the player will capture this monster with highly unlikely possibility.");
						}
						
					}
				
			}
			
			
		//normal
			
		else 
			{
				//output framework
				
			System.out.println("Player " + playerId + " who is on the normal list, ");
			System.out.println("noticed the monster at time " + Tn + ", ");
			System.out.println("is " + d + " m away from the monster, ");
			System.out.println("and will arrive at time " + Tg + ". ");
			System.out.println("The monster's disappear time is about " + Tm + ". ");
				
				//likeliness for unlucky people
				
				if (Tg <= Tm)
				{
					System.out.print("So the player will capture this monster with definitely possibility.");
				}
			
				else 
				{

					if (probability > 0 && probability <= 5)
					{
						System.out.print("So the player will capture this monster with highly likely possibility.");
					}
					else if (probability > 5 && probability <= 20)
					{
						System.out.print("So the player will capture this monster with likely possibility.");

					}
					else if (probability > 20 && probability <= 35)
					{
						System.out.print("So the player will capture this monster with unsure possibility.");

					}
					else if (probability > 35 && probability <= 40)
					{
						System.out.print("So the player will capture this monster with unlikely possibility.");

					}
					else if (probability > 40)
					{
						System.out.print("So the player will capture this monster with highly unlikely possibility.");
					}
					
				}
				
			}
			
	}
}

