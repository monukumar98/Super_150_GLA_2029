package Lec20;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = { 2, 3, 5, 7 };
		int[] ar2 = { 1, 3, 5, 8, 9, 11 };
		int[] a = Merge(ar1, ar2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static int[] Merge(int[] ar1, int[] ar2) {
		int n = ar1.length;
		int m = ar2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (ar1[i] < ar2[j]) {
				ans[k++] = ar1[i++];
			} else {
				ans[k++] = ar2[j++];
			}
		}
		while (i < n) {
			ans[k++] = ar1[i++];
		}
		while (j < m) {
			ans[k++] = ar2[j++];
		}
		return ans;

	}

}
