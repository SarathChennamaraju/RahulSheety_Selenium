package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[value='BLR']")).click();
			Thread.sleep(1000);
		//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();       //syntax important.Below line is alternative xpath without index.
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click(); 
		
	}

}
