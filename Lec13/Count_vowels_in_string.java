package Lec13;

public class Count_vowels_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		System.out.println(Count_vowels(s, 0));

	}

	public static int Count_vowels1(String s, int i, int c) {
		if (i == s.length()) {
			return c;
		}
		char ch = s.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			c = c + 1;
		}

		return Count_vowels1(s, i + 1, c);

	}

	public static int Count_vowels(String s, int i) {
		if (i == s.length()) {
			return 0;
		}
		char ch = s.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return 1 + Count_vowels(s, i + 1);
		} else {
			return Count_vowels(s, i + 1);
		}

	}

}
