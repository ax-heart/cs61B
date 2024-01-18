public class ex2 {
	/** Returns the maximum value from m. */
	public static int max(int[] m) {
		int i = m.length - 1;
		int max = 0;
		while (i >= 0) {
			if (max < m[i]) {
				max = m[i];
			}

			i = i - 1;
		}

		return max;
	}

	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
	}
}
