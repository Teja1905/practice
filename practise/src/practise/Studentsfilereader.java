package practise;

import java.io.BufferedReader;
import java.io.FileReader;

public class Studentsfilereader {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("D:\\marks.txt");
		BufferedReader br =new BufferedReader(fr);
		String str =br.readLine();
	//	int total =0;
		while(str!=null) {
			String[] values =str.split(",");
			System.out.println(values[3]);
			//int marks =Integer.parseInt(values[3]);
			//total=total+marks;
			str=br.readLine();
			//System.out.println(values[3]);	
		}
		//System.out.println(total);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}}
