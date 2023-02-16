package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MemberTableMainClass {

	public static void main(String[] args) {

		// create connection
		Connection con = null;
		try {
			//오라클 드라이브 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			//properties 파일 읽어서 객체 생성하기
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			// Connection 생성하기
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("완료료^.^");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//JDBC에서는 쿼리문의 마지막에 ;을 쓰지 않는다!!
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE MEMBER_TBL (");
		sb.append("MEMBER_NO NUMBER NOT NULL CONSTRAINT PK_MEMBER PRIMARY KEY");
		sb.append(", ID VARCHAR2(30 BYTE) NOT NULL UNIQUE");
		sb.append(", NAME VARCHAR2(30 BYTE) NOT NULL");
		sb.append(", ADDRESS VARCHAR2(30 BYTE)");
		sb.append(", JOIN_DATE DATE NOT NULL)");
		String sql = sb.toString();
		
		//쿼리문 작성 및 실행
		PreparedStatement ps = null;

		try {
			// preparedstatement 객체 생성
			ps = con.prepareStatement(sql);
			
			ps.execute();
			System.out.println("쿼리문이 실행되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 사용한 자원 반납하기
		try {
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
