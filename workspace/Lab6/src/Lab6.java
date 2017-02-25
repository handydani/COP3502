import java.util.Scanner;

//Name: Daniela Travieso
//UFL ID: 95953348 
//Section: 6909
//Project Number: 6
//Brief description of file contents: Lab6

public class Lab6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean operand1;
		boolean operand2;
		
		System.out.println("Operand 1: please enter either 0 or 1: ");
		int op1 = in.nextInt();
	
		if (op1 == 1)
			operand1 = true;
		else
			operand1 = false;
		
		System.out.println("Operand 2: please enter either 0 or 1: ");
		int op2 = in.nextInt();
		
		if (op2 == 1)
			operand2 = true;
		else			
			operand2 = false;
		
		//and(), or(), nor(), xor()
		
		System.out.println(operand1 + " AND " + operand2 + ": " + and(operand1, operand2));
		System.out.println(operand1 + " OR " + operand2 + ": " + or(operand1, operand2));
		System.out.println(operand1 + " NOR " + operand2 + ": " + nor(operand1, operand2));
		System.out.println(operand1 + " XOR " + operand2 + ": " + xor(operand1, operand2));

	}
	
	public static boolean and(boolean operand1, boolean operand2){
		boolean result = operand1 && operand2;
		return result;
	}

	public static boolean or(boolean operand1, boolean operand2){
		boolean result = operand1 || operand2;
		return result;
	}

	public static boolean nor(boolean operand1, boolean operand2){
		boolean result0 = operand1 || operand2;
		boolean result1 = !result0;
		return result1;
	}
	public static boolean xor(boolean operand1, boolean operand2){
		boolean result = operand1 ^ operand2;
		return result;
	}
}
