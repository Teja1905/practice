package practise;

import java.io.BufferedReader;
import java.io.FileReader;

public class Trim {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader ("D:\\abc.txt");
	    BufferedReader br = new BufferedReader(fr);
		String str =br.readLine();
		int count =0;
		while(str!=null) {
			str=str.trim();
			if(!str.equals("")) {
			count++;}
		
		str=br.readLine();}
		System.out.println(count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}}


