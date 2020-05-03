package ArrayListDemo;

public class EqualsAndDoubleEquals {

	public static void main(String[] args) {
		
		String s1 = new String("hossain");
		String s2 = new String("hossain");
		//reference comparison is false
		System.out.println(s1==s2);
		//Content comparison is true
		System.out.println(s1.equals(s2));

	}

}
