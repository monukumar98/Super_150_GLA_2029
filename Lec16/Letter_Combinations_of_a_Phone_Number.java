package Lec16;

public class Letter_Combinations_of_a_Phone_Number {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="23";
		Key_Piad(ques,"");

	}

	public static void Key_Piad(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return ;
		}
		char ch=ques.charAt(0);// '2'
		String s=key[ch-'0'];
		for (int i = 0; i < s.length(); i++) {
			Key_Piad(ques.substring(1), ans+s.charAt(i));
		}
		
		
	}

}

