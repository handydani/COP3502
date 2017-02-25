//Daniela Travieso && Alejandro Santacoloma
// 95953348 && 53663449
//COP3502
//Lab10 =  shapes n shit
import java.util.*;
public class Lab10 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		boolean exit = false;
		while(!exit)
		{
			System.out.println("How many shapes do you want to create?");
			int amt = in.nextInt();
			ArrayList <Shape> ShapeList = new ArrayList<Shape>();
			
			for(int i = 0; i < amt; i++)
			{
				System.out.println("What shape do you want to make (1 = circle, 2 = rectangle, 3 = triangle)");
				int choice = in.nextInt();
				if (choice == 1)
				{
					//circle;
					System.out.println("What color is this circle?");
					String clr = in.next();
					System.out.println("What's the radius?");
					Double rad = in.nextDouble();
//					Shape(clr)// .getColor();
					Circle c1 = new Circle(clr, rad);
					ShapeList.add(c1);
				}
				else if (choice == 2)
				{
					//rect
					System.out.println("What color is this rectangle?");
					String clr = in.next();
					System.out.println("What's the heght?");
					Double height = in.nextDouble();
					System.out.println("What's the width?");
					Double width = in.nextDouble();
					
					Rectangle r1 = new Rectangle(clr, height, width);
					ShapeList.add(r1);
				}
				else if (choice == 3)
				{
					//triangle
					System.out.println("What color is this triangle?");
					String clr = in.next();
					System.out.println("What's the heght?");
					Double height = in.nextDouble();
					System.out.println("What's the base?");
					Double base = in.nextDouble();
					
					Triangle t1 = new Triangle(clr, height, base);
					ShapeList.add(t1);
					
				}
				else
					System.out.println("Error, invalid option");
				
			}
			while(!exit)
			{
				System.out.println("Select an option: \n1. Display info for circles \n2. Display info for rectangles \n3. Display info for triangles \n4. Add another shape \n5. Exit");
				int choice = in.nextInt();
				switch(choice) 
				{
				case 1:
					//display info c
					int count = 1;
					for (int i = 0; i<ShapeList.size(); i++)
					{
						
						
						if (ShapeList.get(i) instanceof Circle)
						{
							System.out.println("------------");
							System.out.println("Circle " + count + "'s" + "info:");
							Circle.twoString();
							System.out.println("------------");
							count++;
						}
						
					}
					break;
				case 2:
					//display info r
					count = 1;
					for (int i = 0; i<ShapeList.size(); i++)
					{
						
						System.out.println("------------");
						System.out.println("Rectangle " + count + "'s" + "info:");
						Rectangle.twoString();
						System.out.println("------------");
						count++;
					}
					break;
				case 3:
					//display info t
					count = 1;
					for (int i = 0; i<ShapeList.size(); i++)
					{
						
						System.out.println("------------");
						System.out.println("Triangle " + count + "'s" + "info:");
						Triangle.twoString();
						System.out.println("------------");
						count++;
					}
					break;
				case 4:
					//add shape
					
					
					for(int i = 0; i < amt; i++)
					{
						System.out.println("What shape do you want to make (1 = circle, 2 = rectangle, 3 = triangle)");
						choice = in.nextInt();
						if (choice == 1)
						{
							//circle;
							System.out.println("What color is this circle?");
							String clr = in.next();
							System.out.println("What's the radius?");
							Double rad = in.nextDouble();
//							Shape(clr)// .getColor();
							Circle c1 = new Circle(clr, rad);
							ShapeList.add(c1);
						}
						else if (choice == 2)
						{
							//rect
							System.out.println("What color is this rectangle?");
							String clr = in.next();
							System.out.println("What's the heght?");
							Double height = in.nextDouble();
							System.out.println("What's the width?");
							Double width = in.nextDouble();
							
							Rectangle r1 = new Rectangle(clr, height, width);
							ShapeList.add(r1);
						}
						else if (choice == 3)
						{
							//triangle
							System.out.println("What color is this triangle?");
							String clr = in.next();
							System.out.println("What's the heght?");
							Double height = in.nextDouble();
							System.out.println("What's the base?");
							Double base = in.nextDouble();
							
							Triangle t1 = new Triangle(clr, height, base);
							ShapeList.add(t1);
							
						}
						else
							System.out.println("Error, invalid option");
						
					}
					
					
					break;
				case 5:
					//exit
					exit = true;
					break;
				default:
					System.out.print("Invalid");
					break;
				}
			}
			
		}

	}

}
