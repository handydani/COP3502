//Name: Daniela Travieso
//UFL ID: 95953348
//Section: 6909
//Project Number: 1
//Brief description of file contents: User Input and Selection

import java.util.Scanner;
public class Lab2 
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Please input the course number: ");
		int courseNumber = console.nextInt();
		System.out.print("Please input the time of your course, 8-12 for morning, and 1-5 for afternoon: ");
		int courseTime = console.nextInt();
		
		
			
		if (8 <= courseTime && courseTime <= 12 && courseNumber == 1100)
		{
			System.out.println("Your classroom is E119!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1100)
		{
			System.out.println("Your classroom is E210!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1101)
		{
			System.out.println("Your classroom is E118!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1101)
		{
			System.out.println("Your classroom is E119!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1102)
		{
			System.out.println("Your classroom is E117!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1102)
		{
			System.out.println("Your classroom is E118!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1103)
		{
			System.out.println("Your classroom is E210!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1103)
		{
			System.out.println("Your classroom is E117!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1104)
		{
			System.out.println("Your classroom is E211!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1104)
		{
			System.out.println("Your classroom is E212!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1105)
		{
			System.out.println("Your classroom is E213!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1105)
		{
			System.out.println("Your classroom is E211!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1106)
		{
			System.out.println("Your classroom is E214!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1106)
		{
			System.out.println("Your classroom is E213!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1107)
		{
			System.out.println("Your classroom is E215!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1107)
		{
			System.out.println("Your classroom is E214!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1108)
		{
			System.out.println("Your classroom is E216!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1108)
		{
			System.out.println("Your classroom is E215!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1109)
		{
			System.out.println("Your classroom is E217!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1109)
		{
			System.out.println("Your classroom is E216!");
		}
		
		else if (8 <= courseTime && courseTime <= 12 && courseNumber == 1110)
		{
			System.out.println("Your classroom is E212!");
		}
		
		else if (1 <= courseTime && courseTime <= 5 && courseNumber == 1110)
		{
			System.out.println("Your classroom is E217!");
		}
		
		else 
		{
			System.out.println("Invalid input");
		}
			
		
		
	}
}
