//An abstract class is an incomplete class that acts as a base for other classes to extend and complete
package abstraction;

public class wangonR extends car {

	public static void main(String[] args) {
		
		wangonR obj=new wangonR();
		obj.drive();
		obj.music();
		obj.gear();
		obj.name="test11";
		System.out.println(obj.name);
		
		
	}

	@Override
	public void drive() {
		System.out.println("driving");
		
	}

	@Override
	public void gear() {
		System.out.println("Automatic gear");
		
	}

}
