package hasarelation;

public class main {
	public static void main(String[] args) {
		
	
    person p = new person();
    
    p.setId(9);
	p.setName("ganesh");
	p.setPhn(8656);
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getPhn());
	
	Student s = new Student();
	s.setMarks(999);
	s.setSchool("alpha");
	System.out.println(s.getMarks());
	System.out.println(s.getSchool());

}}
