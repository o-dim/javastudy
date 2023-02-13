package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiMain {

	public static void main(String[] args) {
		String serviceKey = "87xlHrtNVNhlwTtrKjAjjsTFjnMTvNIa%2BUYcLlbJga5F0KOdN2%2F3lKtA3Je8te3lYZpearki0SbkbzT2P5ShTg%3D%3D";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		URL url = null;
		
	
		try {
			StringBuilder sbUrl = new StringBuilder();
			sbUrl.append(apiURL);
			sbUrl.append("?serviceKey=" + serviceKey);
			sbUrl.append("&returnType=json");
			sbUrl.append("&searchYear=2021");
			sbUrl.append("&siDo=1100&guGun=1125");
			sbUrl.append("&numOfRows=10");
			sbUrl.append("&pageNo=1");
			
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
		
			/*
			Accident acc = new Accident( , , , );
			File file = new File("accident.txt");
			
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(acc);
			System.out.println("accident.txt가 생성되었습니다.");
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
