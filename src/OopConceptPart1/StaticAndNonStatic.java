package OopConceptPart1;

public class StaticAndNonStatic {
	String name ="Tom";//non static global variable
	static int age = 30;//static global variable
	
	public static void main(String[] args) {
		//how to call static methods and variable
		//ANS.Direct calling or calling by classes
		StaticAndNonStatic.sendmail();
		StaticAndNonStatic.login();
		System.out.println(StaticAndNonStatic.age);
		System.out.println(age);
		StaticAndNonStatic ss = new StaticAndNonStatic();
		System.out.println(ss.name);
		ss.sum();
		sendmail();
		login();
		ss.homepage();
		
		
	}
	public void sum() {//local variable non static method
		System.out.println("sum method");
	}
	public static void sendmail() {//local static variable method
		System.out.println("sendmail method");
	}
	public static void login() {
		System.out.println("Login Methods");
	}
    public void homepage() {
    	System.out.println("Home Page");
    }
}
