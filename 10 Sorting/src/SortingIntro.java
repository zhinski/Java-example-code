
public class SortingIntro {
	public static void sort(int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			int smallest = a[i];
			int index = i; // the index of the smallest value we saw
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < smallest) {
					smallest = a[j];
					index = j;
				}
			}
			
			// index contains the index of the smallest thing we saw
			// smallest contains the smallest value we saw
			a[index] = a[i];
			a[i] = smallest;
		}
	}
}
