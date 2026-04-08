package methodOverridding;

public class Main {

	public static void main(String[] args) {
		A obj1=new A();
		obj1.show();
		obj1.showA();
		//obj1.showB(); Not accessible
		
		
		
		B obj2=new B();
		obj2.show();
		obj2.showB();
		obj2.showA();
		
		
		
		
		A obj3=new B(); //Because B is extending A, Only common method on both A and B and A methods can be called
		
		obj3.show();
		//obj3.showB();
		obj3.showA();
		
		
		//B obj4=new A(); // not possible
		
	
		
		
		

	}

}
