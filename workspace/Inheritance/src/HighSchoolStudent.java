
public class HighSchoolStudent extends Student 
{
	protected int grLevel;
	
	public HighSchoolStudent(String n, int a,  double g, int i, int l) 
	{
		super(n,a,g,i);
		grLevel = l;
	}
	int getGrLevel()
	{
		return grLevel;
	}
	void setGrLevel(int gr)
	{
		grLevel = gr;
	}

}
