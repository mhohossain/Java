package OopConceptPart1;

public class StaticAndNonStatic {
	String name ="Tom";//non static global variable
	static int age = 30;//static global variable
	
	public static void main(String[] args) {
		//how to call static methods and variable
		//1.Direct calling or calling by classes
		StaticAndNonStatic.sendmail();
		System.out.println(StaticAndNonStatic.age);
		System.out.println(age);
		StaticAndNonStatic ss = new StaticAndNonStatic();
		System.out.println(ss.name);
		ss.sum();
		sendmail();
		
	}
	public void sum() {//local variable non static method
		System.out.println("sum method");
	}
	public static void sendmail() {//local static variable method
		System.out.println("sendmail method");
	}

}
