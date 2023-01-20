package ex05_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void ex01() {
		Map<String, Object> person = new HashMap<>();
		
		// 추가
		person.put("name", "홍길동");
		person.put("age", 19);
		
		person.put("age", 30);
		
		int age = (int)person.remove("age");
		System.out.println("삭제된 나이 : " + age);
		
		System.out.println(person);
	}
	
	public static void ex02() {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("spring", "봄");
		dictionary.put("summer", "여름");
		dictionary.put("autumn", "가을");
		dictionary.put("winter", "겨울");
		
		// value 가져오기
		// get(key)
		String season = dictionary.get("winter");
		System.out.println(season);
		
		
	}
	
	public static void ex03() {
		//map순회하기
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("spring", "봄");
		dictionary.put("summer", "여름");
		dictionary.put("autumn", "가을");
		dictionary.put("winter", "겨울");
		// 1. key만 모두 가져온 뒤, 해당 key 값을 가진 value 가져오기
		Set<String> keySet = dictionary.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + dictionary.get(key));
		}
		
		// 2. entry 가져와서 key와 value 로 분리하기
		for(Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
			
		}
	}
	
	public static void ex04() {
		
		// 연습문제
		// 제목(title), 저자(author), 가격(price)로 구성되는 책(book) : HashMap
		// 책 3권이 저장된 ArrayList 
		
		Map<String, Object> book1 = new HashMap<>();
		book1.put("title" , "어린왕자");
		book1.put("author", "생텍쥐페리");
		book1.put("price", 10000);
		
		Map<String, Object> book2 = new HashMap<>();
		book2.put("title" , "성냥팔이소녀");
		book2.put("author" , "안데르센");
		book2.put("price", 14000);
		
		Map<String, Object> book3 = new HashMap<>();
		book3.put("title" , "1987");
		book3.put("author", "조지오웰");
		book3.put("price", 16000);
		
		ArrayList<Map<String,Object>> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		System.out.println(books);
		
		//for문 순회 (List부터)
		for (int i = 0; i <books.size(); i++) {
			//map의 순회 (list에 저장된 요소)
			Map<String, Object> book = books.get(i);
			System.out.println((i + 1) + "번째 책의 정보");
			for(Entry<String, Object> entry : book.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			} System.out.println("\t ");
			
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex04();
		
	}

}
