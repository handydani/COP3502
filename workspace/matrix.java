import java.util.*;
public class matrix{


 public static void main(String [] args){
	Scanner in = new Scanner(System.in);
	System.out.println("input matrix 1");
	int a1 = in.nextInt();
	int b1 = in.nextInt();
	int c1 = in.nextInt();

	System.out.println("input matrix 2");
	int a2 = in.nextInt();
	int b2 = in.nextInt();
	int c2 = in.nextInt();

	int i = b1*c2 + (-1)*b2*c1;
	int j = c1*a2 + (-1)*a1*c2;
	int k = a1*b2 + (-1)*b1*a2;

	int cross = a1*a2 + b1*b2 + c1*c2;
	int v1 = a1*a1 + b1*b1 + c1*c1;
	int v2 = a2*a2 + b2*b2 + c2*c2;

	System.out.println("Your cross product is: " + i + "," + j + "," +  k );
		System.out.println("Your dot product is: " + cross);
			System.out.println("The magnitude of v1 is: sqrt" + v1);
				System.out.println("The magnitude of v2 is: sqrt" + v2);


}
}