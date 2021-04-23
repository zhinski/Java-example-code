public class Quicksort {
	public static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}
    public static void sort(int[] a, int start, int end) {
        if (start >= end) return; // array of length 1 is already sorted
        int pivot = a[start + (end - start) / 2];
        int L = start, R = end; // i < L means a[i] < pivot, i > R means a[i] > pivot
        int lpivot = -1; // Index of rightmost element on left side known to be pivot
        while (L < R) {
            if (a[L] < pivot) L++; // a[L] is on the correct side
            else if (a[R] > pivot) R--; // a[R] is on the correct side
            else if (a[L] != pivot || a[R] != pivot) { // a[L] and a[R] are on the wrong sides, swap them!
                int swap = a[L];
                a[L] = a[R];
                a[R] = swap;
            } else { // both a[L] and a[R] == pivot
                if (lpivot < L) lpivot = L; // lpivot should be at least L
                for (lpivot++; lpivot < R; lpivot++) { // find element != pivot
                    if (a[lpivot] != pivot) { // swap the two elements
                        a[L] = a[lpivot];
                        a[lpivot] = pivot; // a[lpivot] once again == pivot
                        break;
                    }
                }
                if (lpivot >= R) break; // everything between L and R is a pivot
            }
        }
        sort(a, start, L - 1); // Recurse on left half
        sort(a, R + 1, end); // Recurse on right half
    }

}
