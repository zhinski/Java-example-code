
public class Square {
	public static void main(String[] args) {
		System.out.println(square(8));
	}
	
	public static int square(int n) {
		if(n == 1) {
			return 1;
		}
		return square(n - 1) + 2 * n - 1;
	}
}
