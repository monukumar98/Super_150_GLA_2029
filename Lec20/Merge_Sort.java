package Lec20;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 3, 4, 2 };
		int [] a= Sort(arr, 0, arr.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a [i]+" ");
		}

	}

	public static int[] Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}

		int mid = (si + ei) / 2;
		int[] f = Sort(arr, si, mid);
		int[] s = Sort(arr, mid + 1, ei);
		return Merge(f, s);

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
