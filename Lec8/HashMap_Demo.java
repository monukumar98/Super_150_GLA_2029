package Lec8;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 78);
		map.put("Ankit", 58);
		map.put("Shiva", 77);
		map.put("Ankita", 32);
		map.put("Puneet", 98);
		// get
		System.out.println(map.get("Ravi"));
		System.out.println(map.get("Ankit"));
		// remove
		System.out.println(map.remove("Ravi"));
		System.out.println(map);
		System.out.println(map.remove("Ankit"));
		System.out.println(map);
		//System.out.println(map.keySet());
//		Set<String> set=map.keySet();
//		for(String key:set) {
//			System.out.println(key+" "+map.get(key));
//		}
		
		for(String key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}

	}

}









