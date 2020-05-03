package OopConceptPart1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(1, "January");
		tm.put(2, "Feb");
		tm.put(5, "Mar");
		tm.put(7, "April");
		tm.put(3, "June");
		 Set keys = tm.keySet();
		 Iterator IT = keys.iterator();
		 while (IT.hasNext()) {
			System.out.println(tm.get(IT.next()));
			
		}
	}

}
