
public class Triangle extends Shape
{
	static double height;
	static double base;
	
	public Triangle(String color, double height, double base)
	{
		super(color);
		this.height = height;
		this.base = base;
	}
	public static double calculateArea()
	{
		double area = 0.5*height*base;
		return area;
	}
	public static String twoString()
	{
		String info = "Color: " + color +"\nHeight: " + height + "\nBase: " + base + "\nArea: " + Triangle.calculateArea();
		return info;
	}

}
