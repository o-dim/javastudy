package ex01_internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

public class MainClass {

	public static void ex01() {
		String apiURL = "http://search.naver.com/search.naver?query=삼성전자";
		URL url = null;
		try {
			
			url = new URL(apiURL);
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파라미터 : " + url.getQuery());
			
		} catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
			e.printStackTrace();
		}
		
	}
	
	public static void ex02(){
		
		// 웹 접속을 담당하는 HttpURLConnection
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			System.out.println("정상 응답 : " + HttpURLConnection.HTTP_OK);
			System.out.println("Not Found : " + HttpURLConnection.HTTP_NOT_FOUND);
			System.out.println("Internal Error : " + HttpsURLConnection.HTTP_INTERNAL_ERROR);
			
			//apiURL 접속확인
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				System.out.println(apiURL + "접속 완료");
			}
			
			//요청방식
			String requestMethod = con.getRequestMethod();
			System.out.println("요청방식 : " + requestMethod);
			
			//컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입 : " + contentType );
			
			// 요청 헤더
			String userAgent = con.getRequestProperty("User-Agent");
			System.out.println("User-Agent : " + userAgent);
			
			String referer = con.getRequestProperty("Refere");
			System.out.println("Refere : " + referer); // 이전 주소가 나옴
			
			// 접속 종료
			con.disconnect();
			
		} catch (MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch (IOException e) {
			System.out.println("apiURL 접속 오류");
		}
		
	}
	
	public static void ex03() {
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		HttpURLConnection con = null;
		BufferedOutputStream out = null;
		URL url = null;
		BufferedInputStream in = null;
		File file = new File("C:/" + File.separator + "storage" + File.separator + "daum.png");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int respondCode = con.getResponseCode();
			if (respondCode == HttpURLConnection.HTTP_OK) {
				
				in = new BufferedInputStream(con.getInputStream());
				out = new BufferedOutputStream(new FileOutputStream(file));
				
				byte[] b = new byte[10];
				int readCount = 0;
				
				while((readCount = in.read(b)) != -1) {
					out.write(b, 0, readCount);
				}
				
			}
			System.out.println("다운로드 완료");
			out.close();
			in.close();
			con.disconnect();
			
			
			
		} catch (MalformedURLException e) {

		} catch (IOException e) {

		}
		
	}
	
	public static void ex04() {
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		HttpURLConnection con = null;
		File file = new File("C:/" + File.separator + "storage", "다운로드문서.txt");
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int respondCode = con.getResponseCode();
			if(respondCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			StringBuilder sb = new StringBuilder();
			int readCount = 0;
			char[] cbuf = new char[2];
			
			while((readCount = reader.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount);
			}
			System.out.println("다운로드 완료");
			
			
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			
			writer.close();
			reader.close();
			con.disconnect();
			
		} catch (MalformedURLException e) {
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void ex05() {
		String data = "한글 English 1234 ^.^";
		
		try {
			String encodeData = URLEncoder.encode(data, "UTF-8");
			System.out.println(encodeData);
			
			String decodeData = URLDecoder.decode(encodeData, "UTF-8");
			System.out.println(decodeData);
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 실패");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex05();
	}

}
