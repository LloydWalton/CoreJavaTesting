package anonymousInnerclass;

public class Test {
	
	

	
	
	public static void main(String[] args) {
		A obj=new A()
				{
			public void test()
			{
				System.out.println("Inside inner class");
			}
			
			
			
				};
		obj.test();
		
		

	}

}
