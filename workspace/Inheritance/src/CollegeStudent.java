
public class CollegeStudent extends Student 
{
	protected String major;
	
	public CollegeStudent(String n, int a,  double g, int i, String m) 
	{
		super(n,a,g,i);
		major = m;
	}
	String getMajor()
	{
		return major;
	}
	void setMajor(String m)
	{
		major = m;
	}
}
