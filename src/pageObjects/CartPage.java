package pageObjects;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CommonComponent{


	WebDriver driver;
	
	//.mb-3
		@FindBy(css=".cartSection h3")
		List<WebElement> cartProducts;
		
		@FindBy(css=".subtotal button")
		WebElement checkoutCart;
		
		@FindBy(css = "button[routerlink='/dashboard/cart']")
		WebElement cartButton;
	
		By checkoutBy = By.cssSelector(".subtotal button");
		
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	String [] productNames = {"ZARA COAT 3"};
	
	public WebElement VerifyProductDisplay(String [] productNames) {
		cartButton.click();
		waitforElementToAppear(checkoutBy);
		//cartProducts.stream().filter(cartproduct-> cartproduct.getText().contains(productNames)).findAny().orElse(null);
		WebElement match =  cartProducts.stream()
	            .filter(cartProduct -> Arrays.stream(productNames).allMatch(product -> cartProduct.getText().contains(product)))
	            .findAny()
	            .orElse(null);

		return match;
			}
	
	public void goToCheckout() {
		cartButton.click();
		waitforElementToAppear(checkoutBy);
		checkoutCart.click();
	}
 //     cartButton;
}
