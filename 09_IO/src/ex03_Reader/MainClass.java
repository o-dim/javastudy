package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void ex01() {
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			int c; // 한 글자를 저장하는 변수
			StringBuilder sb = new StringBuilder();
			while((c = fr.read()) != -1) {
				sb.append((char)c);
			}
			System.out.println(sb.toString());
		} catch(IOException e) { //FileNotFoundException이 함께 처리됨
			e.printStackTrace();
		} finally {
			try {
				if(fr !=null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public static void ex02() {
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex02.txt");
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(file);
			char[] cbuf = new char[5]; // 5글자를 읽어 들이는 배열
			int readCount = 0;
			StringBuilder sb = new StringBuilder();
			
			while((readCount = fr.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount); // 인덱스 0부터 readCount개 글자를 추가하시오
				
				//읽는 과정
				//루프       readCount cbuf
				//1단계      5       a b c d e
				//2단계      2       f g c d e
				//3단계      -1 (읽을게 없음...)
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex03() {
		File dir = new File("C:" + File.separator + "storage");
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File (dir, "ex03.txt");
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			
			System.out.println(sb.toString());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void ex04() {
		
		// bf 로 한줄씩 읽기
		//, 로 split
		//분리된 걸 map에 저장
		// 이를 3번 하니까 반복문에
		
		for (int i = 0; i < 3; i ++) {
			
		}
		
		
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
