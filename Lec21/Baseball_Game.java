package Lec21;

import java.util.Stack;

public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
	}

	public static int Points(String[] operations) {
		Stack<Integer> st = new Stack<>();
		for (String x : operations) {
			if (x.equals("C")) {
				st.pop();
			} else if (x.equals("D")) {
				int p = st.peek();
				st.push(2 * p);
			} else if (x.equals("+")) {
				int a1 = st.pop();
				int a2 = st.peek();
				st.push(a1);
				st.push(a1 + a2);
			} else {
				st.push(Integer.parseInt(x));
			}
		}
		int sum=0;
		for(int x: st) {
			sum+=x;
		}
		return sum;

	}
}
