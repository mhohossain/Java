package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(0);
		 
		 Actions action = new Actions(driver);
         action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
         .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
         .release()
         .build()
         .perform();
         driver.quit();
         
        
	}

}
