import java.util.Scanner;
public class guessNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int number = (int)(Math.random() *101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100");
		int guess = -1;
		while (guess != number)
		{
			
			guess = input.nextInt();
			System.out.println("Guess again!");


			if (guess == number)
			{
				System.out.println("You are correct!");
			}
			
			else if (guess > number)
			{
				System.out.println("You are too high!");
			}
			else
			{
				System.out.println("You are too low");
			}
			
		}
	
	}

}
