import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgramme 
{
	
	private String name;

	private DateTime startDate;
	private DateTime endDate;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public CourseProgramme (String Name,
			DateTime StartDate, DateTime EndDate)
	{
		this.name = Name;
		this.startDate = StartDate;
		this.endDate = EndDate;
	}
	
	public void addModule(Module a)
	{
		this.modules.add(a);
	}
	
	public void addStudent(Student a)
	{
		this.students.add(a);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	
	public ArrayList<Module> getModules()
	{
		return modules;
	}
			
}
