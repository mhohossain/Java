import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageDisplay {
	WebDriver driver;
	@Test
	public void verifyImages() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		boolean imagesdisplay = driver.findElement(By.xpath("//a[contains(text(),'Images')]")).isDisplayed();
		Assert.assertTrue(imagesdisplay);
        
	/*	if(imagesdisplay) {
			System.out.println("Home page is displayed PASS");
		}else {
			System.out.println("Home page is displayed Fail");
		}*/		
	}
}
