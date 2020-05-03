package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();//get title
		System.out.println(title);
		
		
		if(title.equals("Google")) {//validation point
			System.out.println("correct title");
		}
		else {
			System.out.println("In-correct title");
			
		}
		System.out.println(driver.getCurrentUrl());
		
	//	System.out.println(driver.getPageSource());
		driver.quit();
}
}