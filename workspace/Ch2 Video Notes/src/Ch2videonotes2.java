import java.util.Scanner;
public class Ch2videonotes2 
{
	public static void main (String [] args)
	
	{
		
		
		System.out.print("Enter the hours offset from GMT:");
		Scanner input = new Scanner(System.in);
		int hours = input.nextInt();
		
		//Unix epoch: Midnight Jan 1 1970
		//total milliseconds since unix epoch
		long totalMilliseconds = System.currentTimeMillis() ;
		
		// total seconds
		long totalSeconds = totalMilliseconds / 1000;
		
		//total minutes
		long currentSeconds = (int) (totalSeconds % 60);
		
		//current minute
		long totalMinutes = totalSeconds/60;
		
		//
		long currentMinute = (int) (totalMinutes % 60);
		
		long totalHours = totalMinutes / 60;
		long currentHour = (int) (totalHours % 24);
		
		long timezone = currentHour+hours;
		
		System.out.println("Current time is" + " " + timezone + ":" +currentMinute + ":" + currentSeconds + " " + "EST");
		
	}
}
