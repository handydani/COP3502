import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class HighSchoolStudent extends Student
{
	private String nameOfSchool;
	
	public HighSchoolStudent(String name, String id, String essay, ArrayList<String> errorList, String nameOfSchool)
	{
		super(name, id, essay, errorList);
		this.nameOfSchool = nameOfSchool;
	}

	public String getSchoolName()
	{
		return nameOfSchool;
	}
	
	public void setSchoolName(String schoolName)
	{
		nameOfSchool = schoolName;
	}

	public void writeToFile()
	{
		//create file to store error list
		File response = new File(getId() + "_graded.txt");
		PrintWriter fileMaker = null;
		
		if(response.exists())
		{
			//if the student has already been graded
			System.out.println("File already exists");
			System.exit(0);
		}
		
		try {
			fileMaker = new PrintWriter(response);
		} catch (FileNotFoundException e) {
			System.out.println("File could not be written");
			e.printStackTrace();
		}
		
		fileMaker.println("High School Student " + getName());
		fileMaker.println("Student ID: " + getId());
		fileMaker.println("School Name: " + getSchoolName());
		fileMaker.println(this.getPrintableErrorList());
		
		fileMaker.close();

		 
	}
}
