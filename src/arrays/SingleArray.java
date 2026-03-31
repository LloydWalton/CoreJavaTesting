package arrays;

public class SingleArray {

	public static void main(String[] args) {
	int age[]= {10,20,30,40};
	
	for (int i=0;i<4;i++)
	{
		System.out.println(age[i]);
	}
	
	System.out.println("******************");
	int age2[]= new int [4];

	age2[0]=11;
	age2[1]=12;
	age2[2]=13;
	age2[3]=14;
	//age2[4]=15; //ArrayIndexOutOfBoundsException
	
	for (int i=0;i<age2.length;i++)
	{
		System.out.println(age2[i]);
	}
	
	int age3[]= new int [5];
	System.out.println("!!!!!!!!!!!!!!!!!");
	for (int i=0;i<age3.length;i++)
	{
		age3[i]= (int)(Math.random()*10);
		System.out.println(age3[i]);
	}

	}

}
