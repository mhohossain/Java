package OopsConceptQuestion;

public class OverloadingMainMethods {
//main methods overloading is possible	
	public static void main(String[] args) {
		System.out.println("main methods 1");
		main("Selenium");
		main(40);
		main(20, 10);
		main("Araf", "Hossain");
		
	}
	
	public static void main(String args) {
		System.out.println("main methods 2");

	}
	
	public static void main(int a) {
		System.out.println("main methods 3");

	}
	public static void main(int a, int b) {
		System.out.println("main methods 4");

	}
	public static void main(String args1, String args2) {
		System.out.println("main methods 5");

	}

}
