package OopConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x ="100";
		System.out.println(x+20);
		
		//data conversion - String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
//String,Integer,boolean,double this is the wrapper value available;
		
		//String to double conversion 		
		String y ="12.33";
		System.out.println(y+20);
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean conversion
		
		String z = "true";		
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//Int to String conversion
		
		int m =20;
		String s = String.valueOf(m);
		System.out.println(s+20);
		/*NumberFormatException.For input string: "100m"
		Integer.parseInt(Unknown Source)
		String p ="100m";
		int q = Integer.parseInt(p);
		System.out.println(q);*/
		

	}

}
