package fresher.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeDomain {
	public static void getDomain(){
		
		Map<String,String> dsDomain = new HashMap<>();
		dsDomain.put("FIN", "Financial");
		dsDomain.put("MAR", "Marketing");
		dsDomain.put("Administration", "ADM");
		dsDomain.put("HRM", "Human Resource Management");
		dsDomain.put("CRM", "Client relationship Management");
		dsDomain.put("TCD", "Traning Capability Department");
		dsDomain.put("TOD", "Traning Operation Department");
		
		Set<String> keySet = dsDomain.keySet();
		Iterator<String> iterator = keySet.iterator();
		String key  ;
		while(iterator.next() != null){
			key = iterator.next();
			System.out.println(dsDomain.get(key));
		}
	}
	


	
	
	


	

}
