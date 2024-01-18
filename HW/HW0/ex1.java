public class ex1 {
	public static void main(String[] args) {
		int i = 1;
		int k;
		while (i <= 5) {
			k = i;
			while (k > 0) {
				System.out.print("*");
				k = k - 1;
			}
			System.out.print("\n");
			i = i + 1;
		}
	}
}

