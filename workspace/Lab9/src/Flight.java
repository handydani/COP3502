
public class Flight 
{
	String flightName;
	String destination;
	String departureTime;
	String departureGate;
	static int numOfFlights = 2;
	
	public Flight(String flightName, String destination, String departureTime, String departureGate)
	{
		this.flightName = flightName;
		this.destination = destination;
		this.departureTime = departureTime;
		this.departureGate = departureGate;
	}
	public static int getNumFlights()
	{
		return numOfFlights;
	}
	public void printFlight()
	{
		//print everything
		System.out.println("Flight name: " + flightName);
		System.out.println("Destination: " + destination);
		System.out.println("Departure time: " + departureTime);
		System.out.println("Departure gate: " + departureGate);

	}
	public void changeDeptTime(String input)
	{
		departureTime = input;
	}
	public void changeGate(String input)
	{
		departureGate = input;
	}
	public void changeDestination(String input)
	{
		destination = input;
	}
}
