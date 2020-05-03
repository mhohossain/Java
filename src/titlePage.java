import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class titlePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchApplication() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		//System.out.println("Google title is "+title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
		
	}
	@AfterMethod
	public void closeApplication() {
		driver.close();
	}
	}


