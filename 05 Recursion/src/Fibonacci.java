
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(100000));
	}
	
//	public static long fib(int n) {
//		if(n == 0 || n == 1) {
//			return 1;
//		}
//		System.out.println(n);
//		return fib(n - 1) + fib(n - 2);
//	}
	
	private static long[] fibA = new long[1000000];
	
	public static long fib(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		// have we already calculated the fibonacci number for this n value
		if(fibA[n] > 0) {
			return fibA[n];
		}
		
		// we have not yet computed this value, recursively compute it
		fibA[n] = fib(n - 1) + fib(n - 2);
		return fibA[n];
	}

}
