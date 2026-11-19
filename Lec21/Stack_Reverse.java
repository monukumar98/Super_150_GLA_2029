package Lec21;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int x=st.pop();
		Reverse(st);
		Add(st, x);//O(N)
		
	}
	public static void Add(Stack<Integer> st, int x) {
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		int t=st.pop();
		Add(st, x);
		st.push(t);

	}

}

