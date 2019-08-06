package OopConceptPart1;

public class WraperClass {

	public static void main(String[] args) {
		String s = "100";
		
		//String to integer conversion
		
	int i = Integer.parseInt(s);
	System.out.println(i+20);
	
	//String to boolean conversion
	String m = "true"; 
	boolean b = Boolean.parseBoolean(s);
	System.out.println(m);
	
	//String to double conversion
	String y = "12.30";
	double d = Double.parseDouble(y);
	System.out.println(y+20);
	
	//integer to String conversion
	int n = 12;
	String k = String.valueOf(n);
	System.out.println(n);
	
	//integer to double conversion
	int o = 20;
	double q = Double.valueOf(o);
	System.out.println(o);
	
	//integer to boolean conversion
	int t = 30;
	Boolean.valueOf(true);
	System.out.println(t);
	}

}
