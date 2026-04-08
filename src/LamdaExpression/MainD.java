package LamdaExpression;

public class MainD implements DWithReturn {

	public static void main(String[] args) {

		DWithReturn obj = new DWithReturn() {

			public int test(int i, int j) {
				return i + j;

			}
		};
		int result = obj.test(5, 5);
		System.out.println(result);

		// type2
		DWithReturn obj2 = (int i, int j) -> {
			return i + j;

		};
		int result2 = obj2.test(5, 5);
		System.out.println(result2);

		// type3
		DWithReturn obj3 = (i, j) -> i + j;

		int result3 = obj3.test(5, 6);
		System.out.println(result3);
	}

}
