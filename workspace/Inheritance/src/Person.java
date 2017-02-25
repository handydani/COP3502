
public class Person 
{
	//data fields
	protected String name;
	protected int age;
	
	//constructor
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	//getters and setters
	public String getName()
	{
		return name;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public int getAge()
	{
		return age;
	}

}

