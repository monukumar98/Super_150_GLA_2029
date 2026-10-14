package Lec15;

public class Count_Seqeunnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		Count(ques, "");
//		System.out.println("\n" + c);
		System.out.println("\n"+Count(ques, ""));
	}

	public static int Count(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x = Count(ques.substring(1), ans);
		int y = Count(ques.substring(1), ans + ch);
		return x + y;

	}

//	static int c = 0;
//
//	public static void Count(String ques, String ans) {
//		// TODO Auto-generated method stub
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			c++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		Count(ques.substring(1), ans);
//		Count(ques.substring(1), ans + ch);
//
//	}

}
