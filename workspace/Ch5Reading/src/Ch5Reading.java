import java.util.*;
public class Ch5Reading {
	public static void main (String[] args)
	{
	   
		Scanner input = new Scanner(System.in);
/*
	  final int NUMBER_OF_QUESTIONS = 10; // Number of questions
	    int correctCount = 0; // Count the number of correct answers
	    int count = 0; // Count the number of questions
	    long startTime = System.currentTimeMillis();
	    String output = ""; // output string is initially empty
	    
	    while (count < NUMBER_OF_QUESTIONS) {
	      // 1. Generate two random single-digit integers
	      int number1 = (int)(Math.random() * 15);
	      int number2 = (int)(Math.random() * 15);

	      // 2. If number1 < number2, swap number1 with number2
	      if (number1 < number2) {
	        int temp = number1;
	        number1 = number2;
	        number2 = temp;
	      }

	      // 3. Prompt the student to answer “What is number1 – number2?”
	      System.out.print(
	        "What is " + number1 + " - " + number2 + "? ");
	      int answer = input.nextInt();

	      // 4. Grade the answer and display the result
	      if (number1 - number2 == answer) {
	        System.out.println("You are correct!\n");
	        correctCount++;
	      }
	      else
	        System.out.println("Your answer is wrong.\n" + number1 
	          + " - " + number2 + " should be " + (number1 - number2) + "\n");

	      // Increase the count
	      count++;

	      output += "\n" + number1 + "-" + number2 + "=" + answer + 
	        ((number1 - number2 == answer) ? " correct" : " wrong");
	    }

	    long endTime = System.currentTimeMillis();
	    long testTime = endTime - startTime;

	    System.out.println("Correct count is " + correctCount + 
	      "\nTest time is " + testTime / 1000 + " seconds\n" + output);

		
		
		System.out.println("Miles\t\tKilometers\t\tMiles\t\tKilometers");
		int miles = 1;
		for (miles = 1; miles <= 10; miles++)
		{
			double kilo = miles * 1.609;
		}
		int miles2 = 20;
		for(miles2=20 ; miles2<=65 ; miles2++)
		{
			double kilo2 = miles2 * 1.609;
			System.out.println(miles2 + "\t\t"+ kilo2);
		}
		System.out.println(miles +"\t\t"+ kilo + "\t\t"+ miles2 + "\t\t" + kilo2);

		
		
		System.out.printf("%10s%10s    |  %10s%10s\n", "Miles", "Kilometers",
		        "Kilometers", "Miles");
		    System.out.println("---------------------------------------------");

		    // Use while loop
		    int miles = 1;
		    int kilometers = 20;
		    int count = 1;
		    while (count <= 10) {
		      System.out.printf("%10d%10.3f    |  %10d%10.3f\n", miles, miles * 1.609,
		          kilometers, kilometers / 1.609);
		      miles++;
		      kilometers += 5;
		      count++;
		    }

		    /*
		     * Use for loop int miles = 1; int kilometers = 20; for (int count = 1;
		     * count <= 10; miles++, kilometers += 5, count++) {
		     * System.out.printf("%10d%10.3f    |  %10d%10.3f\n", miles, miles * 1.609,
		     * kilometers, kilometers / 1.609); }
		     */
		 /*   
		int count = 100;
		for (count=100; count<=1000; count++){
			
			int divisibleBy5 = count%5;
			int divisibleBy6 = count%6;
			
			if (divisibleBy5 == 0){
				System.out.println(count);
			}
			else if (divisibleBy6 == 0){
				System.out.println(count);
			}
			else {
				
			}
		}
		*/
	/*	
		int count = 1;
	    for (int i = 100; i <= 1000; i++)
	      if (i % 5 == 0 && i % 6 == 0)
	        System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
	 
		
	
	 System.out.print(
      "Enter the number of students: ");
    int numOfStudents = input.nextInt();

    System.out.print(
      "Enter a student name: ");
    String student1 = input.next();
    System.out.print(
      "Enter a student score: ");
    double score1 = input.nextDouble();

    for (int i = 0; i < numOfStudents - 1; i++) {
      System.out.print(
        "Enter a student name: ");
      String student = input.next();

      System.out.print(
        "Enter a student score: ");
      double score = input.nextDouble();

      if (score > score1) {
        student1 = student;
        score1 = score;
      }
    }

    System.out.println("Top student " +
      student1 + "'s score is " + score1);
			
			
		}
		

		
		int n = 1; 
		while (n*n <= 12000)
		{
			n++;
		}
		System.out.println("The number is " + n);
*/		
		
		
		
		
	}	
}
