package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/client");
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		landingpage.loginApplication("anshika@gmail.com", "Iamking@000");
//		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
//		driver.findElement(By.id("login")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
//	List<WebElement> products = driver.findElements(By.className(".mb-3"));	
		
		ProductCatalogue productcatalogue = new ProductCatalogue(driver);
		List<String> products = productcatalogue.getProductList();
		System.out.print(products);
		 productcatalogue.addProductToCart("ZARA COAT 3");
		 
		 CartPage cartpage = new CartPage(driver);
		 String [] productNames = {"ZARA COAT 3"};
		 cartpage.VerifyProductDisplay(productNames);
		 cartpage.goToCheckout();
		 
//		 CheckOutPage checkoutpage = new CheckOutPage(driver);
		 
		
	}

}
