package Lec16;

public class Lexicographical_Numbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		for (int i = 1; i<=9; i++) {
			Lexicographical(n, i);
		}
		

	}
	public static void Lexicographical(int n, int curr) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		
		for (int i = 0; i <= 9; i++) {
			Lexicographical(n, curr * 10 + i);
		}

	}

}
