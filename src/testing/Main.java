package testing;

public class Main {

	public static void main(String[] args) {
		B obj=new B();
		obj.show();
		obj.showA2();
		obj.showB2();
		
		A obj1=new B();
		obj1.show();
		obj1.showA2();
		//obj1.showB2();// not possible
		
		//B obj2=new A(); // Not possible
		

	}

}
