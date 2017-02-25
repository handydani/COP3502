import java.util.*;
public class oop
{
	public static void main(String[] args)
	{
		oop c = new oop(2); // 2 is the argument
		System.out.println(c.getArea());
	}
}
public class oop
{
	private double radius;
	private double area;
	
	//constructor
	public oop(double r) 
	{
		radius = r;
		area = 3.14*r*r;
	}
	public void setRadius( double r )
	{
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*radius;
	}
}