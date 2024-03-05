package fresher.java.test;


public class Department {
	private String name;
	private String deID;
	private String domain;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDeID() {
		return deID;
	}
	public void setDeID(String deID) {
		this.deID = deID;
	}

	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Department(){
		
	}
	
	public Department(String name, String deID, String domain){
		this.name = name;
		this.deID = deID;
		this.domain = domain;
	}
	
	
	
				
}

