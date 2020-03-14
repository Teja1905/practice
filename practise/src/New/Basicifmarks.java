package New;

public class Basicifmarks {
	public static void main(String[] args) {

		int marks = 83;

		if (marks < 35) {
			System.out.println("fail");
		}

		if (marks > 35 & marks < 50) {
			System.out.println("third class");
		}
		if (marks >= 50 & marks < 60) {
			System.out.println("second class");
		}
		if (marks >= 60 & marks < 70) {
			System.out.println("First class");
		}
		if (marks >= 70 & marks < 85) {
			System.out.println("first class with distinction");
		}
		if (marks >= 85 & marks < 100) {
			System.out.println("topper");
		}
		if (marks >= 100) {
			System.out.println("check for review");
		}

	}
}
