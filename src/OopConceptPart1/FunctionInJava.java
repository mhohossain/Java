package OopConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {
		FunctionInJava fj = new FunctionInJava();
		fj.test();
		int l = fj.pqr();
		System.out.println(l);
		String s1 = fj.qa();
		System.out.println(s1);
		int d = fj.division(30, 20);
		System.out.println(d);
		System.out.println(fj.mul());
		//main method is void --never returns a value
		
	}
	//none static methods
	//void--is does not return any values
	
	public void test() {//no input no output
		System.out.println("Test my methods");
	}
	//return type = int
	public int pqr() {//no input but some output
		System.out.println("pqr my methods");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	//return type = String
	public String qa() {//no input but some output
		System.out.println("qa my methods");
		String s="Selenium";
		return s;
	}
	//return type = int
	public int  division(int x,int y) {
		System.out.println("division method");
		int d = x/y;
		return d;	
		
	}
	public int mul() {
		int val1=10;
		int val2=20;
		int val3=val1*val2;
		return val3;
		
	}

}
