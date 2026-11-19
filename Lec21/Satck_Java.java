package Lec21;

import java.util.Stack;

public class Satck_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		// remove
		System.out.println(st.pop());
		System.out.println(st);
		// get
		System.out.println(st.peek());
		for (int x : st) {
			System.out.print(x+" ");
		}

	}

}







