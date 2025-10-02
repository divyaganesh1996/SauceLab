package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") WebElement addToCartbackpackButton;
	@FindBy(xpath = "//span[@data-test=\"shopping-cart-badge\"]") WebElement cartCount;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") WebElement cartIcon;
	public HomePage()//constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public String addProductsToCart() { 
	 * addToCartbackpackButton.click(); 
	 * return cartCount.getText(); }
	 */
	
	public String addProductsToCart()
	{
		addToCartbackpackButton.click();
		cartIcon.click();
		return driver.getCurrentUrl();
		}

}
