class Student extends Person
{
	//only choices available are protected or public
	protected int id;
	protected double gpa;
	
	//constructor
	Student(String n, int a,  double g, int i)
	{
		//extends the variables from Person class
		super(n,a);
		gpa = g;
		id = i;
	}
	
	//getters and setters
	public double getGPA()
	{
		return gpa;
	}
	public void setGPA(double g)
	{
		gpa = g;
	}
	public int getID()
	{
		return id;
	}
	
}