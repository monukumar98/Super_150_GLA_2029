package Lec11;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();// 16
		System.out.println(sb.capacity());
		sb.append("hey");
		sb.append(10);
		sb.append(6);
		sb.append(true);
		sb.append('a');
		sb.append("Hello");
		System.out.println(sb);
		sb.append('o');
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.substring(1,3));
		System.out.println(sb.substring(1));
		sb.reverse();
		System.out.println(sb);
		String s=sb.toString();
		System.out.println(sb.charAt(2));

	}

}
