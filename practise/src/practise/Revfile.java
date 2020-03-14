package practise;

import java.io.FileReader;

public class Revfile {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("D:\\files\\read.txt");
        int a = fr.read();
        System.out.println(a);
		while (a!= -1) {
			System.out.print((char) a);
			a = fr.read();
		}
	} catch (Exception e) {
		System.out.println("error");
	}

}

}

