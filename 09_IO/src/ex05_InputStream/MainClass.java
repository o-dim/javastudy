package ex05_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;

import ex04_OutputStream.Person;

public class MainClass {

	public static void ex01() {
		
		File file = new File("C:" + File.separator + "storage", "ex01.bin");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			int c = 0;
			StringBuilder sb = new StringBuilder();
			
			while((c = fis.read()) != -1) {
				sb.append((char)c);
			}
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	public static void ex02() {
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		FileInputStream fis = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			fis = new FileInputStream(file);
			
			byte[] b = new byte[3]; // 한번에 4바이트를 읽어오는데
			int readByte = 0; // 못 읽을 수도 있으니까 실제로 읽은 바이트를 저장해두기
			
			
			while((readByte = fis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte)); // 배열 b의 인덱스 0 부터 readByte개 데이터를 사용한다
			}
			fis.close();
			
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ex02_complete() {
		
		// 해결해보자~ 변환 스트림을 써서!
	
		// INPUTSTREAMREADER 
		
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		InputStreamReader isr = null;
		
		try {
			isr = new InputStreamReader(new FileInputStream(file)); // 바이트 스트림이 아닌 문자 스트림이 되어부림...
			
			char[] cbuf = new char[4];
			int readCount = 0; // 실제 읽은 글자 수 저장
			StringBuilder sb = new StringBuilder();
			
			
			while((readCount = isr.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount);
			}
			System.out.println(sb);
			isr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex03() {
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			
			byte[] b = new byte[4];
			int readByte = 0;
			StringBuilder sb = new StringBuilder();
			
			while((readByte = bis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}	
	}
	
	public static void ex03_complete() {
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String str = null;
			StringBuilder sb = new StringBuilder();
			
			while((str = br.readLine()) != null) {
				sb.append(str);
			}
			System.out.println(sb);
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex04() {
		
		//Stirng name, int age, double height, boolean inAlive 순으로 저장된 ex04.dat 파일
		File file = new File("C:" + File.separator + "storage", "ex04.dat");
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream(file));
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			boolean isAlive = dis.readBoolean();
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(isAlive);
			
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void ex05() {
		//person 객체가 3개 (list<Person> 2개, Person 1개)
		File file = new File("C:" + File.separator + "storage", "ex05.dat");
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			//readObject는 Object를 반환하기에 적절한 캐스팅이 필요하다
			@SuppressWarnings("unchecked")
			List<Person> people = (List<Person>)ois.readObject();
			Person person = (Person)ois.readObject();
			
			
			System.out.println(people);
			System.out.println(person);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {

		ex05();
	}

}
