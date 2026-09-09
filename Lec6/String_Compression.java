package Lec6;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababaabccaaassta";
		Compression(s);
	}

	public static void Compression(String s) {
		char prev = s.charAt(0);
		int c = 1;
		for (int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (prev == ch) {
				c++;
			} else {
				System.out.print(prev);
				System.out.print(c);
				prev = ch;
				c = 1;
			}
		}
		System.out.print(prev);
		System.out.print(c);
	}

}
