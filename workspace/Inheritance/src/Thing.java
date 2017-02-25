
public class Thing
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Dani", 18);
		Student s1 = new Student("Dani", 18, 3.5, 9595);
		HighSchoolStudent h1 = new HighSchoolStudent("Dani", 18, 3.5, 9595, 12);
		CollegeStudent c1 = new CollegeStudent("Dani", 18, 3.5, 9595, "CpE");
		//Person > Student > {HS, CS};
	}
}