//Interface = a list of rules that any class must follow
package interfaceTest;

public class interfaceChild implements InterfaceParent {

	public static void main(String[] args) {
		
		interfaceChild obj=new interfaceChild();
		obj.sound();
		//obj.name="afsdf"; // not possible
		System.out.println(obj.name);
		System.out.println(InterfaceParent.name);
	}

	@Override
	public void sound() {
		System.out.println("Human voice");
	
	
	}

}
