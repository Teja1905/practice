package practise;

import java.io.File;

public class file {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\java files");
		boolean isFile =file.isFile();
		System.out.println(isFile);
		boolean isDir=file.isDirectory();
		System.out.println(isDir);
		File file2 =new File("D:\\New folder");
		boolean exists =file2.exists();
		System.out.println(exists);
	

	
		
		}
		
	}


