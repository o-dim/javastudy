package Practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class MainClass {

	public static void ex01() {
		
		LocalTime now = LocalTime.now();
		int hour = now.getHour();
		int min = now.getMinute();
		int sec = now.getSecond();
		
		File dir = new File("C:" + File.separator + hour + File.separator + min + File.separator + sec);
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		
	}
	
	public static void ex02() {
		// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 아래와 같이 출력하시오.
		/*
		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
		*/
		
		File dir = new File("C:" + File.separator + "Program Files" + File.separator + "Java" + File.separator + "jdk-11.0.17");

		/*
		int total = 0;
		long lastModified = dir.lastModified();
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(lastModified);
		
		if (dir.exists()) {
			File[] files = dir.listFiles();
			for(int i = 0; i < files.length; i++) {
				if(files[i].isHidden() == false) {
					System.out.println(lastModifiedDate + "\t" + files[i].getParent() + "\t" + files[i].getName());
				}
				total += files[i].length();
			}
			System.out.println("\t" + "\t" + files.length + "개 파일\t" + total + " 바이트");
			
		}
		*/
		if(dir.exists()) {
			File[] files = dir.listFiles();
			int fileCount = 0;
			long totalFileSize = 0;
			
			for(File file : files) {
				if(file.isHidden()) {
					continue;
				}
				String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(dir.lastModified());
				String directory = file.isDirectory() ? "<DIR>" : " ";
				String size = " ";
				if (file.isFile()) {
					size = new DecimalFormat("#,##0").format(file.length());
					fileCount ++;
					totalFileSize += file.length();
				}
				String name = file.getName();
				String result = String.format("%s%9s%9s %s\n", lastModifiedDate, directory, size, name);
				System.out.print(result);
			}
			System.out.println(fileCount + "개 파일\t" + new DecimalFormat("#,##0").format(totalFileSize) + " byte");
		}
	}
	
	public static void ex03() {
		//문제 3 C:\storage 디렉터리를 삭제하시오
		
		/*
		File dir = new File("C:" + File.separator + "storage");
		File[] dir2 = dir.listFiles();
		for (int i = 0; i < dir2.length ; i++) {
			dir2[i].delete();
		}
		*/
		
		File dir = new File("C:" + File.separator + "storage");
		File dir2 = new File(dir, "myfile.txt");
		if(dir2.exists()) {
			dir2.delete();
		}
		if(dir.exists()) {
			dir.delete();
		}
	
	}
	
	public static void ex04() {
		
		//사용자로부터 입력받은 문자열을 C:\storage\diary.txt로 보내시오
		//총 5개문장을 입력보내라
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] sentence = new String[5];
		System.out.println("5문장을 입력하시오");
		for(int i = 0; i < sentence.length; i++) {
			sentence[i] = sc.nextLine();
		}

		File diary = new File(dir, "diary.txt");

		try(PrintWriter out = new PrintWriter(diary)) {
		
			for(int i = 0; i < sentence.length; i++) {
				out.println(sentence[i]);
			}
			System.out.println("diary.txt 생성 완료!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
		
		
	}
	
	public static void ex05() {
		// 문제5. 예외가 발생한 경우 예외 메시지와 예외 발생시간을 저장한 C:\storage\log.txt 파일을 생성하시오.
		// 예시)
		// 2023-01-26 12:08:30 / by zero
		
		try {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("첫 번째 정수를 입력하세요 >>> ");
			int num1 = sc.nextInt();
			
			System.out.println("두 번째 정수를 입력하세요 >>> ");
			int num2 = sc.nextInt();
			
			
			int add = num1 + num2;
			int sub = num1 - num2;
			int mul = num1 * num2;
			int div = num1 / num2;
			
			System.out.println(num1 + "+" + num2 + "=" + add);
			System.out.println(num1 + "-" + num2 + "=" + sub);
			System.out.println(num1 + "x" + num2 + "=" + mul);
			System.out.println(num1 + "/" + num2 + "=" + div);
			
		} catch(Exception e) {
			//날짜
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String dateTime = dtf.format(now);
			
			//예외클래스 이름
			String ClassName = e.getClass().getName();
			
			//예외메세지
			String message = e.getMessage();
			
			//로그파일 만들기
			File dir = new File("C:" + File.separator + "storage");
			if (dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, "log.txt");
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
				bw.write(dateTime + " " + ClassName + " " + message + "\n");
				//bw.newLine은 \n을 대신할 수 있는 코드임
				System.out.println("예외 메세지가 log.txt 파일에 기록되었습니다.");
			} catch (IOException e2) {
				e2.printStackTrace();
			} 
		}
		
	}
	
	public static void ex06() {
		
	
		// 문제 6 C:\storage\diary.txt 파일을 C:diary.txt 파일로 이동하시오.
		File from = new File("C:" + File.separator + "storage", "diary.txt");		
				
		File toDir = new File("C:" + File.separator + "storage2");
		if(toDir.exists() == false) {
			toDir.mkdirs();
		}
		File to = new File(toDir, from.getName());
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			long startTime = System.currentTimeMillis();

			br = new BufferedReader(new FileReader(from));
			bw = new BufferedWriter(new FileWriter(to));
			
			String line = null;
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			
			bw.close();
			br.close();
			
			if(from.length() == to.length()) {  // 복사 성공했다면 삭제
				from.deleteOnExit();
			}

			long stopTime = System.currentTimeMillis();
			
			System.out.println("이동에 걸린 시간 : " + (stopTime - startTime) + "밀리초");
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
				
	}
	
	public static void ex07() {
		// System.in은 키보드로부터 바이트 데이터를 입력받는 inputStream이다
		// System.in으로부터 문장 하나를 입력받아서 출력하시오
		// Scanner 대신 BufferReader를 사용하시오
		
		BufferedReader br = null;
		
		try {
			/*
			
			
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("문장입력 >>> ");
			String line = "";
			for (int i = 0; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}
			
			
			 */
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("문장입력 >>> ");
			String sentence = br.readLine();
			
			System.out.println("입력된 문장 : " + sentence);
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex08() {
		
		File file = new File("C:" + File.separator + "storage", "ex08.txt");
		
		Scanner sc = new Scanner(System.in);
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			String sentence = sc.nextLine();
			
			dos.writeUTF(sentence);
			
			dos.close();
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} sc.close();
		
	}
	
	public static void ex09() {
		// C:\GDJ61\installer\에 있는 eclipse-jee-2021-03-R-win32-x86_64.zip 파일을 C:\GDJ61\eclipse.zip 으로 복사하시오
		File from = new File("C:" + File.separator + "GDJ61" + File.separator + "installer", "eclipse-jee-2021-03-R-win32-x86_64.zip");
		File to = new File("C:" + File.separator + "GDJ61", "eclipse.zip");
		
		
		try {
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			byte[] b = new byte[1024]; // 1024byte 씩 옮긴다 (1kb)씩
			int readByte = 0;
			
			bis = new BufferedInputStream(new FileInputStream(from));
			bos = new BufferedOutputStream(new FileOutputStream(to));
			
			
			while((readByte = bis.read(b)) != -1) {
				bos.write(b, 0, readByte);
			} 
			System.out.println("복사완료 되었습니다.");
			bis.close();
			bos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) throws IOException { 
		ex08();
	}

}
