package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.icicibank.com/");
		driver.findElement(By.xpath("//img[@class='s-img' and @id='yui_3_10_0_1_1575405894415_328']")).click();
		driver.findElement(By.xpath("//span[@class='pl-login-ornage-box']")).click();
		driver.findElement(By.xpath("//div[@id='NLI_Revamp_Banner_ID']")).sendKeys("mhohossain");
		
		
	}
		
		
		
		

	}


