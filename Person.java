/**
* You can create a person and change his age.
*/
public class Person
{
    private int age;
	
    /**
	* Create a person and set his age. The age by default is set to 0.
	*/
	public Person(int ageOfPerson)
	{
		age = ageOfPerson;
	}
	
	/**
	* Shows the person's age.
	*/
	public int getAge()
	{
		return age;
	}
}
