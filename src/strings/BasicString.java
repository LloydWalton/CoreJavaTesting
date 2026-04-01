package strings;

public class BasicString {

	public static void main(String[] args) {
		String text="Welcome to india";
		String textsplit[]=text.split(" ");

		
		for (int i=textsplit.length-1;i>=0;i--)
		{
			System.out.print(textsplit[i]+" ");
		}
	}

}
