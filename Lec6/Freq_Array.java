package Lec6;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ttsxkhjasvnfggfsdxjsdwjgh";
		Maximum_Freq(s);
	}

	public static void Maximum_Freq(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freq[idx]++;// freq[idx]= freq[idx] +1;
		}
		int maxi = 0;
		for (int i = 1; i < freq.length; i++) {
			if (freq[i] > freq[maxi]) {
				maxi = i;
			}
		}
		System.out.println(freq[maxi]);
		System.out.println((char) ('a' + maxi));
	}
	public static void Maximum_Freq1(String s) {
		int[] freq = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch]++;// freq[idx]= freq[idx] +1;
		}
		int maxi = 0;
		for (int i = 1; i < freq.length; i++) {
			if (freq[i] > freq[maxi]) {
				maxi = i;
			}
		}
//		System.out.println(freq[maxi]);
//		System.out.println((char) (maxi));
	}

}
