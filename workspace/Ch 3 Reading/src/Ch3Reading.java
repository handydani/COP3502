import java.util.Scanner;
public class Ch3Reading 
{
	public static void main (String [] args)
	{
		/*
		
		if (___)
		{
			statement;
		}
		
		else
		{
			statement;
			print;
		}
		
		*/
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter your score:");
		double score = input.nextDouble();
		double payInitial = 8.5;
		double payInitial2 = payInitial + payInitial*.01;
		double payFinal = payInitial + payInitial*.03;
			if (score > 90)
			{
				System.out.println("Your pay is " + payFinal);
			}
			else
			{
				System.out.println("Your pay is " + payInitial2);
			}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for x and y:");

		int x = input.nextInt();
		int y = input.nextInt();
		int z ;
		
		if ( x > 2 ) 
		{
		      if (y > 2) 
		      {
		        z = x + y;
		        System.out.println("z is " + z);
		      }
		}
		else
	      System.out.println("x is " + x);
		*/
		
		//System.out.println((int)(Math.random() * 2));
		
		/*
		
		Scanner input = new Scanner(System.in);
		//add 3 integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int ans = number1 + number2 + number3;
		//question
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		int response = input.nextInt();
		*/
		/*
		if (response == ans)
		{
			System.out.println("You are correct!");
		}
		else 
		{
			System.out.println("Sorry, try again");
		}
		

		/*
		//randomly generate a number between 1 and 12
		int number = ((int)(Math.random() * 12) + 1);
		//assign numbers to months
		if (number == 1)
		{
			System.out.println("The month is January");
		}
		if (number == 2)
		{
			System.out.println("The month is Feb");
		}
		if (number == 3)
		{
			System.out.println("The month is Mar");
		}
		if (number == 4)
		{
			System.out.println("The month is Apr");
		}
		if (number == 5)
		{
			System.out.println("The month is May");
		}
		if (number == 6)
		{
			System.out.println("The month is Jun");
		}
		if (number == 7)
				{
			System.out.println("The month is July");
		}
		if (number == 8)
				{
			System.out.println("The month is Aug");
		}
		if (number == 9)
				{
			System.out.println("The month is Sept");
		}
		if (number == 10)
				{
			System.out.println("The month is Oct");
		}
		if (number == 11)
				{
			System.out.println("The month is Nov");
		}
		if (number == 12)
				{
			System.out.println("The month is Dec");
		}
		//displays it
		
		*/
		/*
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight: ");
		double weight = input.nextDouble();
		System.out.println("Enter feet: ");
		double feet = input.nextDouble();
		System.out.println("Enter inches: ");
		double inches = input.nextDouble();
		
		double height = 12*feet + inches;
		double bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254));
		
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");

		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 integers: ");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
			 	all possibilities
				 * num1>num2>num3, num1>num3>num2
				 * num2>num1>num3, num2>num3>num1
				 * num3>num1>num2, num3>num2>num1
		*/
		/*
	?	if (number1 > number2) {
		      int temp = number1;
		      number1 = number2;
		      number2 = temp;
		    }

		    if (number2 > number3) {
		      int temp = number2;
		      number2 = number3;
		      number3 = temp;
		    }

		    if (number1 > number2) {
		      int temp = number1;
		      number1 = number2;
		      number2 = temp;
		    }
		    System.out.println("The sorted numbers are "
		    	      + number1 + " " + number2 + " " + number3);

		
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3 digit number to check if it is a palindrome: ");
		double number = input.nextDouble();
		
		int lastDigit = (int)number % 10;
		int firstDigit = (int)number/100;
		
		if (lastDigit == firstDigit)
		{
			System.out.println("The number is a palindrome");
		}
		else 
		{
			System.out.println("The number is not a palindrome");
		}
		
		
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 2);

		   
		System.out.print("Guess heads or tails");
		int guess = input.nextInt();
		
	
		if (guess == number)
		{
			System.out.println("Correct!");
		}
		
		else 
		{
			System.out.println("Incorrect");
		}
		
			

		System.out.println(number);
		*/
		/*
		int x = (int)(Math.random() * 100 - 50);
	    int y = (int)(Math.random() * 200 - 100);
	    
	    System.out.println(x + ", " + y);
	    // -50 < x < 50
		// -100 < x < 100
		*/
		
	/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a weight for your package: ");
		double weight = input.nextDouble();
		
		
		if (weight <= 1)
		{
			System.out.println("Your price is 3.5");
		}
		//...
		//else if (weight <= 3)
		//else ...;
/*
		System.out.print("Enter two points of x and y: ");
		Scanner input = new Scanner(System.in);
		double xValue = input.nextDouble();
		double yValue = input.nextDouble();
		double distance = Math.pow((xValue*xValue) + (yValue*yValue), 0.5);
		
		if (distance <= 10)
		{
			System.out.println("Point " + xValue + " " + yValue + " is in the circle");
		}
		else
		{
			System.out.println("Point " + xValue + " " + yValue + " is not in the circle");
		}
		*/
	/*	 
	    final int NUMBER_OF_CARDS = 52;

		int number = (int)(Math.random() * NUMBER_OF_CARDS);

		    System.out.print("The card you picked is ");
		    if (number % 13 == 0)
		      System.out.print("Ace of ");
		    else if (number % 13 == 10)
		      System.out.print("Jack of ");
		    else if (number % 13 == 11)
		      System.out.print("Queen of ");
		    else if (number % 13 == 12)
		      System.out.print("King of ");
		    else
		      System.out.print((number % 13) + " of ");

		    if (number / 13 == 0)
		      System.out.println("Clubs");
		    else if (number / 13 == 1)
		      System.out.println("Diamonds");
		    else if (number / 13 == 2)
		      System.out.println("Hearts");
		    else if (number / 13 == 3)
		      System.out.println("Spades");
		  
		
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		System.out.println("Is " + integer + " divisible by 5 and 6? " + (integer % 5 == 0 && integer % 6 == 0));

		System.out.println("Is " + integer + " divisible by 5 or 6? " + (integer % 5 == 0 || integer % 6 == 0));;

		System.out.println("Is " + integer + " divisible by 5 or 6? " + (integer % 5 == 0 ^ integer % 6 == 0));;


		//System.out.println("Is " + + " divisible by 5 and 6?");
		//System.out.println("Is " + + " divisible by 5 or 6, but not both?");
		*/
		/*
			    Scanner input = new Scanner(System.in);

			    System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
			    double x1 = input.nextDouble();
			    double y1 = input.nextDouble();
			    double w1 = input.nextDouble();
			    double h1 = input.nextDouble();

			    System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
			    double x2 = input.nextDouble();
			    double y2 = input.nextDouble();
			    double w2 = input.nextDouble();
			    double h2 = input.nextDouble();
			    
			    double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1;
			    double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1;
			    
			    if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2)
			      System.out.println("r2 is inside r1");
			    else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2)
			      System.out.println("r2 overlaps r1");
			    else
			      System.out.println("r2 does not overlap r1");

		*//*
		// Prompt the user to enter the time zone offset to GMT
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the time zone offset to GMT: ");
	    long timeZoneOffset = input.nextInt();
	    
	    // Obtain the total milliseconds since the midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since the midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = (totalHours + timeZoneOffset) % 24;

	    // Display results
	    System.out.print("Current time is " + (currentHour % 12) + ":"
	      + currentMinute + ":" + currentSecond);
	    
	    if (currentHour < 12)
	      System.out.println(" AM");
	    else
	      System.out.println(" PM");    
		
		*/
	    Scanner input = new Scanner(System.in);
/*
	    System.out.print("Enter three points for p0, p1, and p2: ");
	    double x0 = input.nextDouble();
	    double y0 = input.nextDouble();
	    double x1 = input.nextDouble();
	    double y1 = input.nextDouble();
	    double x2 = input.nextDouble();
	    double y2 = input.nextDouble();

	    double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	    
	    if (status > 0) 
	      System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", "
	        + y0 + ") to (" + x1 + ", " + y1 + ")");
	    
	    else if (status == 0) 
	      System.out.print("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", "
	        + y0 + ") to (" + x1 + ", " + y1 + ")");
	    else
	      System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", "
	        + y0 + ") to (" + x1 + ", " + y1 + ")");
	  }
*/
	    
	    
	}
		
}
