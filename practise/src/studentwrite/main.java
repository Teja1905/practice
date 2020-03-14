package studentwrite;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("enter your option");
		System.out.println("1.save");
		System.out.println("2.getbyid");
		System.out.println("3.getbyname");
		System.out.println("4.getall");
		
		int opt =Integer.parseInt(sca.nextLine());
		
		if(opt==1) {
			System.out.println("enter id");
			int id =Integer.parseInt(sca.nextLine());
			System.out.println("enter name");
			String name =sca.nextLine();
			System.out.println("enter marks");
			int marks =Integer.parseInt(sca.nextLine());
			System.out.println("enter qualification");
			String qual =sca.nextLine();
			
			Student std = new Student();
			std.setId(id);
			std.setName(name);
			std.setMarks(marks);
			std.setQual(qual);
			
			FileData fd =new FileData();
			fd.save(std);
			System.out.println("Done");
		}
		
  if(opt==2) {
	  System.out.println("enter id");
	  int id =Integer.parseInt(sca.nextLine());
	  System.out.println("Enter name");
	  String name = sca.nextLine();
	  System.out.println("Enter marks");
	  int marks =Integer.parseInt(sca.nextLine());
	  System.out.println("Enter Qualification");
	  String qual=sca.nextLine();
	  Student std = new Student();
	  std.setId(id);
	  std.setMarks(marks);
	  std.setName(name);
	  std.setQual(qual);
	  
	  
  }
	}

}
