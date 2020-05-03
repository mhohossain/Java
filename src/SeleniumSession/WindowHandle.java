package SeleniumSession;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.amazon.com");
			
		String handle = driver.getWindowHandle();
		System.out.println("Window handle is "+handle);
		//Set<String> handles = driver.getWindowHandles();
		//System.out.println("Window handle is "+handles);
		
		driver.quit();
	}

	
}
