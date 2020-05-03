package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTitle {
	
   WebDriver driver;
   
   @BeforeMethod
   public void beforeMethod() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
   }
   
   @Test
   
   public void HomePageTitleTest() {
	   String title = driver.getTitle();
	   System.out.println("Home page title is "+title);
   }
   @AfterMethod
	  public void closeApplication() {
	   driver.quit();
	   
   }
   

}
