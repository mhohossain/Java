package ArrayListDemo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements1 {

	public static void main(String[] args) {
		
		String s [] = {"Java", "Selenium", "Ruby", "Java"};
		
		Set<String> store = new HashSet<String>();
		
		for(String name: s) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}
	}

}
