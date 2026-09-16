package Lec9;
public class Transpose_Matrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, 
				        { 5, 6, 7, 8 }, 
				        { 10, 11, 12, 13 }, 
				        { 12, 13, 14, 15 } };
		Transpose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void Transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
	}

}

