package arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int record[][]= new int [3][2];
		
		record [0][0]=10;
		record [0][1]=20;
		
		record [1][0]=30;
		record [1][1]=40;
		
		record [2][0]=50;
		record [2][1]=60;
		
		
		for (int i=0;i<record.length;i++)
		{
			for (int j=0;j<record[i].length;j++)
			{
				System.out.println(record[i][j]);
			}
		}
		
		System.out.println("***************");
		int record2[][]= {{70,80},{90,100},{110,120}};
		for (int i=0;i<record2.length;i++)
		{
			for (int j=0;j<record2[i].length;j++)
			{
				System.out.print(record2[i][j] +" ");
				
			}
			 System.out.println(" ");
		}
		
		System.out.println("**************");
		int record3[][][] = {
			    {
			        {70, 80,90},
			        {90, 100,110},
			        {110, 120,130}
			    }
			};
		for (int i=0;i<record3.length;i++)
		{
			for (int j=0;j<record3[i].length;j++)
			{
				for (int k=0;k<record3[i][j].length;k++)
				{
				System.out.print(record3[i][j][k] +" ");
				
			}
			 System.out.println(" ");
		}
		
		
		}
	}

}
