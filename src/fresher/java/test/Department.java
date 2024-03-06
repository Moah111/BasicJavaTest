package fresher.java.test;

import java.util.Random;
import java.util.Scanner;


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
	
	public static Department createDeID(){
		
		Scanner sc = new Scanner(System.in);
		String deID = null;
		for (int i = 0; i < 5; i++) {
			String left = "DE";
			Random rd = new Random();
			int right = rd.ints(10000,99999).findFirst().getAsInt();
			deID = left+right;
		}
		System.out.println(deID);
		return null;
		
	}
	public static void main(String[] args) {
		createDeID();
		
	}
	
	
	
				
}

