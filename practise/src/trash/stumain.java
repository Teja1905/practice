package trash;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class stumain {
	public static void main(String[] args) {
		stude s =new stude();
		s.setId(7);
		s.setMarks(100);
	    s.setRank(2);
		s.setName("Ronaldo");
        s.setSchool("Juventus");
	 try {
	JAXBContext jc =JAXBContext.newInstance(stude.class);
	Marshaller m =jc.createMarshaller();
	m.marshal(s,System.out);
	m.marshal(s,new File("D:\\read11.xml"));
	System.out.println("created file");
    }catch(Exception e) {
		 e.printStackTrace();
	 }
	    
	}

}
