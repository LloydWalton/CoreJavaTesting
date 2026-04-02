//Encapsulation = "Hide the data in one class and allow other classes to access it only through safe methods."
//Hide variables using private
//Access them using methods (get and set)
package encapsulation;

public class encap_Parent {

	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
		
	}
	
}
