package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		    ArrayList obj1 = new ArrayList(); 		
			obj1.add(123456);
			obj1.add("Selenium WebDriver");
			obj1.add("M");
			obj1.add("12:50");
			obj1.add("true");
			obj1.add("Selenium WebDriver");
			obj1.add("Hossain");
			
			for(int i=0; i<obj1.size(); i++) {
				System.out.println(obj1.get(i));
			}
	}

	}