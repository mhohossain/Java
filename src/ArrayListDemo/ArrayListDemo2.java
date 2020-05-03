package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList obj1 = new ArrayList();
		 
		obj1.add(123456);
		obj1.add("Selenium WebDriver");
		obj1.add("M");
		obj1.add("12:50");
		obj1.add("true");
		obj1.add("Selenium WebDriver");
		
		Iterator itr = obj1.iterator();
		
		while(itr.hasNext()) {
		Object values=itr.next();
		System.out.println(values);

	}

}
}