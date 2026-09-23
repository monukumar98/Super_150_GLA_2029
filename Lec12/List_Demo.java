package Lec12;

import java.util.*;

public class List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(2, -9);
		// get
		System.out.println(ll.get(1));
		System.out.println(ll);
		for (int x : ll) {
			System.out.print(x + " ");
		}
		System.out.println();
		ll.set(1, 2);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
			
		}
		System.out.println();
		Collections.sort(ll);
		System.out.println(ll);
	}

}







