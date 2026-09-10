package Lec8;

import java.util.HashMap;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 3, 2, 5 };
	}

	public static int[] single_Number(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		int [] ar = new int [2];
		int j=0;
		for(int key:map.keySet()) {
			if(map.get(key)==1) {
				ar[j++]=key;
			}
		}
		return ar;

	}
}






