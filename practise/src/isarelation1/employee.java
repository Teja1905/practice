package isarelation1;

public class employee extends person {
	private int salary;
	private String designation;
	private String office;
	private int experince;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}

}
