
public class Exponent {

	public static void main(String[] args) {
		System.out.println(pow(5, 5));
	}
	
	public static int pow(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		return base * pow(base, exponent - 1);
	}

}
