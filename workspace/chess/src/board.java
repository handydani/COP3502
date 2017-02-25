
import java.util.*;

public class board 
{
	public static void main(String[] args) 
	{
		char [][] board = new char[8][8];
		chess(board); // I'm funny
		
		Scanner in = new Scanner(System.in);
		System.out.println("Player 1, what is the piece you intend to move?");
		String piece = in.next();
		System.out.println("Player 1, what position would you like to move. Enter your x index first, then your y index");
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		
	}
//	public static boolean checkValidMove(char[][] x)
//	{
//		
//		if
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	return false;
//	}
	public static void chess(char [][] x)
	{

	      for (int row = 0; row < 8; row++)
	      {
	    	  for (int col = 0; col < 8; col++)
	            {
	                System.out.print(x[row][col] + " ");
	                if (row == 0 && col == 0 || row == 0 && col == 7 || row == 7 && col == 0 || row == 7 && col == 7)
	                {
	                    x[row][col] = 'r';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 0 && col == 1 || row == 0 && col == 6 || row == 7 && col == 1 || row == 7 && col == 6)
	                {
	                    x[row][col] = 'k';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 0 && col == 2 || row == 0 && col == 5 || row == 7 && col == 2 || row == 7 && col == 5)
	                {
	                    x[row][col] = 'b';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 0 && col == 3)
	                {
	                    x[row][col] = 'K';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 7 && col == 3)
	                {
	                    x[row][col] = 'Q';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 0 && col == 4)
	                {
	                    x[row][col] = 'Q';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 7 && col == 4)
	                {
	                    x[row][col] = 'K';
	                    System.out.print(x[row][col] + " ");
	                }
	                else if (row == 1 || row == 6)
	                {
	                    x[row][col] = '1';
	                    System.out.print(x[row][col] + " ");
	                }
	                else 
	                {
	                    x[row][col] = '-';
	                    System.out.print(x[row][col] + " ");
	                }
	            }
	            System.out.println();
	        }

		}
}
