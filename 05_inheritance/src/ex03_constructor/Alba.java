package ex03_constructor;

public class Alba extends Student{
	
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Alba(String name, String school, String company) {
		super(name, school);
		this.company = company;
	}
	
	

}
