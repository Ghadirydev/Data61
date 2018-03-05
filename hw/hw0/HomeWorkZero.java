public class HomeWorkZero  {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println("This is a test");
		first();
		printStars();
		System.out.println(max(numbers));
	}

	public static void first() {
		int x = 5;

		if (x < 10) {
			x = x + 10;
		}

		if (x < 10) {
			x = x + 10;
		}

		System.out.println(x);
	}

	public static void printStars() {

		//print the row
		for(int i = 1; i <= 5; i++) {
			//print column

			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static int max(int[] m) {
		int max = m[0];

		for(int i = 1; i < m.length; i++) {
			if(max < m[i]) {
				max = m[i];
			}
		}
		return max;
	}
}