package Lec5;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6, 3, 4, 7, 6, 5, 3, 2, 1 };
		Permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Permutation(int[] arr) {

		// p index
		int p = -1;
		int n = arr.length;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			Reverse(arr, 0, n - 1);
			return;
		}
		// q index
		int q = 0;
		for (int i = n - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		// swaping p & q
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		// reverse p+1 to n-1
		Reverse(arr, p + 1, n - 1);
	}

	public static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
