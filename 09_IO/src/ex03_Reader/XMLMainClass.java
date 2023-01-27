package ex03_Reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLMainClass {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:" + File.separator + "storage", "product.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // product.xml을 분석(파싱)한 document 객체
			
			// 최상위요소... products 태그
			Element root = document.getDocumentElement();
			
			// product 태그
			List<Map<String, Object>> products = new ArrayList<Map<String,Object>>();
			NodeList nodeList = root.getChildNodes();
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i); //Node는  #text (줄바꿈)와 <product>태그 중 하나이다
				if (node.getNodeType() == node.ELEMENT_NODE) { // Node가 product 태그인가..?
					Map<String, Object> product = new HashMap<String, Object>();
					NodeList nodeList2 = node.getChildNodes();
					for (int j = 0; j < nodeList2.getLength(); j++) {
						Node node2 = nodeList2.item(j); // node2는 #text (줄바꿈)와 <model> <brand> <price> 태그 중 하나이다
						if(node2.getNodeType() == node.ELEMENT_NODE) { //node2가 <model> <brand> <price> 중 하나임?
							String key = node2.getNodeName(); //key는 model maker price 중 하나임
							product.put(key, node2.getTextContent());
								
							}
						}
						products.add(product);
					}
				}
				System.out.println(node.getNodeName());			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
