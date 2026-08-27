package Lec5;

import java.util.Scanner;

public class Day_at_the_Beach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static int maximum_partitionin(int[] arr) {
		int n = arr.length;
		// prefix max
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		// sufix min
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.min(right[i + 1], arr[i]);
		}
		int c = 0;
		for (int i = 0; i < n - 1; i++) {
			if (left[i] <= right[i + 1]) {
				c++;
			}
		}
		return c + 1;
	}

}
