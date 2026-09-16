package Lec9;

public class Two_D_Array_Demo {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][2]);
		int[][] other = arr;
		int row=arr.length;
		int col=arr[0].length;
	}
}
