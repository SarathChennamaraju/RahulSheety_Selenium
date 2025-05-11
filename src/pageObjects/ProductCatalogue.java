package pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue extends CommonComponent {
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//.mb-3
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart= By.cssSelector(".card-body .w-10");
	By toastMessage = By.cssSelector(".toast-message");
	
    @FindBy(css=".toast-message")
    WebElement notification;
    
    
	public List<String> getProductList() {
		waitforElementToAppear(productsBy);
		return  products.stream().map(product->product.findElement(By.cssSelector(".card-body b")).getText()).collect(Collectors.toList());
	}
	 public WebElement getProductByName(String productName) {
	WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector(".card-body b")).getText().equals(productName)).findFirst().orElse(null);
	return prod;
	
		 	 }
	 public void addProductToCart(String productName) {
		 WebElement prod = getProductByName(productName);
		 prod.findElement(addToCart).click();
		 waitforElementToAppear(toastMessage);
		 waitforElementToDisappear(notification);
	 }
}
