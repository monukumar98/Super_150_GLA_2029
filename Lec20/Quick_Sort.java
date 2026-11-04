package Lec20;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		Sort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void Sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);
	}

	public static int Partition(int[] arr, int si, int ei) {
		int idx = si;
		int item = arr[ei];
		for (int i = si; i < ei; i++) {
			if (arr[i] < item) {
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				idx++;
			}

		}
		int t = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = t;
		return idx;

	}

}
