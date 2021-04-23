
public class StarString {
	public static void main(String[] args) {
		System.out.println(starString(12));
	}
	
	public static String starString(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		else if(n == 0) {
			return "*";
		}
		else {
			return starString((int) Math.pow(2, n), "*");
		}
	}
	// could use a StringBuilder to reduce copying
	private static String starString(int length, String result) {
		if(result.length() == length) {
			return result;
		}
		else {
			return starString(length, result + result);
		}
	}
}
