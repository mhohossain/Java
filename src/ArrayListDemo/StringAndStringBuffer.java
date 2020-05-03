package ArrayListDemo;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		
		
		String s = new String("Hossain");
		s.concat("Selenium");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hossain");
		sb.append("Selenium");
		System.out.println(sb);
	}

}
