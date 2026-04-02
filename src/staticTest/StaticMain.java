package staticTest;

public class StaticMain {

	public static void main(String[] args) {
		StaticChild obj1=new StaticChild();
		StaticChild obj2=new StaticChild();
		obj1.brand="iphone";
		obj1.amount=12;
		//StaticChild.name="Smart";
		
		obj1.print();
		
		obj2.brand="iphone1";
		obj2.amount=121;
		//StaticChild.name="Smart1";
		obj2.print();
		
		
		StaticChild.test(obj1);

	}

}
