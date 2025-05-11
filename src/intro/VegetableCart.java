package intro;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VegetableCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String[] item = { "Brocolli", "Cucumber", "Beetroot", "Carrot" };

	//	addtoCart(driver, item);

//	}

	//public static void addtoCart(WebDriver driver, String[] item) {

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] names = products.get(i).getText().split("-");
			String formattedname = names[0].trim();

			List itemsNeeded = Arrays.asList(item);

			if (itemsNeeded.contains(formattedname)) {

				j++;
				driver.findElements(By.className("product-action")).get(i).click();

				if (j == item.length) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder = 'Enter promo code']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		WebElement a = driver.findElement(By.cssSelector("select[style='width: 200px;']"));
		Select dropdown = new Select(a);
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}
}
