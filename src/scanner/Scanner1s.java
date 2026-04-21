package scanner;

import java.util.Scanner;

public class Scanner1s {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println(sc1.nextInt()); // prints only number
		System.out.println(sc1.next()); // prints alls
		

	}

}
