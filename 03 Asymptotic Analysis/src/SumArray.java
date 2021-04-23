
public class SumArray {
	
	public static int firstAndLast(int[] a) {
		if(a.length == 0) return 0;
		return a[0] + a[a.length - 1];
	}
	
	public static int sum(int[] a) {
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	public static void time(int[] a) {
		long start = System.currentTimeMillis();
		System.out.println("The sum of the array is " + sum(a));
		long end = System.currentTimeMillis();
		System.out.println("The sum method took " + (end - start) + " milliseconds");
		
		start = System.currentTimeMillis();
		System.out.println("The sum of the first and last element in th array is " 
				+ firstAndLast(a));
		end = System.currentTimeMillis();
		System.out.println("The firstAndLast method took " + (end - start) + " milliseconds");
	}

	public static void main(String[] args) {
//		int[] a = new int[100];
//		int[] b = new int[10000];
//		int[] c = new int[1000000];
//		int[] d = new int[100000000];
//		
//		time(a);
//		time(b);
//		time(c);
//		time(d);
		
		// less accurate, because of "turbulence": random factors could affect performance
//		for (int i = 1000000; i < 10000000; i *= 2) {
//		    int[] a = new int[i];
//		    long start = System.currentTimeMillis();
//		    sum(a);
//		    long finish = System.currentTimeMillis();
//		    System.out.println(i+": "+(finish - start));
//		}

		for (int i = 1000000; i < 10000000; i *= 2) {
		    long totalTime = 0;
		    int trials = 100;
		    for (int j = 0; j < trials; j++) {
		        int[] a = new int[i];
		        long start = System.currentTimeMillis();
		        sum(a);
		        long finish = System.currentTimeMillis();
		        totalTime = totalTime + finish-start;
		    }
		    System.out.println(i+": "+(double)totalTime/trials);
		}

	}

}
