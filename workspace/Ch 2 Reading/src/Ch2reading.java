import java.util.Scanner;
public class Ch2reading {
	
	public static void main (String[] args)
	{
		//variables
		//int j, k;
		//int i = j = k = 2;
		//k=2
		//j=k
		//i=j
		
		//final double pi = 3.14;
		
		//System.out.println(i + " " + j + " " + k + " " + pi );
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius:");
		double radius = input.nextDouble();
		
		double area = radius * radius * pi;
		
		System.out.println("The area for the circle of radius" + " " + radius + " " + "is" + " " + area);
		*/
		
		
		/*final double miles = 100;
		final double kilometersPerMile = 1.609;
		final double kilometers = miles * kilometersPerMile;
		System.out.println("Kilometers is equal to " + kilometers);
		*/
		
		//System.out.println( 12 % 4 );
		// 12/4 = 3
		//System.out.println( -12 % 4 );
		//System.out.println( 12 % -4 );

		// 4/12
		// Math.pow(a, b) = a^b
		/*
		System.out.println( (2+100) % 7 );
		System.out.println( 25.0/4 );
		
		System.out.println("25 / 4 is " + 25 / 4);
	    System.out.println("25 / 4.0 is " + 25 / 4.0);
	    System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
	    System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
				
	    System.out.println(Math.pow(2, 3.5));
		 *
		 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0/9) * (fahrenheit - 32); 
		System.out.println("Fahrenheit" + " " + fahrenheit + " is" + " " + celsius + " " + "in Celsius");
	

		//System.out.println((4/(3*(r+34) ) - (9*(a+bc) ) + ((3 + d(2+a)))/(a+bd)));
		double a = 6.5;
		a += a + 1;
		System.out.println(a);
		
		a = 6;
	    a /= 2;
	    System.out.println(a);
	
		int i = 10;
		int newNum = 10 * i++;
		System.out.print("i is " + i + " newNum is " + newNum);
		
		
		int i = 10;
		int newNum = 10 * ++i;
		System.out.print("i is " + i + " newNum is " + newNum);
		
		
		float f = 12.5F;
	    int i = (int)f;
	    System.out.println("f is " + f);
	    System.out.println("i is " + i);
	    
	    
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celisius:");
		double celsius = input.nextDouble();
		double fahrenheit = ((9/5) * celsius + 32);
		
		System.out.println(celsius + " is " + fahrenheit + " Fahrenheit.");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder:");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius*radius*Math.PI;
		double volume = area*length;
		
		System.out.println("The area of the cylinder is " + area);
		System.out.println("The volume of the cylinder is " + volume);

		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds:");
		double pounds = input.nextDouble();
		double kilograms = .454*pounds;
		System.out.println(pounds + " is " + kilograms + " kilograms");
		
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000:");
//*		double number = input.nextDouble();
//add the digits of a number		
		
		//System.out.println("The sum of the digits is " + );

	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of water in kg:");
		System.out.println("Enter initial temperature of water in Celsius:");
		System.out.println("Enter final temperature of water in Celsius:");
		double water = input.nextDouble();
		double initialTemperature = input.nextDouble();
		double finalTemperature = input.nextDouble();
		
		double energy = water * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + energy + " Joules");

		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration:");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		double length = (Math.pow(speed, 2) ) / (2 * acceleration);
		System.out.println("The minimum length needed for the airplane is " + length);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration:");


		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		System.out.println("Enter height in inches:");
		double weightlb = input.nextDouble();
		double heightin = input.nextDouble();
		
		//weightkg/h^2m
		double weightkg = weightlb * .45359237;
		double heightm = heightin * .0254;
		
		double bmi = weightkg / Math.pow(heightm, 2);
		System.out.println("BMI is " + bmi);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of a side of a hexagon:");
		double side = input.nextDouble();
		double area = (Math.pow(side, 2) * 3 * Math.pow(3, 1.0/2)) / 2;
		System.out.println("The area is " + area);

		double a = 1;
		double b = 2;
		System.out.println("a     b     pow(a, b)");
		System.out.println(a +"   " + b + "   " + Math.pow(a, b));

		double a2 = a++;
		double b2 = b++;
		System.out.println(a +"   " + b + "   " + Math.pow(a, b));

		double a3 = a++;
		double b3 = b++;
		System.out.println(a +"   " + b + "   " + Math.pow(a, b));
		
		double a4 = a++;
		double b4 = b++;
		System.out.println(a +"   " + b + "   " + Math.pow(a, b));

		double a5 = a++;
		double b5 = b++;
		System.out.println(a +"   " + b + "   " + Math.pow(a, b));
	
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate:");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double interest = balance*(interestRate/1200);
		System.out.println("The interest is " + interest);
*/	
		
		
	}
		
}
