package OopConceptPart1;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("Hossain");
		ts.add("Selenium");
		ts.add("Tester");
		
		Iterator IT = ts.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		
		
	}

}
