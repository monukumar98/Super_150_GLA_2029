package Lec8;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abababbababbabbabaa";
		int k = 2;
		int flip_a = max_len(s, k, 'a');
		int flip_b = max_len(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int max_len(String s, int k, char c) {
		// TODO Auto-generated method stub
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// window grow
			if(s.charAt(ei)==c) {
				flip++;
			}
			// window shrink
			while(flip>k && si<=ei) {
				if(s.charAt(si)==c) {
					flip--;
				}
				si++;
			}
			// answer update
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}








