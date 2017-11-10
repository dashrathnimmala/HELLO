public class RoundSum01 {
	public static void main(String[] args) {
		int a = 65, b = 84, c = 0;
		System.out.println(sumOfMultiples(a, b, c));
	}

	public static int sumOfMultiples(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0)
			return -1;

		if (a % 10 != 0)
			a = ((a / 10 + 1) * 10);

		if (b % 10 != 0)
			b = ((b / 10 + 1) * 10);

		if (c % 10 != 0)
			c = ((c / 10 + 1) * 10);

		return (a + b + c);
	}
}
