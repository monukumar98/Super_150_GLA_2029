package Lec6;

public class SubString_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		Print(s);

	}

	public static void Print(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrome(s1)) {
					System.out.println(s1);
				}
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
