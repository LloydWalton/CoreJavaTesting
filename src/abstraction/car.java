//An abstract class is an incomplete class that acts as a base for other classes to extend and complete
package abstraction;

public abstract class car {
	
	public abstract void drive(); //Abstract method
	public abstract void gear();
	
	public void music() // Concrete method
	{
		System.out.println("Play music");
		
	}
}
