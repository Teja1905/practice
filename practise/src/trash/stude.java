package trash;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="Student")
public class stude {
	private int id;
	private int marks;
	private int rank;
	private String name;
	private String school;
	
	public int getId() {
		return id;
	}
	@XmlElement(name="ID")
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	@XmlElement(name="Marks")
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRank() {
		return rank;
	}
	@XmlElement(name="Rank")
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	@XmlElement(name="Student Name")
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	@XmlElement(name="Student School")
	public void setSchool(String school) {
		this.school = school;
	}
	

}
