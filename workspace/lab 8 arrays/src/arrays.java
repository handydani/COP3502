import java.util.*;
public class arrays 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide the size of the input array");
		int inputSize = in.nextInt();
		while (inputSize <= 0)
		{
				System.out.println("Invalid array size! Please try again");
				inputSize = in.nextInt();
		}
		//call on methods
		int[] userArray = createInputArray(inputSize, in); //correct
		checkAboveAndBelow(userArray); //correct
		splitArray(userArray); //correct
		int[][] user2DArray = create2DArray(in); //correct
//		sumRows(user2DArray);
		
	}
	public static int[] createInputArray(int size, Scanner in)
	{
		int[] anArray = new int[size];
		
		System.out.println("Please provide the values of the array separated by the return key");
		for(int i = 0; i<size; i++)
		{
			anArray[i] = in.nextInt();
		}
		String temp = "";
		for(int i = 0; i<size; i++)
		{
			
			temp = temp + anArray[i] + " ";
		}
		
		System.out.println("input array: " + temp);
		
		return anArray;
	}

	public static double computeAverage(int[] input)
	{
		double sum=0;
		for(int i =0; i<input.length; i++){
			sum += input[i];
		}
		return sum/input.length;
	}

	public static void checkAboveAndBelow(int[] input)
	{
		double average = computeAverage(input);
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i =0; i<input.length; i++)
		{
			if (input[i] % 2 == 0)
			{
				if(input[i]>= average)
				{
					evenSum++;
				}
			}
			else
			{
				if(input[i] >= average)
				{
					oddSum++;
				}
			}	
		}
		System.out.println("The array has "+ evenSum +" even numbers above the average and " + oddSum + " odd numbers above the average");
		
	}

	public static void splitArray(int[] input)
	{
		int number = 0;
		int[] evenArray;
		int[] oddArray;
		if(input.length % 2 == 0)
		{
			number = (input.length/2);
			evenArray = new int[number];
			oddArray = new int[number];
		}
		else
		{
			number = (input.length/2);
			evenArray = new int[number + 1];
			oddArray = new int[number];
		}
		
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i = 0; i<input.length; i++)
		{
			
			if(i % 2 ==0)
			{
				evenArray[evenIndex++] = input[i];
			}
			else
			{
				oddArray[oddIndex++] = input[i];
			}
			
		}

		System.out.println("The even indeces are ");
		for(int j =0; j<evenArray.length; j++)
		{
			System.out.println(" " + evenArray[j]);
		}		
		System.out.println("The odd indeces are ");
		for(int j =0; j< oddArray.length; j++)
		{
			System.out.println(" " + oddArray[j]);
		}
		
	}

	public static int[][] create2DArray(Scanner in)
	{
		System.out.println("Please enter the number of rows:");
		int row = in.nextInt();
		System.out.println("Please enter the number of columns:");
		int col = in.nextInt();
	
		int[][] anArray = new int[row][col];
		
		for(int i =0; i< row; i++)
		{
			System.out.println("You are now creating the array that is row " + i);
			int[] temp = createInputArray(row,in); //row size and scanner
			for(int j = 0; j< col; j++)
			{
				anArray[i][j] = temp[j];
			}
			
		}
		for(int i= 0; i<row ; i++)
		{
			String temp = "";
			for(int j = 0; j<col; j++)
			{
				temp = temp + anArray[i][j] + " ";
			}
			System.out.println(temp);
		}
		
		return anArray;
		
		
	}

	public static void sumRows(int[][] array2D)
	{
		int sum =0;
		for(int i = 0; i<array2D.length; i++)
		{
			for(int j = 0; j< array2D[i].length; j++)
			{
				
				sum += array2D[i][j];
				System.out.println("The sum of row " + i + " is:" + sum);
			}
		}
	}
	
}
