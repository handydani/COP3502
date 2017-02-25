import java.io.File;
import java.io.File.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class FileIO 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File text = new File("Input.txt");
		//I like big butts and I cannot lie
		Scanner scan = null;
		
		if(text.exists())
		{
			scan = new Scanner(text);
		}
		else
		{
			System.out.println("DNE");
			System.exit(0);
		}
		String[] words = new String[9];
		
			
		for(int i=0; i<9; i++)
		{
			words[i] = scan.next();
		}
		for(int i =0; i< words.length; i++)
		{
			System.out.print(words[i] + " ");
			//prints out I like big butts and I cannot lie
		}
		
		PrintWriter writer = new PrintWriter("Strings.txt");
		for (int i = 0; i< words.length; i++)
		{
			writer.print(words[i] + " ");
		}
		writer.println(". I also like boobs");
		writer.close();
		
//		File text2 = new File("Strings.txt");
//		Scanner scan2 = new Scanner(text2);
//		while (scan2.hasNext())
//		{
//			String[] arr;
//			
//			String word = scan2.next();
//			
//		}
		
		writer = new PrintWriter("longestWord.txt");
		int longestWordIndex = 0;
		for(int i = 1 ; i < words.length; i++)
		{
			if(words[longestWordIndex].length() <= words[i].length())
			{
				longestWordIndex = i;
			}
			
		}
		writer.print(words[longestWordIndex]);
		
		writer.close();
	}
	
}
