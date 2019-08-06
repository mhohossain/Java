package OopConceptPart1;

public class StaticVSnonStatic {
	String name="Hossain";//non static globle var
	static int  age=30;//static globel var

	public static void main(String[] args) {
		StaticVSnonStatic.sendmail();
		System.out.println(StaticVSnonStatic.age);
		StaticVSnonStatic ss = new StaticVSnonStatic();
		ss.test();
		System.out.println(ss.name);
		System.out.println(ss.age);
		
		
		

	}
	public void test() {//non static local var with main methods
		System.out.println("Test my methods");
		
	}
	public static void sendmail() {//static local var with main methods
		System.out.println("Sendmail methods");
		
	}

}
