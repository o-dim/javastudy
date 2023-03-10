package practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	// 문제1. 가위바위보
	// 실행
	// 가위바위보 >>> 가위
	// 당신은 가위, 컴퓨터는 보, 이겼습니다.
	// Hint : 가위는 0, 바위는 1, 보는 2로 처리한다.
	public static void ex01() {
		int user = 0;
		int com = ((int)Math.random() * 3); // 0, 1, 2 나
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보 (2) >>>" );
		user = sc.nextInt();
		
		switch (user) {
		case 0 :
			switch (com) {
				case 0 : System.out.println("당신은 가위, 컴퓨터는 가위, 비겼습니다."); break;
				case 1 : System.out.println("당신은 가위, 컴퓨터는 바위, 졌습니다."); break;
				case 2 : System.out.println("당신은 가위, 컴퓨터는 보, 이겼습니다."); break;
			} break;
		case 1 :
			switch (com) {
				case 0 : System.out.println("당신은 바위, 컴퓨터는 가위, 이겼습니다."); break;
				case 1 : System.out.println("당신은 바위, 컴퓨터는 바위, 비겼습니다."); break;
				case 2 : System.out.println("당신은 바위, 컴퓨터는 보, 졌습니다."); break;
			} break;
		case 2 :
			switch (com) {
				case 0 : System.out.println("당신은 보, 컴퓨터는 가위, 졌습니다."); break;
				case 1 : System.out.println("당신은 보, 컴퓨터는 바위, 이겼습니다."); break;
				case 2 : System.out.println("당신은 보, 컴퓨터는 보, 비겼습니다."); break;
			} break;
		}
	}

	// 문제2. 친구 3명을 저장할 수 있는 배열을 생성하고 임의의 값으로 초기화하시오.
	// 새로 사귄 친구의 수를 입력 받아서 기존 친구들이 저장된 배열의 길이를 새로 사귄 친구의 수만큼 늘리시오.
	public static void ex02() {
		/*
		String[] fr = {"tom", "james", "nick"};
		List<String> friend = new ArrayList<>();
		friend.addAll(Arrays.asList(fr));
		Scanner sc = new Scanner(System.in);
		System.out.println("친구 이름? >>> ");
		String newFriend = sc.next();
		friend.add(newFriend);
		System.out.println(friend);
		*/
		
		int[] frd = {0, 1, 2};
		Scanner sc = new Scanner(System.in);
		System.out.println("새로사귄 친구의 수 >>> ");
		int nfrd = sc.nextInt();
		sc.close();
		
		int[] frd2 = new int[frd.length + nfrd];
		for(int i = 0; i < frd.length; i++) {
			frd2[i] = frd[i];
		}
		frd = frd2;
		
		System.out.println(Arrays.toString(frd2));
		
	}
	
	// 문제3. Scanner 클래스의 next() 메소드를 이용해서 사용자로부터 문자열을 계속 입력 받는다.
	// 사용자가 "종료" 문자열을 입력하면 더 이상 입력 받지 않는다.
	// 총 몇 번만에 종료되었는지 그 횟수를 마지막에 출력한다.
	public static void ex03() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하시오 >>> ");
			String newWord = sc.next();
			i ++;
			if (newWord.equals("종료")) {
				break;
			}	
		} System.out.println("프로그램을 종료합니다. 총 " + i + "회");
	}

	// 문제4. 퀴즈 정답을 맞힐때까지 계속 퀴즈를 내시오.
	// 질문 : 대한민국의 수도는? >>> 서울
	// 정답입니다.
	// 질문 : 대한민국의 수도는? >>> seoul
	// 정답입니다.
	// 질문 : 대한민국의 수도는? >>> 인천
	// 오답입니다.
	public static void ex04() {	
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("대한민국의 수도는? >>> ");
			String city = sc.next();
			switch(city) {
			case "서울" : case "seoul" :
				System.out.println("정답입니다.");
				break;
			default :
				System.out.println("오답입니다.");
			}
			sc.close();
		}
		
	}
	
	// 문제5. 평점 입력 받아서 해당 평점만큼 ★을 출력하시오.
	// 평점은 1 ~ 5 사이 정수로 입력 받는데, 벗어난 범위는 다시 입력 받는다.
	public static void ex05() {
		int grade = 0;
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("평점을 입력하세요 (1~5) >>> ");
			grade = sc.nextInt();
		} while (grade < 0 || grade > 5);
		for (int count = 0 ; count < grade; count ++) {
			sb.append("★");
		}
		String stars = sb.toString();
		System.out.println(stars); }
	

	// 문제6. 비밀번호를 "1234"로 가정한다.
	// 사용자로부터 비밀번호를 입력 받아서 "1234"와 같으면 "성공", "1234"가 아니면 다시 비밀번호를 입력 받도록 처리하시오.
	// 비밀번호 입력은 최대 5번으로 제한하고, 5번의 입력이 모두 틀리면 최종적으로 "실패"를 출력하시오.
	public static void ex06() {
		String pw = "1234";
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i ++) {
			System.out.println("비밀번호를 입력하시오 >>> ");
			String userPw = sc.next();
			if(pw.equals(userPw)) {
				System.out.println("성공");
				break;
			}
		} System.out.println("실패");
			
	}
	// 문제7. 구구단을 외자.
	// 2~9단 사이의 임의의 구구단이 출력되면 정답을 입력한다.
	// 정답을 입력해서 맞으면 "정답", 틀리면 "땡"을 출력하시오.
	// 예시1)
	// 4x9? >>> 36
	// 정답
	// 예시2)
	// 8x7? >>> 49
	// 땡
	public static void ex07() {
		Scanner sc = new Scanner(System.in);
		int a = (int) (Math.random() * 8) + 2;
		int b = (int) (Math.random() * 9) + 1;
		while(true) {
			System.out.println(a + "x" + b + " >>> ");
			int answer = sc.nextInt();
			if (answer == a * b) {
				System.out.println("정답");
				return;
			} System.out.println("땡");
			return;
		}
	}
	
	// 문제8. 임의의 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
	// 나이 : 현재년도 - 태어난년도 + 1
	// 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
	// 예시)
	// 28살 여자입니다.
	public static void ex08() {
		
	}
	
	// 문제9. 다음 기준에 따라서 파일명을 변환하시오.
	// Scanner 클래스의 next() 메소드를 이용해서 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
	// 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
	// 예시)
	// 변환 전 파일명 >>> happy.jpg
	// 변환 후 파일명 = happy_1658792128410.jpg
	public static void ex09() {
		Scanner sc = new Scanner(System.in);
		long timestamp = System.currentTimeMillis();

		System.out.println("파일명을 입력하시오 (파일명.jpg) >>> ");
		String filename = sc.next();
		System.out.println(filename+ "_" + timestamp + ".jpg");
	}
	
	// 문제10. Scanner 클래스의 next() 메소드를 이용해서 사람 이름을 입력 받은 뒤
	// 친구의 이름이면 "반갑다 친구야"를 출력하고, 모르는 사람의 이름이면 "처음 뵙겠습니다"를 출력하시오.
	// 친구의 이름을 String[] friend 배열에 저장한 뒤 작업을 수행하시오.
	// 예시1
	// 이름 입력 >>> 정우성
	// 반갑다 친구야
	// 예시2
	// 이름 입력 >>> 유재석
	// 처음 뵙겠습니다
	public static void ex10() {
		Scanner sc = new Scanner(System.in);
		String[] friend = {"정우성", "한소희", "유인나" };
		System.out.println("이름 입력 >>> ");
		String put = sc.next();
		if(Arrays.binarySearch(friend, put) >= 0) {
			System.out.println("반갑다 친구야");
		} else {
			System.out.println("처음 뵙겠습니다.");
		}
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
