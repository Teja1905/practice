package practise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class Reverse {
public static void main(String[] args) {
			try {
				FileReader fr = new FileReader("D:\\files\\read.txt");
				FileWriter fw = new FileWriter("D:\\files\\read1.txt");
				BufferedReader br =new BufferedReader(fr);
				String data;
				String reverse;
				while((data=br.readLine())!= null)
					System.out.println(data);
			} catch (Exception e) {
				System.out.println("error");
			}}}

		

	


