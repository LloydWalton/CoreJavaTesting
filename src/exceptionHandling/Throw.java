package exceptionHandling;

public class Throw {

	public static void main(String[] args) {
		int i=5;
		try
		{
			int y=15;
			int result=y/i;
			if(i==5)
			{
				throw new ArithmeticException("Throw exception message");
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Outside try catch");

	}

}
