//Daniela Travieso && Alejandro Santacoloma
//95953348 && 53663449
//Lab9
//Flight stuff
import java.util.*;

public class Lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Creating first flight");
		
		System.out.println("What is the name of the flight?");
		String name1 = in.next();
		
		System.out.println("What is the destination of the flight?");
		String dest1 = in.next();

		System.out.println("What is the departure time of the flight?");
		String time1 = in.next();

		System.out.println("What is the departure gate of the flight?");
		String dept1 = in.next();

		System.out.println("");

		Flight flight1 = new Flight(name1, dest1, time1, dept1);
		
		System.out.println("Creating second flight");
		
		System.out.println("What is the name of the flight?");
		String name2 = in.next();
		
		System.out.println("What is the destination of the flight?");
		String dest2 = in.next();

		System.out.println("What is the departure time of the flight?");
		String time2 = in.next();

		System.out.println("What is the departure gate of the flight?");
		String dept2 = in.next();

		System.out.println("");
		
		Flight flight2 = new Flight(name2, dest2, time2, dept2);

		printMenu();
		int input = in.nextInt();
		do
		{
			
			if(input == 1)
			{
				System.out.println("Which flight would you like to print the info of (1 or 2)");
				int flightNum = in.nextInt();
				if( flightNum == 1){
					flight1.printFlight();
				}
				else if (flightNum ==2){
					flight2.printFlight();

				}
				else{
					System.out.println("Invalid choice");
				}
			}
			else if(input == 2)
			{
				//complete
				System.out.println("This is the number of flights: " + Flight.numOfFlights);
				
			}
			else if (input == 3)
			{
				System.out.println("Which flight would you like to change the departure time of (1 or 2)");
				int flightNum = in.nextInt();
				if( flightNum == 1){
					System.out.print("What is the new departure time?");
					String newTime = in.next();
					flight1.changeDeptTime(newTime);
				}
				else if (flightNum ==2){
					System.out.print("What is the new departure time?");
					String newTime = in.next();
					flight2.changeDeptTime(newTime);
				}
				else{
					System.out.println("Invalid choice");
				}
			}
			else if (input ==4)
			{
				System.out.println("Which flight would you like to change the departure gate of (1 or 2)");
				int flightNum = in.nextInt();
				if( flightNum == 1){
					System.out.print("What is the new departure gate?");
					String newGate = in.next();
					flight1.changeGate(newGate);
				}
				else if (flightNum ==2){
					System.out.print("What is the new departure time?");
					String newGate = in.next();
					flight2.changeGate(newGate);
				}
				else{
					System.out.println("Invalid choice");
				}
			}
			else if (input == 5)
			{
				System.exit(0);
			}
			else
			{
				System.out.print("Invalid choice");
			}
			printMenu();
			input = in.nextInt();
			
		}while(input!= 5);
		
	}
	public static void printMenu()
	{
		System.out.println("Now what would you like to do?");
		System.out.println("1. Print out a flight's info \n 2. Print out the number of flights through the static variable \n 3. Change the departure time of a flight \n 4. Change the departure gate of a flight \n 5. Exit");
		
	}

}
