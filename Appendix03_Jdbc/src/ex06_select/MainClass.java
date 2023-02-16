package ex06_select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MainClass {
	
	//select 결과행이 1개인 경우
	public static void ex01() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // 오직 select문에서만 사용한다
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, p);
			
			String sql = "SELECT MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE";
			sql += " FROM MEMBER_TBL";
			sql += " WHERE MEMBER_NO = ?";
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 2;
			
			ps.setInt(1, memberNo);
			
			rs = ps.executeQuery(); // SELECT문 실행 메소드
			// System.out.println(rs.next()); // 첫 번째 결과물이 있으면 true 없으면 false
			// System.out.println(rs.next()); // 두 번째 결과물이 있으면 true 없으면 false
			
			// Member 객체 선언
			Member member = null;
			
			
			// 결과 행이 최대 1개 있으므로 if문으로 분기처리
			if(rs.next()) {
				//결과 행에 각 칼럼 정보 읽기
				// member_no, id, name... 다 따로따로 읽는다고
				member = new Member();
				// 이걸 다 읽어서 Member 객체로 만드는 거임....
				
				member.setMember_no(rs.getInt("MEMBER_NO"));
				member.setId(rs.getString("ID"));
				member.setName(rs.getString("NAME"));
				member.setAddress(rs.getString("ADDRESS"));
				member.setJoin_date(rs.getDate("JOIN_DATE"));
				
			}
			
			System.out.println(member);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e2) {  
				e2.printStackTrace();
			}
		}                      
		
		
	}
	
	//  select 결과 행이 2개 이상인 경우
	public static void ex02() {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, p);
			
			sql =  "SELECT MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE";
			sql += " FROM MEMBER_TBL"; // 전체 멤 조회 -> 결과 여러개 나오게찌
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery(); 
			// 결과 행이 여러개다 ? ArrayList를 준비한다....
			List<Member> memberList = new ArrayList<>();
			
			// 결과 행이 여러 개 있으므로 while 문으로 반복 처리
			while(rs.next()) {
			
			Member member = new Member();
			member.setMember_no(rs.getInt("MEMBER_NO"));
			member.setId(rs.getString("ID"));
			member.setName(rs.getString("NAME"));
			member.setAddress(rs.getString("ADDRESS"));
			member.setJoin_date(rs.getDate("JOIN_DATE"));
				
			// Member 객체를 Arraylist에 저장하자
			memberList.add(member);			
			}

			// while 문이 종료된 후 arrayList의 사이즈가 0이라면 조회된 결과가 없었다는 의미가 된다.
			for (int i = 0; i < memberList.size(); i++) {
				System.out.println(memberList.get(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (Exception e2) {  
				e2.printStackTrace();
			}
		}                      
	}
	
	public static void main(String[] args) {
		ex02();

	}

}
