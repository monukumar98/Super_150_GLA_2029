package Lec11;

public class String_vs_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringTC();
		// StringBuilderTC();

	}

	public static void StringTC() {
		String s = "";
		for (int i = 0; i < 1000_000; i++) {
			s = s + i;
		}
	}

	public static void StringBuilderTC() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000_000; i++) {
			sb.append(i);
		}
	}

}
