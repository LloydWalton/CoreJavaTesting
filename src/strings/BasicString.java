package strings;

public class BasicString {
	
	//String is a class and String is immutable.

	public static void main(String[] args) {
		String text = "Welcome to india";
		String textsplit[] = text.split(" ");

		for (int i = textsplit.length - 1; i >= 0; i--) {
			System.out.print(textsplit[i] + " ");
		}

		System.out.println("**************");
		String name = "lloyd";
		String name1 = "lloyd";
		
		String name2=new String("test1");
		String name3=new String("test1");
		
		

		//System.out.println(name == test);
		System.out.println(name == name1);
		System.out.println(name2== name3); // same value but different memory/address
		
	}
	

}
