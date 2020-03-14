package Abstract;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Enter your option");
		System.out.println("1.telugu");
		System.out.println("2.punjabi");
		System.out.println("3.northeast");
		 int opt =sca.nextInt();
		 Food f = null;
		 if(opt==1) {
			 f =new telugu();
		 }
		if(opt==2) {
			f=new punjabi();
		}
		if(opt==3) {
			f=new northeast();
		}
		f.eat();
	}

}
