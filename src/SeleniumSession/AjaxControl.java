package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AjaxControl {
	
	WebDriver driver;
	
	@Test
	public void testMethod() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath("//div[@jsmodel='vWNDde']")).getText();
		System.out.println(str);
		//split line by line and return to String Array
		String [] s = str.split("\n");
		System.out.println(s.length);
		for(int i=0; i<s.length; i++) {
			if(s[i].equalsIgnoreCase("selenium foods")){
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(s[i]);
				//Thread.sleep(3000);
				//driver.findElement(By.xpath("//button[@class='Tg7LZd']")).click();
				//driver.findElement(By.xpath("//input[@id='yui_3_10_0_1_1575864802832_101']")).click();
			}
		}
		
		
	}
	
	
	
	

}
