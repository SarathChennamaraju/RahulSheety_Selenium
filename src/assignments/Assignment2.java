package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Sharath Chandra");
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='email']")).sendKeys("sarath@gmail.com");
		driver.findElement(By.cssSelector("div[class='form-group'] input[type='password']")).sendKeys("Sarath@123");
		driver.findElement(By.className("form-check")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select a = new Select(dropdown);
		a.selectByVisibleText("Male");
	    driver.findElement(By.id("inlineRadio2")).click();
	  // driver.findElement(By.name("bday")).sendKeys("02/02/2001");
	//    WebDriverWait wait = new WebDriverWait(driver, 10);
	  //  WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("bday")));
	//    element.sendKeys("02/02/2001");
	   driver.findElement(By.cssSelector(".btn-success")).click();
	   Thread.sleep(1000);
	   System.out.print(driver.findElement(By.className("alert")).getText());
	    
	}
}
