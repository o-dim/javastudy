package ex02_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	
	public static void ex01() {
		List<String> list = new ArrayList<String>();
		
		// 추가
		list.add("spring"); // 인덱스 지정이 없으면 항상 마지막에 추가됨
		list.add("summer");
		list.add("autumn");
		list.add("frog");
		list.add(0, "winter"); // 인덱스 0에 WINTER 추가됨
		
		
		
		// 삭제 1
		// list.remove("frog");
		
		//삭제2
		list.remove(4);
		
		// 수정
		list.set(2, "fall");
		
		System.out.println(list);
	}

	public static void ex02() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list.size());
		
		// 개별 요소 확인
		System.out.println("첫 번째 요소 : " + list.get(0));
		
		// 리스트 순회
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}
		System.out.println(total);
		
	}

	
	public static void ex03() {
		List<User> userList = new ArrayList<User>();
		
		for (int i = 0; i < 3; i++) {
			User user = new User("user", "123456");
			userList.add(user);	
			System.out.println(userList.get(i));
		}
	
		for (int i = 0; i < userList.size() ; i ++) {
			System.out.println(userList.get(i).getId());
			}
	}
	
	
	public static void main(String[] args) {
		ex03();
	}

}
