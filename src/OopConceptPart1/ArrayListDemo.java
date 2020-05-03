package OopConceptPart1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		    ArrayList obj1 = new ArrayList(); 		
			obj1.add(123456);
			obj1.add("Selenium WebDriver");
			obj1.add("M");
			obj1.add("12:50");
			obj1.add("true");
			obj1.add("Selenium WebDriver");
			
			for(Object name: obj1) {
				System.out.println(name);
			}
	}

	}


