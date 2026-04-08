package innerClass;

public class MainClass {

	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.sub();
		
		SubClass.Test obj2=obj.new Test(); // To access subclass
		obj2.subTest();

	}

}
