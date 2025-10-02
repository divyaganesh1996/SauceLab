package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.HomePage;
import Page.LoginPage;

public class HomePageTest extends BaseClass{
	
 LoginPage login;
 HomePage home;
	
 @BeforeMethod
 public void setup() throws InterruptedException
 {
	 openURL();
	 login = new LoginPage();
	 home = new HomePage();
	 login.verifyLogin();
 }
 
 @Test
	/*
	 * public void addproductsToCartTest() 
	 * { 
	 * String actualCountString =home.addProductsToCart();
	 *  String expectedCountString = "1";
	 * Assert.assertEquals(actualCountString, expectedCountString);
	 * 
	 * }
	 */
 public void addproductsToCartTest() {
	 
	 String actualURL =home.addProductsToCart();
	 String expectedURL = "https://www.saucedemo.com/cart.html";
	 Assert.assertEquals(actualURL, expectedURL);
 }
 
 
 @AfterMethod
 public void closeBrowser()
 {
	 driver.close();
	 
 }

}
