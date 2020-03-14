package abstract1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  //Scanner sca = new Scanner(System.in);
		 System.out.println("Please enter your option");
		 System.out.println("1.Whatsapp");
		 System.out.println("2.Mail");
		 
		   Scanner sca = new Scanner(System.in);
		   
		   int option = sca.nextInt();
		   Message msg = null;
		   
		    if(option==1) {
		    	msg = new Whatsapp();
		 
		    }
		    	else if(option==2) {
		    		msg = new Mail ();
		    		}
		    
		    	 
		    	 msg.sendmessage();
		    	
		    	
		    }
		   
		   
		
		
		
		
	}


