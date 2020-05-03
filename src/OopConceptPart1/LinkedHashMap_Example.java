package OopConceptPart1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_Example {

	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "Jan");
		lhm.put(7, "Feb");
		lhm.put(8, "June");
		lhm.put(5, "Mar");
		lhm.put(4, "April");
		
        Set keys = lhm.keySet();
        Iterator IT = keys.iterator();
        while (IT.hasNext()) {
			System.out.println(lhm.get (IT.next()));
			
		}
	}

}
