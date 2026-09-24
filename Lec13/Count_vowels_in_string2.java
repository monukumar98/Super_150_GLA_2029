package Lec13;

public class Count_vowels_in_string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		System.out.println(Count_vowels(s, 0));

	}

	public static int Count_vowels(String s, int c) {
		if (s.length() == 0) {
			return c;
		}

		char ch = s.charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			c = c + 1;
		}
		return Count_vowels(s.substring(1), c);

	}

}
