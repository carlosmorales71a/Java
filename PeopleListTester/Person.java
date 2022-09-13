
public class Person {
		// declare instance fields to
		// be used in program
	private String name;
	private int age;
	
	public Person(String newName, int newAge)
	{
		name = newName;
		age =  newAge;
	}	// end constructor Person
	
	public String toString()
	{
		return "Name: " + name + ", Age: " + age;
	}	// end method toString
	
}	//end class Person
