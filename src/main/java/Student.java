import java.util.ArrayList;

public class Student 
{
	
	private String userName, iD, name, dob;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private int age;
	
	public Student (String Name, String ID, String DOB, int Age)
	{
		this.name = Name;
		this.iD = ID;
		this.dob = DOB;
		this.age = Age;
	}

	public String getName()
	{		
		return this.name;
	}
	
	public String getUsername()
	{		
		return this.name + Integer.toString(this.age);
	}
	
	public void addModule(Module a)
	{
		this.modules.add(a);
	}
	
}
