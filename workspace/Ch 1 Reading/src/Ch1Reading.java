import java.util.*;
public class Ch1Reading 
{

	public static void main (String [] args) 
	{
				
		double radius = 5.5;
		System.out.println("Perimeter is equal to" + " " + radius*2*Math.PI);
		System.out.println("Area is equal to" + " " + radius*radius*Math.PI);
		
		double speed = (14/45.5) * 60/1.6;
				/*
				 * 14/45.5 gives speed in km/min
				 * *60 gives km/h
				 *  /1.6 gives miles
				 */
		System.out.println("The runner runs" + " " + speed + " " + "miles per hour");
		
		//double speed2 = (24/100.53) * 60 * 1.6;
		double speed2 = ( 24 / (1 + (40 + 35.0 / 60) / 60) * 1.6);
		System.out.println("The runner runs" + " " + speed2 + " " + "kilometers per hour");

		
	}
}