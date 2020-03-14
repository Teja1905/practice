package practise;

import java.io.BufferedReader;
import java.io.FileReader;

public class filereader  {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("D:\\files\\employee.txt"+"D:\\files\\marks.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		while(str!=null) {
			System.out.println(str);
			str=br.readLine();
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}

}}
