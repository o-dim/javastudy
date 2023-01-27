package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMainClass {

	public static void main(String[] args) {

		File file = new File("C:" + File.separator + "storage", "product.json");
		
		BufferedReader bf = null;
		
		try {
			
			bf = new BufferedReader(new FileReader(file));
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while((line = bf.readLine()) != null) {
				sb.append(line);
			}
			
			JSONArray arr = new JSONArray(sb.toString());
			List<Map<String, Object>> products = new ArrayList<Map<String,Object>>();
			for (int i = 0; i < arr.length(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				products.add(obj.toMap()); // JSONObject obj를 MAP으로 바꿔서 List에 저장
			}

			System.out.println(products);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bf.lines() == null) {
					bf.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
