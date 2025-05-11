package mouseActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {
	
//program to switch from one window to another.
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
	    String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		Thread.sleep(1000);
	    String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
	    driver.switchTo().window(parentId);
	    driver.findElement(By.id("username")).sendKeys(email);
	   

	}

}
