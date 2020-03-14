package marshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class main {
	public static void main(String[] args) {
	try {
		product p = new product();
		p.setId(1);
		p.setName("mobile");
		p.setPrice(5600);
		p.setAvailability(1000);
		
	JAXBContext jb = JAXBContext.newInstance(product.class);
	Marshaller m = jb.createMarshaller();
	m.marshal(p, System.out);
	m.marshal(p, new File("D:\\baby\\mob.xml"));
	
	
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
