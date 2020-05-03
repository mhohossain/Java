package OopsConceptQuestion;

import java.text.NumberFormat;

import org.testng.annotations.Test;

public class ExceptionTimeOutTestNG {
	
@Test(expectedExceptions=NumberFormatException.class,invocationCount=6)
public void test1() {
	String s = "100A";
	Integer.parseInt(s);
	
}
@Test(expectedExceptions=NumberFormatException.class,invocationCount=4)
public void test2() {
	String x="0%";
	Integer.parseInt(x);
}
@Test(expectedExceptions=NumberFormatException.class,invocationCount=4)
public void test3() {
	String y="9%";
	Integer.parseInt(y);
	
}

}
