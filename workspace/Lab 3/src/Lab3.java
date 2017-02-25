//Name: Daniela Travieso
//UFL ID: 95953348
//Section: 6909
//Project Number: 1
//Brief description of file contents: User Input and Selection

import java.util.Scanner;

public class Lab3 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("|DATE CALCULATOR|");
		System.out.println("");
		System.out.println("0. Sunday");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("");
		System.out.print("What day of the week is it: ");

		int current = input.nextInt();
		if (current < 0)
		{
			System.out.println("Invalid input.");

		}
		else if (current > 6)
		{
			System.out.println("Invalid input.");
		}
		else
		{
			System.out.print("Enter the number of days in the future: ");
			
			int days = input.nextInt();
			int shift = days % 7;
			int future = (shift + current) % 7;	
			
			String dayOfTheWeek = "";
			String dayOfTheWeek2 = "";
			
			switch (future)
			{
			case 0: dayOfTheWeek2 = "Sunday"; break;
			case 1: dayOfTheWeek2 = "Monday"; break;
			case 2: dayOfTheWeek2 = "Tuesday"; break;
			case 3: dayOfTheWeek2 = "Wednesday"; break;
			case 4: dayOfTheWeek2 = "Thursday"; break;
			case 5: dayOfTheWeek2 = "Friday"; break;
			case 6: dayOfTheWeek2 = "Saturday"; break;
			}
			
			switch (current)
			{
			case 0: dayOfTheWeek = "Sunday"; break;
			case 1: dayOfTheWeek = "Monday"; break;
			case 2: dayOfTheWeek = "Tuesday"; break;
			case 3: dayOfTheWeek = "Wednesday"; break;
			case 4: dayOfTheWeek = "Thursday"; break;
			case 5: dayOfTheWeek = "Friday"; break;
			case 6: dayOfTheWeek = "Saturday"; break;
			}
			
			System.out.println("Today is " + dayOfTheWeek + " and in " + days + " days it will be a " + dayOfTheWeek2 + "!");

			
		}
	}
}
