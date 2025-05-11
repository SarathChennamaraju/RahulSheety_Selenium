package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			Thread.sleep(3000);
		    List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		    
		//    for(WebElement option: options) {
		//    	if(option.getText().equalsIgnoreCase("India")) {
		//    		option.click();
		//    	}
		//    }
WebElement opt  = options.stream().filter(option->option.getText().equalsIgnoreCase("India")).findFirst().orElse(null);
opt.click();
		    
	//		Thread.sleep(1000);

	}

}
