package Lec22;

import java.util.Stack;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = { { '1', '0', '1', '0', '0' }, 
				            { '1', '0', '1', '1', '1' }, 
				            { '1', '1', '1', '1', '1' },
				            { '1', '0', '0', '1', '0' } };
		
		int [] arr= new int [matrix[0].length];
		int area=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]=='1') {
					arr[j]++;
				}
				else {
					arr[j]=0;
				}
			}
			area=Math.max(Histogram(arr), area);
		}
		System.out.println(area);
	}
	public static int Histogram(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					area = Math.max(area, h * r);
				} else {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				}

			}
			st.push(i);

		}
		int r=arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				area = Math.max(area, h * r);
			} else {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			}

		}
		return area;
		

	}
	

}
