package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// 1-Count the number of links present in the website
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2-Count number of links in footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3-Count number of links in a column in footer
		WebElement columndriver = footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul")); // imp
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// * 4-click links in first column
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			String click = Keys.chord(Keys.CONTROL, Keys.ENTER); // ctrl+enter will open link in new tab
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(3000);
		}
		Set<String> a = driver.getWindowHandles();
		Iterator<String> it = a.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
