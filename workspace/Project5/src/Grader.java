//Name: Daniela Travieso
//Class: COP3502
//Project 5

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader 
{

	private boolean available = true;
	private Student student = null;
	private Dictionary dict;
	
	public Grader(Dictionary dict)
	{
		//initialize local dictionary field with dict being passed in
		this.dict = dict;
	}
	
	public boolean gradeStudent(String id)
	{
		available = false;
		boolean graded = false;
		Scanner scan = null;
		File file = null;
		try {
			file = new File(id.toString() + ".txt");
			scan = new Scanner(file);
			
		} catch (Exception e) {
			//if there is an exception return false
			return graded;
		}

		//Line 1: high school, undergrad, or grad
		String studentType = scan.nextLine();
		
		//if it's a high school student
		if(studentType.equalsIgnoreCase("highschool student"))
		{
			//scan for name
			String name = scan.nextLine();
			//scan for id
			String studentId = scan.nextLine();
			//scan for school
			String nameOfSchool = scan.nextLine();
			//array list for errors
			ArrayList<String> errList = new ArrayList<String>();
			//string for essay
			String essay = null;
			
			while(scan.hasNext())
			{
				//get the word
				String word = scan.next();
				//add the word to the essay
				essay += word;
				//remove punctuation and make lowercase
				word = word.replace("!","");
				word = word.replace(".", "");
				word = word.replace(")", "");
				word = word.replace("(", "");
				word = word.replace(",", "");
				word = word.replace("?", "");
				word = word.toLowerCase();
				//determine if the word exists
				boolean isWord = dict.isWord(word);
				//add the word to the errList if it doesn't exist
				if(!isWord){
					errList.add(word);
				}
				
			}
			//create high school student based on the information from the file
			student = new HighSchoolStudent(name, studentId, essay , errList, nameOfSchool);
			graded = true;
		}
		
		//if it's an undergraduate student
		else if(studentType.equalsIgnoreCase("undergraduate student"))
		{
			String name = scan.nextLine();
			String studentId = scan.nextLine();
			String major = scan.nextLine();
			//array list for errors
			ArrayList<String> errList = new ArrayList<String>();
			//string for essay
			String essay = null;
			
			while(scan.hasNext())
			{
				//get the word
				String word = scan.next();
				//add the word to the essay
				essay += word;
				//remove punctuation and make lowercase
				word = word.replace("!","");
				word = word.replace(".", "");
				word = word.replace(")", "");
				word = word.replace("(", "");
				word = word.replace(",", "");
				word = word.replace("?", "");
				word = word.toLowerCase();
				//determine if the word exists
				boolean isWord = dict.isWord(word);
				//add the word to the errList if it doesn't exist
				if(!isWord){
					errList.add(word);
				}
				
			}

			student = new UndergraduateStudent(name, studentId, essay, errList, major);
			graded = true;
		}
		
		//if it's a graduate student
		else if (studentType.equalsIgnoreCase("graduate student"))
		{
			
			String name = scan.nextLine();
			String studentId = scan.nextLine();
			String major = scan.nextLine();
			String advisor = scan.nextLine();
			//array list for errors
			ArrayList<String> errList = new ArrayList<String>();
			//string for essay
			String essay = null;
			
			while(scan.hasNext())
			{
				//get the word
				String word = scan.next();
				//add the word to the essay
				essay += word;
				//remove punctuation and make lowercase
				word = word.replace("!","");
				word = word.replace(".", "");
				word = word.replace(")", "");
				word = word.replace("(", "");
				word = word.replace(",", "");
				word = word.replace("?", "");
				word = word.toLowerCase();
				//determine if the word exists
				boolean isWord = dict.isWord(word);
				//add the word to the errList if it doesn't exist
				if(!isWord){
					errList.add(word);
				}
				
			}

			student = new GraduateStudent(name, studentId, essay, errList, major, advisor);
			graded = true;

		}
		
		else
		{
			System.out.print("help");
		}
		
		return graded;
	
	}
	
	public boolean isAvailable()
	{
		//check whether grader is available to grade next student
		//available means that the student field has been set to null and "available" is true
		
		return (student == null && available == true);
	}
	
	public Student getStudent()
	{
		return student;
	}
	
	public void reset()
	{
		//reset local variables, excluding dict
		student = null;
		available = true;
		
	}

}
