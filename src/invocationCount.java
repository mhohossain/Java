import org.testng.annotations.Test;

public class invocationCount {
	
	
	@Test(invocationCount=5)
	public void sum() {
		int a =10;
		int b= 20;
		int c=30;
		int d=a+b+c;
		System.out.println("Sum value is :: "+d);
		
	}

}
