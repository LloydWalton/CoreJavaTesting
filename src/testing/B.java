package testing;

public class B extends A {

	@Override // This will be helpful to identify id override method has the same name
	public void show()
	{
		System.out.println("In B show");
	}
	public void showB2()
	{
		System.out.println("In B show2");
	}
}
