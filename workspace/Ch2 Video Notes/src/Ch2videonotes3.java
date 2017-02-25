import java.util.Scanner;
public class Ch2videonotes3 
{
	public static void main (String[] args)
	{
		//allow for user input
		Scanner input = new Scanner(System.in);
		
		//user is prompted to input a percentage
		System.out.println("Enter annual interest rate eg, 7.25%");
		
		//user inputs a percentage
		double annualInterestRate = input.nextDouble();
		
		/*
		 * program takes the annual interest rate and converts
		 * it to a decimal and then converts it to a monthly
		 * interest rate
		 */
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//user is prompted to enter the years 
		System.out.print("Enter number of years as an integer, eg. 5:");
		
		//user inputs the amount of years
		int numberOfYears = input.nextInt ( );
		
		System.out.println("Enter loan amount, eg 120000.95%: ");
		double loanAmount = input.nextDouble();
		
		double monthlyPayment = ( loanAmount * monthlyInterestRate )/ (1 - (1/(Math.pow( 1 + monthlyInterestRate, numberOfYears))));
	
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100 / 100.0));
		System.out.println("The total payment is $" + (int) (totalPayment * 100 / 100.0));

	
	}
}
