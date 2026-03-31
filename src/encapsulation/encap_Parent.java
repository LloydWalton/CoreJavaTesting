//Encapsulation = "Hide the data in one class and allow other classes to access it only through safe methods."

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
