import java.util.Scanner; 
import java.lang.Math;
public class Ch4Readin 
	{
		public static void main (String [] args)
			{
			Scanner input = new Scanner(System.in);

			/*
				Scanner input = new Scanner(System.in);
				System.out.print("Enter latitude and longitude in degrees");
				double x1 = input.nextDouble();
				double y1 = input.nextDouble();
				double x1Radians = Math.toRadians(x1);
				double y1Radians = Math.toRadians(y1);
				
				System.out.print("Enter latitude and longitude in degrees");
				double x2 = input.nextDouble();
				double y2 = input.nextDouble();
				double x2Radians = Math.toRadians(x2);
				double y2Radians = Math.toRadians(y2);
				
				double radius = 6371.01;
				
			    double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
			    	      Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
			    	      Math.cos(Math.toRadians(y1 - y2)));
				
				d = radius * Math.acos(sin(x1Radians)) * Math.sin(x2Radians) + Math.cos(x1Radians) * Math.cos(x2) * Math.cos(y1-y2);
				
			*/
			/*
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a side:");
			double side = input.nextDouble();
			double numerator = 6*(Math.pow(side, 2));
			double denominator = 4*Math.tan((Math.PI)/6);
			double area = Math.round(numerator/denominator);
			System.out.println("The area of the hexagon is " + area);
			*/
			/*
			double r = 40;
			double angle =  Math.random()*360;
			//1
			angle =  (Math.random()*360) * (Math.PI / 180);
			double x1 = r*Math.cos(angle);
			double y1 = r*Math.sin(angle);
			System.out.println(x1 + "," + y1);
			//2
			angle = Math.random()*360;
			double x2 = r*Math.cos(angle);
			double y2 = r*Math.sin(angle);
			System.out.println(x2 + "," + y2);

			//3
			angle = Math.random()*360;
			double x3 = r*Math.cos(angle);
			double y3 = r*Math.sin(angle);
			System.out.println(x3 + "," + y3);

			
			System.out.println("Enter an ASCII code: ");
			int ascii = input.nextInt();
			String character = Character.toString ((char)ascii);
			System.out.println(character);

			String set1 =
				      " 1  3  5  7\n" +
				      " 9 11 13 15\n" +
				      "17 19 21 23\n" +
				      "25 27 29 31";

				    String set2 =
				      " 2  3  6  7\n" +
				      "10 11 14 15\n" +
				      "18 19 22 23\n" +
				      "26 27 30 31";

				    String set3 =
				      " 4  5  6  7\n" +
				      "12 13 14 15\n" +
				      "20 21 22 23\n" +
				      "28 29 30 31";

				    String set4 =
				      " 8  9 10 11\n" +
				      "12 13 14 15\n" +
				      "24 25 26 27\n" +
				      "28 29 30 31";

				    String set5 =
				      "16 17 18 19\n" +
				      "20 21 22 23\n" +
				      "24 25 26 27\n" +
				      "28 29 30 31";

				    int day = 0;

				    // Create a Scanner
				    Scanner input = new Scanner(System.in);

				    // Prompt the user to answer questions
				    System.out.print("Is your birthday in Set1?\n");
				    System.out.print(set1);
				    System.out.print("\nEnter No or Yes: ");
				    char answer = input.next().charAt(0);

				    if (answer == 'Y')
				      day += 1;

				    // Prompt the user to answer questions
				    System.out.print("\nIs your birthday in Set2?\n");
				    System.out.print(set2);
				    System.out.print("\nEnter No or Yes: ");
				    answer = input.next().charAt(0);

				    if (answer == 'Y')
				      day += 2;

				    // Prompt the user to answer questions
				    System.out.print("Is your birthday in Set3?\n");
				    System.out.print(set3);
				    System.out.print("\nEnter No or Yes: ");
				    answer = input.next().charAt(0);

				    if (answer == 'Y')
				      day += 4;

				    // Prompt the user to answer questions
				    System.out.print("\nIs your birthday in Set4?\n");
				    System.out.print(set4);
				    System.out.print("\nEnter No or Yes: ");
				    answer = input.next().charAt(0);

				    if (answer == 'Y')
				      day += 8;

				    // Prompt the user to answer questions
				    System.out.print("\nIs your birthday in Set5?\n");
				    System.out.print(set5);
				    System.out.print("\nEnter No or Yes: ");
				    answer = input.next().charAt(0);

				    if (answer == 'Y')
				      day += 16;

				    System.out.println("\nYour birthday is " + day + "!");

				
					System.out.println("Enter a hex digit: ");
					
					String hexDigit = input.next();
					int decimal = Integer.parseInt(hexDigit, 16);
			        String binary = Integer.toBinaryString(decimal);
					System.out.println("The binary value is " + binary);
		
			
				System.out.println("Enter your letter grade: ");
				char letterGrade = input.next().charAt(0);
				
				int score = 0;
				
				if (letterGrade == 'F')
				{
					System.out.println("Your score is " + score);
				}
				else if (letterGrade == 'D')
				{
					++score;
					System.out.println("Your score is " + score);
				}
				else if (letterGrade == 'C')
				{
					score = 2;
					System.out.println("Your score is " + score);
				}
				else if (letterGrade == 'B')
				{
					score = 3;
					System.out.println("Your score is " + score);
				}
				else if (letterGrade == 'A')
				{
					score = 4;
					System.out.println("Your score is " + score);
				}
				else 
				{
					System.out.println("This is an invalid grade");
				}

			char randLetter = (char)(Math.random() * 26 + 'A');
			System.out.println(randLetter);

			System.out.print("Enter two characters: ");
		    String s = input.nextLine();
		    
		    if (s.charAt(0) == 'M')
		      System.out.print("Mathematics ");
		    else if (s.charAt(0) == 'C')
		      System.out.print("Computer Science ");
		    else if (s.charAt(0) == 'I')
		      System.out.print("Information Technology ");
		    else 
		    {
		      System.out.println("Input major code");
		      System.exit(1);
		    }

		    if (s.charAt(1) == '1')
		      System.out.println("Freshman");
		    else if (s.charAt(1) == '2')
		      System.out.println("Sophomore");
		    else if (s.charAt(1) == '3')
		      System.out.println("Junior");
		    else if (s.charAt(1) == '4')
		      System.out.println("Senior");
		    else 
		    {
		      System.out.println("Input status code");
		      System.exit(2);	
		    }

			
			System.out.print("Enter a string of letters: ");
			String word = input.next();
			int length = word.length();
			char firstLetter = word.charAt(0);
			System.out.println(firstLetter + " " + length);

			
			System.out.print("Enter string s1: ");
			String s1 = input.next();
			System.out.println("Enter string s2: ");
			String s2 = input.next();
			
			if (s1.indexOf(s2) != -1) {
			      System.out.println(s2 + " is a substring of " + s1);
			    }
			else {
			      System.out.println(s2 + " is not a substring of " + s1);
			    }

			System.out.print("Enter the first city: ");
			String c1 = input.next();
			System.out.print("Enter the second city: ");
			String c2 = input.next();
			System.out.print("Enter the third city: ");
			String c3 = input.next();
			
			if (c1.compareTo(c2) > 0) {
			      // Swap s1 with s2
			      String temp = c1;
			      c1 = c2;
			      c2 = temp;
			    }
			  
			    if (c2.compareTo(c3) > 0) {
			      // Swap s2 with s3
			      String temp = c2;
			      c2 = c3;
			      c3 = temp;
			    }  
			  
			    if (c1.compareTo(c2) > 0) {
			      // Swap s1 with s2
			      String temp = c1;
			      c1 = c2;
			      c2 = temp;
			    }
			  
*/
		    

		      
			
			
			
	}
}
