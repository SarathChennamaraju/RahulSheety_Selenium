package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[value='BLR']")).click();
			Thread.sleep(1000);
		//	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();       //syntax important.Below line is alternative xpath without index.
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click(); 
		 //   driver.findElement(By.className("ui-datepicker-trigger")).click();
		 //   Thread.sleep(1000);
		    driver.findElement(By.className("ui-state-highlight")).click();
		    
		    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000);
			for(int i=0;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
		    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	        
}
