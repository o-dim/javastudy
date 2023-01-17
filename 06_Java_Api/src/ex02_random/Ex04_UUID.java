package ex02_random;

import java.util.UUID;

public class Ex04_UUID {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		
		//하이픈 없애기 : 모든 하이픈을 빈문자열로 바꾸기
		String replacedStr = str.replace("-", "");
		
		System.out.println(replacedStr);
		
		
	}

}
