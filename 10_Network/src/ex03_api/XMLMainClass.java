package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class XMLMainClass {
	public static void ex01() {
	// 한국공항공사_항공기 운항정보 : 공항 코드 정보
	// 1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
	// 2. 요청 변수 Request Parameter
	/*
		 1) ServiceKey : 인증키 
		  
	
	 */
	
	
	String serviceKey= "87xlHrtNVNhlwTtrKjAjjsTFjnMTvNIa%2BUYcLlbJga5F0KOdN2%2F3lKtA3Je8te3lYZpearki0SbkbzT2P5ShTg%3D%3D";
	String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
	
	URL url = null;
	HttpURLConnection con = null;
	BufferedReader reader = null;
	BufferedWriter writer = null;
	
	try {
		apiURL += "?serviceKey=" + serviceKey;
		url = new URL(apiURL);
		
		con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		// xml 컨텐트타입 지정
		con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
		
		int responseCode = con.getResponseCode();			
		if(responseCode == 200) {
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		} else {
			reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		reader.close();
		con.disconnect();
		
		File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
		writer = new BufferedWriter(new FileWriter(file));
		writer.write(sb.toString());
		writer.close();
		
		System.out.println("공항코드정보가 생성되었습니다.");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}

	public static void ex02() {
		
		// 2. 요청 변수 Request Parameter
		/*
			 1) ServiceKey : 인증키 
			 2) pageNo :
			 3) schDate :
			 4) schDepCityCode :
			 5) schArrvCityCode :
		
		 */
		
		String serviceKey = "87xlHrtNVNhlwTtrKjAjjsTFjnMTvNIa%2BUYcLlbJga5F0KOdN2%2F3lKtA3Je8te3lYZpearki0SbkbzT2P5ShTg%3D%3D";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		URL url = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		HttpURLConnection con = null;
		
		try {
			apiURL += "?serviceKey=" + serviceKey;
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20230201";
			apiURL += "&schDeptCityCode=ICN";
			apiURL += "&schArrvCityCode=JFK";
			url = new URL(apiURL);
			
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				
			}
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "국제선 운항스케줄.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("국제선 운항스케줄 파일이 생성되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	public static void main(String[] args) {
		ex02();
	}

}
