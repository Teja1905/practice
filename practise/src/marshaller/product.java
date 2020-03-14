package marshaller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
public class product {
	
	private int id;
	private String name;
	private int price;
	private int availability;
	
	public int getId() {
		return id;
	}
	@XmlElement(name="id")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@XmlElement(name="price")
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailability() {
		return availability;
	}
	@XmlElement(name="avail")
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	

}
