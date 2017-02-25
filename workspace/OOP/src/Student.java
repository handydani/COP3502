import java.util.*;
public class Student 
{
	//declaring global variables
	private String name;
	private String major;
	private int UFID;
	private String email;
	
	public static void main(String[] args) 
	{
		System.out.println("Enter your name, major, ufid, and email below:");
		
		Scanner in = new Scanner(System.in);
		
		String nam = in.nextLine();
		String maj = in.nextLine();
		int id = in.nextInt();
		String mail = in.next();
		
		//declaration
		Student input = new Student(nam, maj, id, mail);
		System.out.println("Here is your information:");
		System.out.println("Name: " + input.getName());
		System.out.println("Major: " + input.getMajor());
		System.out.println("ID: " + input.getUFID());
		System.out.println("Email: " + input.getEmail());
		//System.out.println(input);
		//common error ^^^ will print out a memory address
	}

	//constructor
	public Student(String n, String m, int u, String e)
	{
		name = n;
		major = m;
		UFID = u;
		email = e;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setMajor(String m)
	{
		major = m;
	}
	public String getMajor()
	{
		return major;
	}
	
	public void setUFID(int u)
	{
		UFID = u;
	}
	public int getUFID()
	{
		return UFID;
	}
	
	public void setEmail(String e)
	{
		email = e;
	}
	public String getEmail()
	{
		return email;
	}

}
