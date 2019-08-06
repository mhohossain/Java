package OopConceptPart1;

import java.util.ArrayList;

import org.jboss.netty.util.internal.SystemPropertyUtil;

public class Arrays1_List {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Tom");
		al.add("Hello");
		al.add("Selenium");
		al.add("Tester");
		System.out.println(al.size());
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
			
			//only integer value
			
			ArrayList<Integer>al1 = new ArrayList<Integer>();
			al1.add(100);
			
			//String value
	       ArrayList<String>al2 = new ArrayList<String>();
	       al2.add("Hossain");
	       al2.add("12.40");
	       al2.add("True");
	       al2.add("A");
	       System.out.println(al2.size());
	       System.out.println(al2.get(1));
	       for (int j = 0; j <al2.size(); j++) {
	    	   System.out.println(al2.get(j));
                  }
			
				
			}
			
		}
	}


