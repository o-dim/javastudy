package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {

	public static void ex01() {
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		// 출력 스트림의 선
		FileWriter fw = null;
		try {
			//출력 스트림 생성작업
			fw = new FileWriter(file);
			//출력 스트림으로 문자 보내기
			int c = 'I';
			char[] cbuf = {' ', 'a', 'm' };
			String str = " a boy.";
			fw.write('c'); 
			fw.write(cbuf);
			fw.write(str);
			
			System.out.println("ex01 파일이 생성되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null) {
					fw.close(); // 반드시 예외 처리가 필요하다 
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		
	}
	
	public static void ex02() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists()==false) {
			dir.mkdirs();
		}
		
		File file = new file (dir, "ex02.txt");
		try(FileWriter fw = new FileWriter(file)) {
			
			char[] cbuf = {'a', 'b', 'c', 'd', 'e'};
			String str = "abcde";
			
			fw.write(cbuf, 0, 2); // idx 0부터 2글
			fw.write(str, 2, 3); //cde 보내
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		FileWriter fw = null;
		
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			
			bw = new BufferedWriter(fw);
			
			
			bw.write("Hello World");
			
			System.out.println("ex03.txt 파일이 생성되었습니다.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
					//보조 스트림이 닫히면 메인 스트림도 같이 닫힘
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void ex04() {
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)) {
			bw.write("HelloWorld!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ex05() {
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex05.txt");
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(file);
			
			out.println("비비고냉동만두");
			out.println("짱추워");
			
			System.out.println("ex05.txt가 생성되었습니다~~우와~");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
		
	}
	
		
	public static void main(String[] args) {
	
	}
	
}
