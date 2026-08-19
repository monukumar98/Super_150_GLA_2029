package Lec1;

public class Array_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 4, 6, -9 };
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
