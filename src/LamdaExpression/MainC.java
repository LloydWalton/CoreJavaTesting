package LamdaExpression;

public class MainC implements CWithoutReturn{

	public static void main(String[] args) {
		CWithoutReturn obj=(int i,int y)->
			{
				System.out.println("test "+ i+ " "+y);
			};
				
				obj.test(5,2);

	}

}
