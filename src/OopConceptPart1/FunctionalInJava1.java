package OopConceptPart1;

public class FunctionalInJava1 {

public static void main(String[] args) {
	FunctionalInJava1 fj = new FunctionalInJava1();
	fj.test();
	int i=fj.pqa();
	System.out.println(i);
	String s=fj.name();
	System.out.println(s);
	int a=fj.divide();
	System.out.println(a);
	int b=fj.subtract(50, 20);
	System.out.println(b);
	
		
}
public void test()	{
	System.out.println("This is my test methods");
}
public int pqa() {
	System.out.println("pqa another mrothods");
	int a=10;
	int b=20;
	int c=a+b;
	return c;
	
}
public String name() {
	String a="Araf03";
	return a;
}
public int divide() {
	int val1=50;
	int val2=20;
	int val3=val1/val2;
	return val3;
	
}
public int subtract(int val1, int val2) {
	int val3=val1-val2;
	return val3;
	
}

	}


