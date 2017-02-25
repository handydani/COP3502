import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GraduateStudent extends Student
{
	
	private String major;
	private String advisor;
	
	public GraduateStudent(String name, String id, String essay, ArrayList<String> errorList, String major, String advisor)
	{
		super(name, id, essay, errorList);
		this.major = major;
		this.advisor = advisor;
	}

	public String getMajor()
	{
		return major;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	public String getAdvisor()
	{
		return advisor;
	}

	public void setAdvisor(String advisor)
	{
		this.advisor = advisor;
	}
	public void writeToFile()
	{
		//create file to store error list
		File response = new File(getId() + "_graded.txt");
		PrintWriter fileMaker = null;
		
		
//		if(response.exists())
//		{
//			//if the student has already been graded
//			System.out.println("File already exists");
//			System.exit(0);
//		}
		
		try {
			fileMaker = new PrintWriter(response);
		} catch (FileNotFoundException e) {
			System.out.println("File could not be written");
			e.printStackTrace();
		}
		
		fileMaker.println("Graduate Student " + getName());
		fileMaker.println("Student ID: " + getId());
		fileMaker.println("Major: " + getMajor());
		fileMaker.println("Advisor: " + getAdvisor());
		fileMaker.println(this.getPrintableErrorList());
		
		fileMaker.close();
	}

}
