package functionalInterface;

public class Main implements A {
	
	
	public void show() {
		System.out.println("Inside A Show");
		
	}

	public static void main(String[] args) {
		Main obj=new Main();
		obj.show();
	
				
		A obj2=new A()
				{
			public void show() {
				System.out.println("Inside B Show");
				
			}
				};
		obj2.show();
	}

	

}
