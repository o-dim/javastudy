package ex07_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void printList(List<Integer> list) {
		
		int i = 0;
		
		while(true) {
			System.out.print(list.get(i));
			i ++;
			if (i >= list.size()) {
				break;
			} else {
				System.out.print("->");
			}
		}
		
	}
	
	public static void printList2(List<Integer> list) {
		int lastIndex = list.size() - 1;
		for(int r = 0 ; r <lastIndex ; r++) {
			System.out.print(list.get(r) + "->");
		}
		System.out.print(list.get(lastIndex));
	}
		
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 2, 3, 9, 10);
		
		printList(list);
		printList2(list);
		
		Collections.sort(list); // 오름차순 정렬 
		System.out.println(list);
		
		int idx = Collections.binarySearch(list, 11);
		if (idx >= 0) {
			System.out.println("찾았다");
		} else {
			System.out.println("못 찾았다");
		}
		System.out.println(idx);
		
	}

}
