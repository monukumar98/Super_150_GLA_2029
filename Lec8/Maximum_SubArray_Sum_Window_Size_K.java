package Lec8;

public class Maximum_SubArray_Sum_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4, 5, 7, 9, 2, 1, 4 };
		int k=3;

	}
	public static int Maximum_SubArray_Sum(int [] arr,int k) {
		// 1st window
		int ans=0,sum=0;
		for (int i = 0; i <k; i++) {
			sum+=arr[i];
		}
		ans=sum;
		for (int i = k; i < arr.length; i++) {
			sum+=arr[i];// window grow
			sum-=arr[i-k];//window shrink
			ans=Math.max(ans, sum);// ans calculate
		}
		return ans;
	}

}
