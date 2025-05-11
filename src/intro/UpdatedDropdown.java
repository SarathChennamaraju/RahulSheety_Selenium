package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000);
			for(int i=0;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			driver.findElement(By.id("btnclosepaxoption")).click();

	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"6 Adult");
	}
}