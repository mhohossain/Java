import java.util.HashSet;
import java.util.Set;

public class DupElements {

	public static void main(String[] args) {
		String names []= new String [] {"Java","Python","Java","Ruby","Python"};
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate Elements is "+name);
			}
		}
		

	}

}
