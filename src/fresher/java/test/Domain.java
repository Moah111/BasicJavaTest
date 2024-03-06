package fresher.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Domain {
	private String key;
	private String field;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	
	

	public String toString() {
		return key +" : "+ field ;	
	}
	
	public Domain(){
		
	}
	public Domain(String key, String field){
		this.key = key;
		this.field = field;
	}
	public static List<Domain> createDomain(){
		List<Domain> dsDomain = new ArrayList<>();
		
		Domain domain1 = new Domain("FIN","Financial");
		Domain domain2 = new Domain("MAR","Marketing");
		Domain domain3 = new Domain("ADM","Administration");
		Domain domain4 = new Domain("HRM","Human resoure management");
		Domain domain5 = new Domain("CRM","Client ralationship management");
		Domain domain6 = new Domain("TCD","Traing capability department");
		Domain domain7 = new Domain("TOD","Traning operation department");
		dsDomain.add(domain1);
		dsDomain.add(domain2);
		dsDomain.add(domain3);
		dsDomain.add(domain4);
		dsDomain.add(domain5);
		dsDomain.add(domain6);
		dsDomain.add(domain7);
		
		String x = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Key : ");
		String input;
		input = sc.nextLine();
		for (int i = 0; i < dsDomain.size(); i++) {
			if(input.equals(dsDomain.get(i).key)){
				x = dsDomain.get(i).field;
			}
		}
		System.out.println(x);
		
		return createDomain();
		
	}
	public static void main(String[] args) {
		createDomain();
		
	}

}
