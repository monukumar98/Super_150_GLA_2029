package Lec6;

import java.util.Arrays;

public class Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram", t = "nagaram";
	}
	public static boolean Anagram2(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int[] a = new int[26];
		int[] b = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx=s.charAt(i)-'a';
			a[idx]++;
		}
		for (int i = 0; i < t.length(); i++) {
			int idx=t.charAt(i)-'a';
			b[idx]++;
		}
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean Anagram1(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char [] a=s.toCharArray();//['a','n','a','g','r','m']
		char [] b=t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

}
