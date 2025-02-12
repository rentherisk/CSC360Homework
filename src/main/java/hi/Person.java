package hi;

public class Person
{

	String firstName;
	String lastName;
	int age;
	/**
	 * @param firstName - first name
	 * @param lastName - last name
	 * @param age - age of person in years
	 */
	public Person(String firstName, String lastName, int age)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param fname the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * @param lname the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person: "+ firstName +" "+ lastName +", "+ age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if(age<18)
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName,that.lastName,0);
		return child;
	}
	
	public static void main(String[] args) 
	{
		Person r = new Person("Romeo","Mon",15);
		
		System.out.println("R "+r);
		
	}
	
}
