package Lec21;

import java.util.Stack;

public class Add_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Add(st, -7);
		System.out.println(st);
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






