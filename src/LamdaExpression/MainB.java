package LamdaExpression;

public class MainB implements B{

	public static void main(String[] args) {
		
		B obj=new B()
				{
			public void show(int x) // type 1
			{
				System.out.println("Inside B"+x);
			}
				};
				obj.show(20);
				
				B obj2=(int x) -> // type 2
					{
						System.out.println("Inside B"+x);
					};
						
						obj2.show(30);
						
						B obj3=(v) -> // type 3
						{
							System.out.println("Inside B"+v);
						};
							
							obj2.show(501);

	}

	

	

}
