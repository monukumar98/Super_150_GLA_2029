package Lec2;

public class Perfix_Suffix_Incliding_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 4, 6, 7 };

	}

	public static void Perfix_Suffix(int[] arr) {
		int n = arr.length;
		// prefix
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] + arr[i];
		}
		// Suffix
		int[] right = new int[n];
		right[n-1]=arr[n-1];
		for (int i = n-2; i>=0; i--) {
			right[i] = right[i + 1] + arr[i];
		}
	}

}
