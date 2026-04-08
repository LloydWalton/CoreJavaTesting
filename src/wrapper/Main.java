package wrapper;

public class Main {

	public static void main(String[] args) {
		String age="36";
		
		//int y=(int) age; // Not allowed
		
		
		
		int n= Integer.parseInt(age); // wrapper class - > Converting String to int
		System.out.println(n*20);

	}

}
