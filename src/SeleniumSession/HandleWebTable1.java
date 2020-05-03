package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable1 {
        
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		 int rowCount = rows.size();
		 System.out.println("Total rows web table in "+rowCount);
		 
		 
		 String BeforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		 String AfterXpath = "]/td[1]";
		 for(int i=2; i<=rowCount; i++) {
			 String actulXpath = BeforeXpath+i+AfterXpath;
			 WebElement element = driver.findElement(By.xpath(actulXpath));
			 System.out.println(element.getText());			 
		 }
		 System.out.println("**************");
		//*[@id="customers"]/tbody/tr[2]/td[2]
		 String AfterXpathContact = "]/td[2]";		 
		 for(int i=2; i<=rowCount; i++) {
			 String actulXpath = BeforeXpath+i+AfterXpathContact;
			 WebElement element = driver.findElement(By.xpath(actulXpath));
			 System.out.println(element.getText());			 
		 }
		 System.out.println("***************");
		//*[@id="customers"]/tbody/tr[2]/td[3]
		 String AfterXpathCountry = "]/td[3]";
		 for(int i=2; i<=rowCount; i++) {
			 String actulXpath = BeforeXpath+i+AfterXpathCountry;
			 WebElement element = driver.findElement(By.xpath(actulXpath));
			 System.out.println(element.getText());		 
		 }
		 //handle webtable and coulmus:
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		 String colBeforeXpath= "//*[@id=\'customers\']/tbody/tr[1]/th[";
		 String colAfterXpath = "]";
		 List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th"));
		 int colCount = cols.size();
		 System.out.println("Total number of coulmns are :: "+colCount);
		 
		 System.out.println("Columns values are: ");
		for(int i=1; i<=colCount; i++) {
			WebElement element = driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
		    String colText = element.getText();
		    System.out.println(colText);
		}
	}

}
