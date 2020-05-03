package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrmTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://crmpro.com/index.html");
		 driver.findElement(By.name("username")).sendKeys("Araf16");
		 driver.findElement(By.name("password")).sendKeys("tester123");
		 WebElement loginbutn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,loginbutn);
		
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Tasks')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Task')]")).click();
		driver.findElement(By.name("title")).sendKeys("Google");
		driver.findElement(By.name("prospect_lookup")).sendKeys("towel");
		driver.findElement(By.name("completion")).sendKeys("2");
		driver.findElement(By.name("contact_lookup")).sendKeys("Ara");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		driver.quit();
		   

	}

}
