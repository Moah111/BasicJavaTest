package fresher.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DeDomain {
	public static Map<String,String> dsDomain = new HashMap<>();
	public static DeDomain getDomain(){
		
		dsDomain.put("FIN", "Financial");
		dsDomain.put("MAR", "Marketing");
		dsDomain.put("ADM", "Administration");
		dsDomain.put("HRM", "Human Resource Management");
		dsDomain.put("CRM", "Client relationship Management");
		dsDomain.put("TCD", "Traning Capability Department");
		dsDomain.put("TOD", "Traning Operation Department");
		

		Set<String> keySet = dsDomain.keySet();
		Iterator<String> iterator = keySet.iterator();
		String key  ;
		while(iterator.hasNext()){
			Scanner sc = new Scanner(System.in);
			key = sc.nextLine();
			key = iterator.next();
			System.out.println(dsDomain.get(key));
		}
		System.out.println(DeDomain.dsDomain.get("FIN"));
		return getDomain();	
	}
//	public static void main(String[] args) {
//		System.out.println(dsDomain);
//		getDomain();
//	}

}
