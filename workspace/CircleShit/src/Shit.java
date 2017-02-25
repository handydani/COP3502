
public class Shit 
{
	private double radius;
	
	public Shit()
	{
		radius = 0;
	}
	
	public Shit(double newRadius)
	{
		this.radius = newRadius;
	}
	double getArea()
	{
		return Math.PI * radius * radius;
	}
	double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	public void setRadius(double newRadius)
	{
		this.radius = newRadius;
	}
	public static void main(String[] args) 
	{
		 

	}

}
