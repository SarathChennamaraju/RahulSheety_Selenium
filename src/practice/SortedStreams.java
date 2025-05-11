package practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SortedStreams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.className("sort-descending")).click();

		Thread.sleep(1000);

		List<WebElement> a = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> original = a.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> Sorted = a.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());

		Assert.assertTrue(original.equals(Sorted));
		
		List<String> price = a.stream().filter(s -> s.getText().contains("Rice")).map(s ->s.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList()); ;
		
		do {
		List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));

	    price = row.stream().filter(s -> s.getText().contains("Wheat")).map(s ->s.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList());
		
		price.forEach(b -> System.out.print(b));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}
}
//	public static String getprice(WebElement s) {
//		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	//	return pricevalue;
	
//}
