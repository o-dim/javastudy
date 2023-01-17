package ex01_String;

public class Ex02_StringBuffer {

	public static void main(String[] args) {
	StringBuffer stringBuffer = new StringBuffer();
	
	//문자열의 추가
	stringBuffer.append("ba");
	stringBuffer.append("na");
	stringBuffer.append("na");
	
	//StringBuffer에 저장된 문자열을 String으로 변환
	String str = stringBuffer.toString();
	System.out.println(str);
	
	}
}
