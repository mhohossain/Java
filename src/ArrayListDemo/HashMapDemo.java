package ArrayListDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Hossain", "2672551225");
		hm.put("Ara", "2156045555");
		hm.put("Araf", "2679913317");
		System.out.println(hm);
		String value = hm.get("Hossain");
		System.out.println("Value is "+value);
		
		
	}
}
