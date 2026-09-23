package Lec11;

import java.util.Vector;

public class StringBuffer_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
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
		Vector<Integer> v = new Vector<>();
		System.out.println(v.capacity());
	}

}
