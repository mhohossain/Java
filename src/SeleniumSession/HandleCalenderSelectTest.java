package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalenderSelectTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://crmpro.com/index.html");
		 driver.findElement(By.name("username")).sendKeys("Araf16");
		 driver.findElement(By.name("password")).sendKeys("tester123");
		 WebElement loginbutn = driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();" ,loginbutn);
		 
        driver.switchTo().frame("mainpanel");
        
        String date = "30-September-2018";
        String dateArray []=date.split("-");
        String day = dateArray[0];
        String month = dateArray[1];
        String year = dateArray[2];
        
        Select select = new Select(driver.findElement(By.name("slctMonth")));
        select.selectByVisibleText(month);
        
        Select select1 = new Select(driver.findElement(By.name("slctYear")));
        select1.selectByVisibleText(year);
      //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
      //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
      //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
      //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]
        
        String beforeXpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
        String afterXpath = "]/td[";
        
        final int totalWeekDays = 7;
        boolean flag = false;
        for(int rowNum=2; rowNum<=7; rowNum++) {
        	for(int colNum=1; colNum<=totalWeekDays; colNum++) {
        		
        		String dayvalues = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
        		System.out.println(dayvalues);
        		if(dayvalues.equals(day)) {       		
        		driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
        		flag =true;
        		break;
        		}
        		
        	}
        	
        	if(flag){
        		break;
        	}
        }  
	}

}
