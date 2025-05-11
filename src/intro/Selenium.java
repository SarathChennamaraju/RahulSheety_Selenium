package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

}
