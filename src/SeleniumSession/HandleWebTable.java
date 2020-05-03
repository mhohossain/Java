package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
        //*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		 int rowCount = rows.size();
		 System.out.println("Total rows in web table :: "+rowCount);
		 String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		 String afterXpath = "]/td[1]";
		 for(int i=2; i<=rowCount; i++) {
			 String actualXpath = beforeXpath+i+afterXpath;
			 WebElement element = driver.findElement(By.xpath(actualXpath));
			 System.out.println(element.getText());
			// if(element.getText().equals("Island Trading")) {
			//	 System.out.println("Company name : "+element.getText() + "is found" + " + at posstion : "+(i-1));
			//	 break;		
		// }
			 
	    }
		//*[@id="customers"]/tbody/tr[2]/td[2]
		 
		 System.out.println("****************");
		 String afterXpathContact = "]/td[2]";
		 for(int i=2; i<=rowCount; i++) {
			 String actualXpath = beforeXpath+i+afterXpathContact;
			 WebElement element = driver.findElement(By.xpath(actualXpath));
			 System.out.println(element.getText());
		 	 
		 }
		//*[@id="customers"]/tbody/tr[2]/td[3]
		 System.out.println("***************");
		String afterXpathCountry = "]/td[3]";
		for(int i=2; i<=rowCount; i++) {
			 String actualXpath = beforeXpath+i+afterXpathCountry;
			 WebElement element = driver.findElement(By.xpath(actualXpath));
			 System.out.println(element.getText());	
					
   }
  }
}