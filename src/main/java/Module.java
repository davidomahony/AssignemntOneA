import java.util.ArrayList;

public class Module 
{

	private String name;
	private String id;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Module (String Name, String ID)
	{
		this.name = Name;
		this.id = ID;
	}
	
	public void addStudent(Student a)
	{
		this.students.add(a);
	}
	
	public String getModuleName()
	{
		return this.name;
	}
	
	public void ListStudents()
	{
		System.out.println("Module Name:" + this.name);
		System.out.println("Students");
		for(Student a : students)
		{
			System.out.println(a.getUsername());
		}
	}
	
}
