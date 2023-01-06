package ex03_parsing;

public class MainClass {

	public static void main(String[] args) {
		String strScore = "90";
		String strMoney = "100000000";
		String strEye = "0.7";
		
		// String > int 변환
		int score = Integer.parseInt(strScore);
		System.out.println(score);
		
		// String > long 변환
		long money = Long.parseLong(strMoney);
		System.out.println(money);
		
		// String > double 변환
		double eye = Double.parseDouble(strEye);
		System.out.println(eye);
	}

}
