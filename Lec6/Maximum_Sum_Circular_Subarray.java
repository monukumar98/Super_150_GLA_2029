package Lec6;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrr = { 1, -2, 3, -2 };
	}

	public static int Circular_Subarray(int[] nums) {
		int linear_sum = Kadanes_Algorithm(nums);
		int total_sum = 0;
		for (int i = 0; i < nums.length; i++) {
			total_sum = total_sum + nums[i];
			nums[i] = nums[i] * -1;
		}
		int middle_sum = Kadanes_Algorithm(nums);
		int Circular_sum = total_sum + middle_sum;
		if(Circular_sum==0) {
			return linear_sum;
		}
		return Math.max(linear_sum, Circular_sum);

	}

	public static int Kadanes_Algorithm(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
