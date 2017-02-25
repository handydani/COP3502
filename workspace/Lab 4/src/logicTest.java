
public class logicTest 
{

	public static void main(String[] args) 
	{
		String andOr = "OR";
		String parameter = "FALSE";
		String strParameter = "FALSE";
		if (andOr.equals("AND"))
		{
			if (strParameter.equals(parameter))
			{
				System.out.println(strParameter);
			}
			else
			{
				strParameter = "FALSE";
				System.out.println(strParameter);
			}
			
		}
	    else 
	    {
	    	if (strParameter.equals(parameter))
	    	{
	    		System.out.println(strParameter);
	    	} 
	    	else 
	    	{
	    		strParameter = "TRUE";
	    		System.out.println(strParameter);
	    		
	    	}
	    }
	}

}
