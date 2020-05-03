package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("Selenium Tester");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("Hossain");
		driver.findElement(By.xpath("//input[@id='u_0_k']")).sendKeys("2156045968");
			
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sel1.selectByVisibleText("Oct");
		Thread.sleep(3000);
		
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel2.selectByIndex(13);
		Thread.sleep(3000);
		
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByValue("1979");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
		driver.navigate().back();
		
		
		driver.quit();
		
	}

}
