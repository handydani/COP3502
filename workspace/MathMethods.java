import java.text.DecimalFormat;

public class MathMethods 
{

	public static void main(String[] args) 
	{
		System.out.println("PI value: " + Math.PI); 
		
		// abs() method gives a positive value
		System.out.println("Math.abs(-4.7): " + Math.abs(-4.7));
		System.out.println("Math.abs(4.7): " + Math.abs(4.7));          
		
		// ceil() rounds to a nearest higher integer
		  
		System.out.println("Math.ceil(4.7): " + Math.ceil(4.7));                                    
		System.out.println("Math.ceil(2.1): " + Math.ceil(2.1));                                    
		System.out.println("Math.ceil(-2.1): " + Math.ceil(-2.1));                                  
		 
		// floor() rounds to a nearest lower integer   
		System.out.println("Math.floor(2.9): " + Math.floor(2.9));
		System.out.println("Math.floor(-2.9): " + Math.floor(-2.9));
		  
		// round() as we do in math; >= 0.5 rounds to higher value else to the lower
		System.out.println("Math.round(2.7): " + Math.round(2.7));
		System.out.println("Math.round(2.3): " + Math.round(2.3));  
		System.out.println("Math.round(-2.8): " + Math.round(-2.8));
		
		// gives maximum of the two
		System.out.println("Math.max(3, 6.4): " + Math.max(3, 6.4));      
		
		// gives minimum of the two
		System.out.println("Math.min(3.2, 6.4): " + Math.min(3.2, 6.4));    
		
		// gives the power value, first value raised by second value
		System.out.println("Math.pow(3, 4): " + Math.pow(3, 4));        
		
		// gives a random number
		System.out.println("Math.random(): " + Math.random());      
		
		// returns the square root
		System.out.println("Math.sqrt(24.87): " + Math.sqrt(24.87));        
		
		// gives trigonometric value (parameter in radians)
		System.out.println("Math.sin(40): " + Math.sin(40));        
		System.out.println("Math.cos(40): " + Math.cos(40));      
		System.out.println("Math.tan(40): " + Math.tan(40));   
		
		System.out.println("Math.ulp(1): " + Math.ulp(1));
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println(fmt.format(0.5555));
	}

}
