package constructor;

public class B extends A {
	
	public B()
	{
		System.out.println("In B constructor");
	}
	
	public B(int a)
	{
		this();
		//super(a);
		System.out.println("In B int constructor");
		//super(); // Super should be the first line of constructor it will be there by default
	//"this() is used to call another constructor in the same class, while super() is used to call the constructor of the parent class."
	}

}
