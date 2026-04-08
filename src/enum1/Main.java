package enum1;

public class Main {

	public static void main(String[] args) {
		EnumTest days=EnumTest.Tuesday;
		switch (days)
		{
		case Monday:
			System.out.println("Monday");
			break;
		case Tuesday:
			System.out.println("Tuesday");
			break;
		case Wednesday:
			System.out.println("Wednesday");
			break;
		case Thursday:
			System.out.println("Thursday");
			break;
		case Friday:
			System.out.println("Friday");
			break;
		case Saturday:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			break;
		}
		
		System.out.println(days.name);
		
	
	}

}
