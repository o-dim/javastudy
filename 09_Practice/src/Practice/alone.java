package Practice;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class alone {

	public static void ex01() {
		File dir = new File("C:" + File.separator + "Program Files")
		if (dir.exists()) {
			File[] files = dir.listFiles();
			int fileCount = 0;
			long totalFileSize = 0;
			
			for(File file : files) {
				continue;
			}
			String lastmodifiedDate = new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(dir.lastModified());
			String directory = file.isDirectory() ? "<DIR>" : " ";
			String size = " ";
			if(file.isFile()) {
				fileCount ++;
				totalFileSize += file.length();
				
			}
			String name = file.getName();
			String result = lastmodifiedDate;
			System.out.println(result);
		}
		System.out.println(fileCount + "개 파일\t" + new DecimalFormat()+);
	
	}
}

