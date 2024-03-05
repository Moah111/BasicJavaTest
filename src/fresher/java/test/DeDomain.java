package fresher.java.test;

import java.util.HashMap;
import java.util.Map;

public class DeDomain {
	public static void getDomain(){
		String search;
		Map<String,String> dsDomain = new HashMap<>();
		dsDomain.put("FIN", "Financial");
		dsDomain.put("MAR", "Marketing");
		dsDomain.put("Administration", "ADM");
		dsDomain.put("HRM", "Human Resource Management");
		dsDomain.put("CRM", "Client relationship Management");
		dsDomain.put("TCD", "Traning Capability Department");
		dsDomain.put("TOD", "Traning Operation Department");
		
		for (int i = 0; i < dsDomain.size(); i++) {
			String search = dsDomain.get(i);
			
		}
	}
	


	
	
	


	

}
