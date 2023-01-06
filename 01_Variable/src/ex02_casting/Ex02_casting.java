package ex02_casting;

public class Ex02_casting {

	public static void main(String[] args) {
		// 강제변환
		int n = 256;
		byte bn = (byte)n;

		System.out.println(bn);

		double leftEye = 0.7;
		int ileftEye = (int)leftEye; // 변수 leftEye를 int 타입으로 바꾼 거
		System.out.println(leftEye);
		System.out.println(ileftEye); // 소수점은 잘려나간다
	}

}
