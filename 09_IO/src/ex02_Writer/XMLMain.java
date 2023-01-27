package ex02_Writer;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMain {
	
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

		List<Map<String, Object>> productList = Arrays.asList(product1, product2, product3);
		
		//document 생성하자
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			
			// <products> 태그 : element 생성
			Element products = document.createElement("products");
			document.appendChild(products);
			
			//productList 순회
			for(Map<String, Object> map : productList) {
				// <product> 태그
				Element product = document.createElement("product");
				products.appendChild(product);
				//model 태그
				Element model = document.createElement("model");
				product.appendChild(model);
				model.setTextContent(map.get("model").toString());
				// brand
				Element brand = document.createElement("brand");
				product.appendChild(brand);
				brand.setTextContent(map.get("brand").toString());
				//price
				Element price = document.createElement("price");
				product.appendChild(price);
				price.setTextContent(map.get("price").toString());
				
				//xml 설정
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty("encoding", "UTF-8");
				transformer.setOutputProperty("indent", "yes");
				
				// xml 문서 만들기
				
				File dir = new File("C:" + File.separator + "storage");
				if(dir.exists() == false) {
					dir.mkdirs();
				}
				File file = new File(dir, "product.xml");
				
				Source source = new DOMSource(document);
				StreamResult streamResult = new StreamResult(file); // 결과를 보낼 stream이 file이다
				transformer.transform(source, streamResult);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	
	}
}
