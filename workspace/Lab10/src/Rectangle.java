
public class Rectangle extends Shape
{
	static double height;
	static double width;
	public Rectangle(String color, double height, double width)
	{
		super(color);
		this.height = height;
		this.width = width;
	}
	public static double calculateArea()
	{
		double area = height*width;
		return area;
	}
	public static String twoString()
	{
		String info = "Color: " + color +"\nHeight: " + height + "\nWidth: " + width + "\nArea: " + Rectangle.calculateArea();
		return info;
	}

}
