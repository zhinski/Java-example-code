package search;

public class SearchBenchmark {

	public static void main(String[] args) {
		
		// making a large sorted array
		int[] a = new int[1_000_000];
		for(int i = 1; i < 1_000_000; i++) {
			a[i] = a[i - 1] + (int)(Math.random() * 3);
		}
		
		int maxSearch = 100_000;
		
		// searching for the values between [0, 10,000) in a
		// iterative search algorithm
		int indexSum = 0;
		long start = System.currentTimeMillis();
		for (int x = 0; x < maxSearch; x++) {
			// test iterative search
			indexSum += SearchSorted.search(a, x);
		}
		long end = System.currentTimeMillis();
		System.out.println("iterative: " + (end - start));
		
		// searching for the values between [0, 10,000) in a
		// recursive search algorithm
		int indexSum2 = 0;
		start = System.currentTimeMillis();
		for (int x = 0; x < maxSearch; x++) {
			// test recursive search
			indexSum2 += BinarySearch.search(a, x);
		}
		end = System.currentTimeMillis();
		System.out.println("recursive: " + (end - start));
		
		System.out.println(indexSum + " " + indexSum2);
	}

}
