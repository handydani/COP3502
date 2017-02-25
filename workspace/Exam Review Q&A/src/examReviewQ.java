import java.util.*;
public class examReviewQ {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
/*		
		//what is output if you put 1,2,3
		System.out.println("Enter 3 numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double average = (number1 + number2 + number3) /3;
		System.out.println(average); //2.0
*/		
/*		//what does y =
		int x = 1;
		int y = x++ + x; // 2 + 1
		System.out.print(y); //3
*/		
/*		//what does y = 
		int x = 1;
		int y = ++x + x; // 2 + 2
		System.out.print(y); //4
*/
/*		//the following code displays
		double temperature = 50;
		if (temperature >= 100)
			System.out.print("too hot");
		else if (temperature <= 40)
			System.out.println("too cold");
		else
			System.out.println("just right"); // just right
*/
/*		//what is y after the following switch is executed
		int x = 3;
		int y = 4;
		switch (x+3){
		case 6: y = 0;
		case 7: y = 1;
		default: y +=1;}
		System.out.print(y);// y = 2
*/
/*		//what is the output
		boolean even = false;
		System.out.println(even ? "x" : "y"); // y 
*/
/*		//what kind of error will happen?
		String s = "sup; //compile error
*/
/*		//mult choice, which is true
		int count = 0;
				while (count<100){
					//point a
					System.out.print("Welcome to Java");
					count++;
					//point b
				}
				//point c
*/
/*		//how many times will it print java
		int count = 0;
		while (count++ <10){
			System.out.println("Welcome to Java");
		}
		//10 times
*/
/*		int count = 0;
		do {
			System.out.println("Welcome to Java");
			count++;
		} while (count<10);
		//10 times
*/
/*		//what is the output
		for (int i = 1; i <= 10; i++){
			System.out.print(i + " ");
			i++;
*/		//1 3 5 7 9	
/*		//how many times will there be an output
		for (int i = 0; i<10; i++)
			for (int j = 0; j < i; j++){
				System.out.println(i*j);
			}//45
*/		
/*		//will this terminate
		int balance = 10;
		while (true){
			if (balance < 9)
				break;
			balance = balance - 9;
		}
		//yes, the break ends the loop
*/
/*		//what is the output
		int num = 25;
		int i ;
		boolean x = true;
		
		for (i=2; i<num && x; i++){
			if (num % i == 0){
				x = false;
			}
		//i is 6 and x is false/ x is loop continuation condition
*/
/*		//what is sum after loop terminates
		int sum = 0;
		int item = 0;
		do {
		  item++;
		  if (sum >= 4)
		    continue;
		  sum += item;
		}
		while (item < 5);
		System.out.print(sum); //6
*/
/*		//how many iterations
		for (int i = 1; i < n; i++) {
		    // iteration
		  }
		//n-1
*/
/*		//will this terminate
		int balance = 10;
		while (true) {
		  if (balance < 9)
		    continue;
		  balance = balance - 9;
		//no
*/
/*		//what is the output
		for (int j = 0; j<5; j++){
		for (int k = 0; k <10 ; k++)
			System.out.print("* ");
			System.out.println();
		}
		//5x10 square of "*"
*/
		
		
		
	}
}
