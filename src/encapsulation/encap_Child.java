//Encapsulation = "Hide the data in one class and allow other classes to access it only through safe methods."

package encapsulation;

public class encap_Child {
	
	public static void main(String[] args) {
		encap_Parent obj = new encap_Parent();
		
		obj.setName("Lloyd Walton");
		obj.setAge(36);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

		
		
		
	}
}
