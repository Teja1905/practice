package abstract2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Please Enter your option");
		System.out.println("1.person");
		System.out.println("2.Dog");
		int option =sca.nextInt();
		
		Object obj =Object.getObject(option);
		obj.comein();
		 
		
	
	
}
}