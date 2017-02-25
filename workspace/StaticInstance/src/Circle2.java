
public class Circle2 
{
	double radius;
	static int numberOfObjects = 0;
	
	Circle2() {
		radius = 1.0;
		numberOfObjects++;
	}
	Circle2 ( double newRadius){
		radius = newRadius;
		numberOfObjects++;
		
	}
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea(){
		return radius * radius * Math.PI;
	}
	public static void main(String[] args){
		
		System.out.println("Number of objects " + Circle2.getNumberOfObjects());
		
		System.out.println("Creating an Object...");
		Circle2 c1 = new Circle2();
		
		System.out.println("Number of objects " + Circle2.getNumberOfObjects());
		
		System.out.println("Creating another Object...");
		Circle2 c2 = new Circle2(14.3);
		System.out.println("Number of objects " + Circle2.getNumberOfObjects());
		System.out.println("The area of c1 " + c1.getArea());
		
		System.out.println("The area of c2 " + c2.getArea());

	}

}
