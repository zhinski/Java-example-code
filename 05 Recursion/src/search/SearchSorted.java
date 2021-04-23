package search;

public class SearchSorted {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 3, 4, 5, 6, 7};
		System.out.println(search(a, -5));
	}
	
	public static int search(int[] a, int x) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				return i;
			}
			else if(a[i] > x) {
				return -1;
			}
		}
		return -1;
	}
}
