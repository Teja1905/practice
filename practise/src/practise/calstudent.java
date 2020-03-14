package practise;

public class calstudent {
	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "ram";
		s1.marks = 100;
		s1.id = 1;
		s1.school = "ONE";
		student s2 = new student();
		s2.name = "rahim";
		s2.marks = 99;
		s2.id = 2;
		s2.school = "two";
		student s3 = new student();
		s3.name = "robert";
		s3.marks = 98;
		s3.id = 3;
		s3.school = "THREE";
		s3.print();
		System.out.println(student.school);
		

	}
}
