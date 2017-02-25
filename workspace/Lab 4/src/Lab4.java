//Name: Daniela Travieso //Luis Medina
//UFL ID: 95953348 //UFL ID: 11581149
//Section: 6909
//Project Number: 4
//Brief description of file contents: Math Functions and Strings

import java.util.Scanner;
public class Lab4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the first parameter (TRUE or FALSE)");
		String parameter = input.next();
		
		if (parameter.equals("TRUE") || parameter.equals("FALSE"))
		{
			
			System.out.println("Thanks");
			int randomNum = (Math.random() <= .5) ? 0:1;
			
			String strParameter = "";
			String parameter2 = "";
			
			if (randomNum == 0)
			{
				strParameter = "FALSE";
				parameter2 = "FALSE";
			}
			else
			{
				strParameter = "TRUE";
				parameter2 = "TRUE";

			}
			
			
			int randomNum2 = (Math.random() <= .5) ? 0:1;
			String andOr = "";
			
			if (randomNum2 == 0)
			{
				andOr = "OR";
			}
			else
			{
				andOr = "AND";
			}
			
			System.out.println("The program generates the second parameter " + parameter2);
		    System.out.println("The program generates operator " + andOr);
		    String result = "";
		    
		    if (andOr.equals("AND"))
			{
				if (strParameter.equals(parameter))
				{
					result = strParameter;
				}
				else
				{
					strParameter = "FALSE";
					result = strParameter;
				}
				
			}
		    else 
		    {
		    	if (strParameter.equals(parameter))
		    	{
		    		result = strParameter;
		    	} 
		    	else 
		    	{
		    		strParameter = "TRUE";
		    		result = strParameter;		    		
		    	}
		    }
		    
		    
		    
		    
			System.out.println(parameter + " " + andOr + " " + parameter2 + " the result is " + result);
			
			
		}
		
		
		else
		{
			System.out.println("Why");
		}
		
		System.out.println("Part II");
		System.out.println("Please enter a word: ");
		String word = input.next();
		int lengthWord = word.length();		
		
	    if (lengthWord % 2 == 0)
		{
	    	String s1 = word.substring(0, word.length()/2 -1);
	    	String s2 = word.substring(word.length()/2, word.length());
	    	System.out.print(s1+s2);

		}
	    else 
	    {
	    	String s1 = word.substring(0, word.length()/2);
	    	String s2 = word.substring(word.length()/2 +1, word.length());
	    	
	    	System.out.print(s1+s2);
	    }
	
	}

}
