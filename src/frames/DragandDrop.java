package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		//First step we need to switch to frames and provide the frame element as input
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		//come out of frames 
		driver.switchTo().defaultContent();
		
		
	}

}
