package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

import sun.text.resources.ext.JavaTimeSupplementary_es_US;

public class JSONMainClass {

	
	public static void ex01() {
		String serviceKey = "87xlHrtNVNhlwTtrKjAjjsTFjnMTvNIa%2BUYcLlbJga5F0KOdN2%2F3lKtA3Je8te3lYZpearki0SbkbzT2P5ShTg%3D%3D";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		URL url = null;
		
		try {
			StringBuilder sbUrl = new StringBuilder();
			String sidoName = "서울";
			sbUrl.append(apiURL);
			sbUrl.append("?serviceKey=" + serviceKey);
			sbUrl.append("&returnType=json");
			sbUrl.append("&sidoName=" + URLEncoder.encode(sidoName, "UTF-8"));
			
			url = new URL(sbUrl.toString());
			
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
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
			
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject body = obj.getJSONObject("response").getJSONObject("body");
			int totalCount = body.getInt("totalCount");
			JSONArray items = body.getJSONArray("items");
			for (int i = 0; i < items.length() ; i++) {
				JSONObject item = (JSONObject)items.get(i);
				String stationName = item.getString("stationName");
				String pm10Vlaue = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				
				System.out.println(stationName + " : 미세먼지 - " + pm10Vlaue + ", 오존농도 - " + o3Value);
			}
			/*
			
			File file = new File("C:" + File.separator + "storage", "시도별 실시간 측정정보.json");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			System.out.println("시도별 실시간 측정정보 파일이 생성되었습니다.");
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex02() {
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
		String serviceKey = "87xlHrtNVNhlwTtrKjAjjsTFjnMTvNIa+UYcLlbJga5F0KOdN2/3lKtA3Je8te3lYZpearki0SbkbzT2P5ShTg==";
		BufferedReader reader = null;
		HttpURLConnection con = null;
		URL url = null;
		try {
			StringBuilder sbUrl = new StringBuilder();
			sbUrl.append(apiURL);
			sbUrl.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbUrl.append("&returnType=json");
			sbUrl.append("&searchDate=2023-01-19");
			url = new URL(sbUrl.toString());
			
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
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
			
			System.out.println(sb.toString());
			JSONObject obj = new JSONObject(sb.toString());
			
			JSONArray items = obj.getJSONObject("response")
								.getJSONObject("body")
								.getJSONArray("items");
			
			for (int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("presnatnDt"));
				
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
