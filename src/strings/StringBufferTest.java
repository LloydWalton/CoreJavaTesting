package strings;

public class StringBufferTest {

	public static void main(String[] args) {
		
		
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
	

		System.out.println(sb==sb2);  
		System.out.println(sb.append(false).length());
		
		System.out.println("**************");
		String str = "Hello";
		StringBuffer sbtest = new StringBuffer("hello");

		sbtest.append(" World");
		str.concat("test");

		System.out.println(sbtest);   // Hello World
		System.out.println(str);  // Hello ❌ unchanged
		
	}

}
