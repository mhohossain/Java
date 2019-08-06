package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class CreateNewContact {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://crmpro.com/index.html");
		 driver.findElement(By.name("username")).sendKeys("Araf16");
		 driver.findElement(By.name("password")).sendKeys("tester123");
		 WebElement loginbutn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,loginbutn);
		
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
				
	// create drop down list
		Select select = new Select(driver.findElement(By.name("title")));
		driver.findElement(By.xpath("//select[@name='title']")).click();
		
		
	
		
		
		
	}

	}


