package OopsConceptQuestion;

import java.util.HashSet;
import java.util.Set;

public class DupElements {

	public static void main(String[] args) {
		String names []= {"Java","C","Phython","C","Ruby"};
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)==false){
				System.out.println("Duplicates Element is "+name);
				
			}
		}

	}

}
