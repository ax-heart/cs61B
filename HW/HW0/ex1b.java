public class ex1b {

	public static void drawTriangle(int N) {
		int i = 1;
		int k;
		while (i < N) {
			k = i;
			while (k > 0) {
				System.out.print("*");
				k = k - 1;
			}
			System.out.print("\n");
			i = i + 1;
		}
	}

	public static void main(String[] args) {
		drawTriangle(10);
	}
}
