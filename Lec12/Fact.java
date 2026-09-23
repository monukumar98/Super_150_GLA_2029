package Lec12;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fac(n));

	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
		int f = Fac(n - 1);// SP
		return f * n;// Self work
	}

}
