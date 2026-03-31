package arrays;

public class JaggedArray {

	public static void main(String[] args) {

		int age[][]= {{10,20},{30,40,50},{60}}; //jagged array in Java is a multidimensional array where each row can have a different number of columns.
		

	for (int i=0;i<age.length;i++)
	{
		for (int j=0;j<age[i].length;j++)
		{
			System.out.println(age[i][j]);
		}
	}
	
	
	int age2[][]= new int[3][]; //jagged array
	
	age2[0]=new int[2];
	age2[1]=new int[1];
	age2[2]=new int[2];
	
	age2[0][0]= 10;
	age2[0][1]= 20;
	
	age2[1][0]= 10;
	
	age2[2][0]= 10;
	age2[2][1]= 20;
	
	
	

	for (int i=0;i<age2.length;i++)
	{
		for (int j=0;j<age2[i].length;j++)
		{
			System.out.print(age2[i][j]+ " ");
		}
		System.out.println(" ");
	}
	}
}

