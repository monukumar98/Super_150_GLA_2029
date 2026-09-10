package Lec8;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;

	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int si = 0, ei = 0, p = 1, ans = 0;
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];
			// window Shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}
			// ans calculate
			ans = ans + (ei - si + 1);
			ei++;

		}
		return ans;
	}

}
