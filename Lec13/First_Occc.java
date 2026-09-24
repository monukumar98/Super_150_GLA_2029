package Lec13;

public class First_Occc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 4, 6, 4 };
		int item = 4;
		System.out.println(Index(arr, item, 0));

	}

	public static int Index(int[] arr, int item,int i) {
		
		if(arr[i]==item) {
			return i;
		}

		return Index(arr, item, i+1);
	}

}
