package staticTest;

public class StaticChild {
	
	String brand;
	int amount;
	static String name="Smartphone";
	
	public void print()
	{
		System.out.println(brand+amount+name);
	}
	
	public static void test(StaticChild object)
	{
		System.out.println("Inside static method");
		System.out.println(object.brand+object.amount+name);
	}

}
