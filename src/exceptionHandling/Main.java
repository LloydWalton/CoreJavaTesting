package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		int i=0;
		int a[]= {1,2,3,4};
		String name=null;
		
		try
		{
		System.out.println(7/i);
		System.out.println(a[5]);
		System.out.println(name.length());
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException " +e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException " +e);
		}
		catch (NullPointerException e)
		{
			System.out.println("NullPointerException " +e);
		}
		catch (Exception e) // This should be added at the end
		{
			System.out.println("Exception " +e);
		}

		
		System.out.println("After try catch");
	}

}
