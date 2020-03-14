package New;

public class Basicpower {
	public static void main(String[] args) {
		int curr=350;
		int prev=250;
		int tot=curr-prev;
		
	if(tot<35) {
		System.out.println("low");}
		
	else if(tot>35 & tot<50) {
			System.out.println("avg");
		}
	else if(tot>50 & tot<101) {
			System.out.println("high");
		}
	
	}

}
