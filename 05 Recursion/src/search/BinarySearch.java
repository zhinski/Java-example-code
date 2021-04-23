package search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 3, 4, 5, 6, 7};
		System.out.println(search(a, 6));
	}
	
	public static int search(int[] a, int x) {
		return search(a, x, 0, a.length - 1);
	}
	private static int search(int[] a, int x, int start, int end) {
		int mid = (start + end) / 2;
		int y = a[mid];
		
		if(start > end) {
			return -1;
		}
		else if(y == x) {
			return mid;
		}
		else if(x < y) {
			return search(a, x, start, mid - 1);
		}
		else {
			return search(a, x, mid + 1, end);
		}
	}
}
