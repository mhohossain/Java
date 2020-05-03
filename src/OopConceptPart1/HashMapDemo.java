package OopConceptPart1;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("400", "Hossain");
		hm.put("500", "Selenium");
		hm.put("600", "Araf");
		hm.put("700", "Ara");
		
		System.out.println(hm.size());
		System.out.println(hm);		
		//get value 
        String value = hm.get("600");
        System.out.println("Value from map is "+value);
        //null value
        String value1 = hm.get("900");
        System.out.println("Value is from map is "+value1);
        
		

	}

}
