package ex02_Writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVMainClass {

	public static void main(String[] args) {
		Map<String, Object> product1 = new HashMap<String, Object>();
		product1.put("model", "세탁기");
		product1.put("brand", "삼성");
		product1.put("price", 100);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		product2.put("model", "냉장고");
		product2.put("brand", "엘지");
		product2.put("price", 200);
		
		Map<String, Object> product3 = new HashMap<String, Object>();
		product3.put("model", "TV");
		product3.put("brand", "삼성");
		product3.put("price", 300);

		
		List<Map<String,Object>> products = Arrays.asList(product1, product2, product3);
		
		/*
		List<Map<String, Object>> products2 = new ArrayList<Map<String,Object>>();
		products2.add(product1);
		products2.add(product2);
		products2.add(product3);*/
		
		File dir = new File("C:" + File.separator + "storage");
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "product.csv");
		try(PrintWriter out = new PrintWriter(file)){
			for(int i = 0; i < products.size(); i++) {
				out.println(products.get(i).get("model") + "," + products.get(i).get("brand") + "," + products.get(i).get("price"));
			}
			System.out.println("product.csv가 생성되었음");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
