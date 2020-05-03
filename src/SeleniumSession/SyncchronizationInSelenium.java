package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.selenesedriver.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncchronizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//imlicitlywait--it always applied globally...is avaiable for the Webelements
		//dynamic and nature
		//it can be change any where and any time in your code
		driver.get("http://www.facebook.com");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement mobilenum  = driver.findElement(By.name("reg_email__"));
		WebElement reg_passwd__ = driver.findElement(By.name("reg_passwd__"));
		WebElement websubmit = driver.findElement(By.name("websubmit"));
		
		sendkeys(driver, firstname, 20, "Araf");
		sendkeys(driver, lastname, 10, "Hossain");
		//sendkeys(driver, reg_email__, 10, "arafhossain@gmail.com");
		sendkeys(driver, mobilenum, 5, "2672551225");
		sendkeys(driver, reg_passwd__, 10, "Hossain123");
		
		WebElement forgotAccount = driver.findElement(By.linkText("Forgot account?"));
		clickOn(driver, forgotAccount, 5);
		
		
		//Explicit wait
		//1. no explicit keyword or method
		//2. avaiable with WebDriverWait and with some ExpectedConditions
		//3. specific to element
		//4. dynamic and nature
		//5. we should never use implicit and explicit together
		//why? Cause selenum webdriver element wait for first and implicit wait and explicit wait will be applied
		//--hence, total syncchronization wait will be increased for each element
	}	
	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);				
	}
	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		driver.quit();
		
	}
}
