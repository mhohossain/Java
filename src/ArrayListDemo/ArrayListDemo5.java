package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Selenium");
		al.add("Tester");
		al.add("araf");
		al.add("ara");
		
		for(Object name: al) {
			System.out.println(name);
		}
				
	}

}
