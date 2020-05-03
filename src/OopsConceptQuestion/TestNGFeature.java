package OopsConceptQuestion;

import org.testng.annotations.Test;

public class TestNGFeature {
	
@Test
public void loginTest() {
	System.out.println("Login test");
	//int num = 9/0;	
}
@Test(dependsOnMethods="loginTest")
public void homepageTest() {
	System.out.println("Homepage test");
}
@Test(dependsOnMethods="loginTest")
public void searchpageTest() {
	System.out.println("Search page test");
}
@Test(dependsOnMethods="loginTest")
public void regpageTest() {
	System.out.println("Reg page test");
}

}
