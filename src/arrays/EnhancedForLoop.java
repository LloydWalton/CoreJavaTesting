package arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int id[]= {5,6,7,8,9};
		
		
		for (int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		
		System.out.println("*********************");
		
		for (int n:id) //return 1 value in id array
		{
			System.out.println(n);
		}
	}

}
