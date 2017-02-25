
public class Circle extends Shape
{
	static double radius;
	public Circle(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	public static double calculateArea()
	{
		double areaCircle = Math.PI * radius * radius;
		return areaCircle;
	}
	public static void twoString()
	{
		String Info = "Color: " + color +"\nRadius: "+radius+"\nArea: "+ Circle.calculateArea();
		System.out.println(Info);
	}

}
