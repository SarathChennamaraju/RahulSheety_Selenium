package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// wait for 5 secs
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
	        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("hello123");
			driver.findElement(By.className("submit")).click();
	    System.out.println(driver.findElement(By.className("error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("rahul");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@gmail.com");
			driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9756453270");	
			driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		    driver.findElement(By.className("go-to-login-btn")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.id("chkboxTwo")).click();
			driver.findElement(By.className("submit")).click();
			Thread.sleep(5000);
	     	driver.findElement(By.className("logout-btn")).click(); 
	}
	

}
