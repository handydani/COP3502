import java.util.*;

//Name: Daniela Travieso && Alejandro Santacoloma
//UFL ID: 95953348 && 53663349
//Section: 6909
//Project Number: 7
//Brief description of file contents: More Methods

public class Lab7 {
	
	public static boolean numberVerification(int n){
		String number = Integer.toString(n);
		
		//check 3 digits
		
		boolean result1 = false;
		if (number.length() == 3 ){
			result1 = true;
		}
		else {
			System.out.println("Invalid number");
			}
		
		//check repetitions
		boolean result2 = false;
		char ch1 = number.charAt(0);
		char ch2 = number.charAt(1);
		char ch3 = number.charAt(2);
		
		if (ch1 == ch2 || ch2 == ch3 || ch3 == ch1){
			result2 = false;
		}
		else{
			result2 = true;
		}
		
		// check result1 & result2
		boolean result3 = false;
		if (result1 == true && result2 == true){
			result3 = true;
		}
		
		return result3;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//generate randNumber
		int randNumber = (int)(Math.random()*1000);
		
		//check validity of randNumber
		boolean checkRandNumber = numberVerification(randNumber);
		while (checkRandNumber != true){
			randNumber = (int)(Math.random()*1000);
		}
		
		//guess
		System.out.println("Let's play baseball game!");
		boolean answer = false;
		do{
			System.out.print("What is your guess?: ");
			int inGuess = input.nextInt();

			//check inGuess
			boolean checkInGuess = numberVerification(inGuess);
			while (checkInGuess != true){
				System.out.println("you entered an incorrect number");

				System.out.println("\nWhat is your guess?: ");
				inGuess = input.nextInt();
			}
			
			//inGuess to string
			String sInGuess = Integer.toString(inGuess);
			//randNumber to string
			String sRandNumber = Integer.toString(randNumber);
			
					
			System.out.print("\nYou entered " + inGuess + " and the result is "+ answer + "\n");
			//put result
			if (baseballGame(sInGuess, sRandNumber) == true){
				System.out.println("Well done!");
				System.out.println("The number was "+ randNumber);
				System.exit(0);
			}
			
			
		}while(answer == false);

	}
	
	public static boolean baseballGame(String userInput, String secret){
		boolean scoreboard = false;
		String temp1 = "";
		String temp2 = "";
		//B's
		String Ball = "";
		System.out.print("B");
		for (int j = 0; j < 3; j++){
			for (int k = 0; k < 3; k++){
				if (userInput.charAt(j) == secret.charAt(k) && j != k){
					//temp1 = temp1 + "O";
					System.out.print("0");
				}
			}
		}
System.out.println("");
		//S's
System.out.print("S");
		int Strike = 0;
		int i = 0;
		for (i = 0; i < 3; i++){
			if (userInput.charAt(i) == secret.charAt(i)){
				//temp2 = temp2 + "O";
				++Strike;
				System.out.print("0");
			}
		}
		System.out.println("");
		if (Strike == 3){
			scoreboard = true;
		}

		//System.out.println("B " + temp1);	
		//System.out.println("S " + temp2);	

		return scoreboard;

}

	
	
	
}