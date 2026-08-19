package Lec1;

public class Array_Swap2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 4, 6, -9 };
//		int[] arr = new int[] { 10, 20, 4, 6, -9 };
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
