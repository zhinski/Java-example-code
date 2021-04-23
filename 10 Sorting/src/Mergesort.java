
public class Mergesort {
	public static void sort(int[] a) {

		// Base case: arrays of size 0 or 1 are sorted
		if(a.length <= 1) {
			return;
		}

		//===================== Sort left half ========================

		// Create left half
		int lsize = a.length / 2;
		int[] left = new int[lsize];

		// copying the left half of "a" into the new array (left)
		for(int i = 0; i < lsize; i++) {
			left[i] = a[i];
		}

		// recursively sort the left half
		sort(left);

		//===================== Sort right half =======================

		// Create right half
		int[] right = new int[a.length - lsize];

		// copying the right half of "a" into the the new array (right)
		for(int i = lsize; i < a.length; i++) {
			right[i - lsize] = a[i];
		}

		// recursively sort the left half
		sort(right);

		//===================== Merge left and right ==================

		// left is sorted, right is sorted, merge them!
		int l = 0, r = 0, i = 0; // l: index in left, r: index in right, i: index in a
		while(l < left.length && r < right.length) {
			if(left[l] <= right[r]) {
				a[i++] = left[l++];
			}
			else {
				a[i++] = right[r++];
			}
		}

		// "drain" left array
		while(l < left.length) {
			a[i++] = left[l++];
		}

		// "drain" right array
		while(r < right.length) {
			a[i++] = right[r++];
		}
	}
}
