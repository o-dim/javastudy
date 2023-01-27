package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
		
		File file1 = new File("C:" + File.separator + "storage", "diary.txt");
		File file2 = new File("C:" + File.separator + "storage2");
		if(file2.exists() == false) {
			file2.mkdirs();
		}
		
		try {
			File file3 = new File(file2, "diary.txt");
			if(file3.equals(file1)) {
				file3 = file1;
				file3.delete();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException { 
		ex06();
	}

}
