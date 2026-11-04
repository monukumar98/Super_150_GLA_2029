package Lec20;

public class Partition_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		System.out.println(Partition(arr, 0, arr.length - 1));
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
