package OopConceptPart1;

import java.util.ArrayList;

public class Arrays_List {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("100");
		al.add("200");
		al.add("300");
		System.out.println(al.size());
		System.out.println(al.get(0));
		al.add("12.33");
		al.add("Araf");
		al.add('A');
		al.add("true");
		al.add(500);
		System.out.println(al.size());
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
			
			//only Integer value 
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		//only String value
		ArrayList<String>al2 = new ArrayList<String>();
		al2.add("Selenium");
		al2.add("Tom");
		al2.add("Tester");
		System.out.println(al2.size());
		System.out.println(al2.get(1));
		for (int j = 0; j <al2.size(); j++) {
			System.out.println(al2.get(j));
			
		}
			
}			
			
 }

	}


