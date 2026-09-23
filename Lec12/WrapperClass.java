package Lec12;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		Integer a = 5;
		System.out.println(x);
		System.out.println(a);
		Long l = 5l;
		int y = a;// Un-Boxing
		a = x;// auto-Boxing
		Integer c1 = 10;
		Integer c2 = 10;
		Integer c3 = 190;
		Integer c4 = 190;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);

	}

}
