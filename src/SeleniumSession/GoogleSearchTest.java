package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		 List<WebElement> list = driver.findElements(By.xpath("//body[@class='hp vasq big']"));		
		 System.out.println("Total number of suggestions in search box :: "+ list.size());
	}

}
