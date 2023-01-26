package Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
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
		
		File diary = new File(dir, "diary.txt");
		
		Scanner sc = new Scanner(System.in);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(diary)) {
			String[] input = new String[5];
			bw.write = sc.next();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) throws IOException { 
		ex04();
	}

}
