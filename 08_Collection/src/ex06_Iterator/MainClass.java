package ex06_Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void ex01() {
		
		List<String> list = new ArrayList<>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String food = itr.next();
			System.out.println(food);
		}
		
	}
	
	public static void ex02() {
		Set<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(7);
		set.add(99);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			Integer number = itr.next();
			System.out.println(number);
		}
		
	}
	
	public static void ex03() {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("name", "소민");
		map.put("age", 24);
		map.put("isAlive", true);
		
		Set<String> keySet = map.keySet();
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			Object value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println(map.get("name"));
		
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
