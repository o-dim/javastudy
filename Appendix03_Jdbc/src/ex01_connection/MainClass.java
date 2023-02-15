package ex01_connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainClass {
	
	public static void ex03() {
		BufferedReader reader = null;
		Connection con = null;
		
		try {
			
			// 프로퍼티 파일을 읽는 문자 입력 스트림 생성하기
			reader = new BufferedReader(new FileReader("db.properties"));
			
			// Properties 파일 읽어서 사용자 정보 처리하기 
			Properties properties = new Properties();
			properties.load(reader);
			
			// 프로퍼티 객체에 저장된 각 Property 읽기
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			// DriverManager로 부터 Connection 객체 얻기
			con = DriverManager.getConnection(url, user, password);
			System.out.println("db접속완.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
				}
		}
		
		
	}
	
	public static Connection getConnection() throws Exception {
		
		Connection con = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Properties properties = new Properties();
		properties.load(new BufferedReader(new FileReader("db.properties")));
		
		con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
				
		return con;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		Connection con = getConnection();
		System.out.println("DB에 접속 완.");
		
	}

}
