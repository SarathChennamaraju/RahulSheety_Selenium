package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LocatorsAssertion {

	public static void main(String[] args) throws InterruptedException {
		String name = "suprith";
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String password = GetPassword(driver);
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
		    driver.findElement(By.id("inputUsername")).sendKeys(name);
			driver.findElement(By.name("inputPassword")).sendKeys(password);
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.id("chkboxTwo")).click();
			driver.findElement(By.className("submit")).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
	}
	public static String GetPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String a = driver.findElement(By.className("infoMsg")).getText();
		String b = a.split("'")[1];
		String c = b.split("'")[0];
		return b;
	}
}
