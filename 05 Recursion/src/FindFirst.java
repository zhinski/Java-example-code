
public class FindFirst {

	public static void main(String[] args) {
		int[] a = {10, -5, 17, 6, 17};
		System.out.println(find(a, 17));
		System.out.println(find(a, 1));
	}
	
//	public static int find(int[] a, int e) {
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] == e) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	public static int find(int[] a, int e) {
		return find(a, e, 0);
	}
	
	private static int find(int[] a, int e, int i) {
		// if i is off the end of the array, no match was found
		if(i >= a.length) {
			return -1;
		}
		
		// if the element at index i is the element we are looking for (e)
		// "i" is the matching index
		if(a[i] == e) {
			return i;
		}
		
		return find(a, e, i + 1);
	}

}
