package OopsConceptQuestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[]= {"Java","JavaScript","C","Phython","Java","C","Ruby"};
		
		//Using HasSet:Java Collection: its store unique values
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate Elements is :: "+name);
			}
		}
		

	}

}
