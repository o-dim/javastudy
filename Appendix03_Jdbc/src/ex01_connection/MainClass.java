package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {
	
	public static void ex01() {
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스가 로드되었습니다~~~!!!!~!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
	}
	
	public static void ex02() {
		
		Connection con = null;
		
		// 오라클 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "GDJ61";
		String password = "1111";
		
		// DriverManager 클래스로부터 Connection 객체 받아오기
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB에 접속완료^.^");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 사용이 끝난 Connection 객체는 반드시 닫아야한다.
		try {
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		ex02();
		
	}

}
