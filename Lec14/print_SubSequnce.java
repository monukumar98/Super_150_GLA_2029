package Lec14;

public class print_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("abc","");

	}

	public static void print(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		print(ques.substring(1), ans);
		print(ques.substring(1), ans+ch);
		
	}

}


