public class poop
{
public static void main(String[] args)
	{
		int n = 3;
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');

		public static void moveDisks(int n, char fromTower,
		char toTower, char auxTower) 
		{
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}