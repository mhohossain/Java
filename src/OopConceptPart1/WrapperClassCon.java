package OopConceptPart1;

public class WrapperClassCon {

	public static void main(String[] args) {
		String s="100";
		System.out.println(s+20);
		
		int m = Integer.parseInt(s);
		System.out.println(m);
		System.out.println(m+20);
		
		String q="12.33";
		System.out.println(q+20);
		double d=Double.parseDouble(q);
		System.out.println(d+20);
		
		String t ="true";
		System.out.println(t);
		
		boolean b = Boolean.parseBoolean(t);
		System.out.println(b);
		
		int i = 10;
		System.out.println(i);
		
		String p =String.valueOf(i);
		System.out.println(p);
		
		boolean o = true;
		System.out.println(o);
		String r =String.valueOf(o);
		System.out.println(r);
				

	}

}
