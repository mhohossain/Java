package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();//launch the browser
		 
		 driver.manage().window().maximize();//maximize windows
		 driver.manage().deleteAllCookies();//delete all cookies
		 
		 //dynamic wait
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.get("https://crmpro.com/");
		 
		 
     	 
		 driver.findElement(By.name("username")).sendKeys("Araf16");
		 driver.findElement(By.name("password")).sendKeys("tester123");
		 WebElement loginbutn = driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,loginbutn);
		
		//count number of frame
		//int total_frame = driver.findElements(By.tagName("frame")).size();
		//System.out.println("Total frame in application is "+total_frame);
		int total_frame = driver.findElements(By.tagName("frame")).size();
		System.out.println("Total fram in application is "+total_frame);
		 	
		//handle frame
		driver.switchTo().frame("mainpanel");
		//handle windows
		driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
	//	driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Tasks')]"));
		
	}

}
