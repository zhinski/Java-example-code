
public class Throwable {

	public static void main(String[] args) {
		int[] a = {};
		// System.out.println(a[100]); ArrayIndexOutOfBoundsException
		
		String b = null;
		// System.out.println(b.length()); NullPointerException
		
		// main(args); StackOverflowError
		
		method1();
		method3();
	}
	
	public static void method1() {
		System.out.println("I am method 1");
		method2();
		System.out.println("Goodbye!");
	}
	
	public static void method2() {
		String b = null;
		System.out.println(b.length());
	}
	
	public static void method3() {
		System.out.println("Hi");
	}
}
