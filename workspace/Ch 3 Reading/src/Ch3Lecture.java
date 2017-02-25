
public class Ch3Lecture 
{
		public static void main(String[] args) 
		{
			System.out.println("Statement 1");
			int x = 0;
			System.out.println("Statement 2");
			++x;
			System.out.println("Statement 3");
			x++;
			System.out.println("Statement 4");

			String month = "January";
			
			String testString = "January";
			if (testString.equals(month))
				System.out.println("They're the same");
			
			double num = 1.34567;
			String strDouble = String.format("%.1f", num);
			System.out.println(strDouble);
		}

		
}
