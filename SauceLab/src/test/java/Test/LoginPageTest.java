package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginPage;

public class LoginPageTest extends BaseClass
{
	LoginPage login;
	
 @BeforeMethod
 public void setup() throws InterruptedException
 {
	 openURL();
	 login = new LoginPage();
 }
 
 @Test
 public void verifyLoginTest() throws InterruptedException
 {
	 String actualURlString = login.verifyLogin();
	 String expectedURL="https://www.saucedemo.com/inventory.html";
	Assert.assertEquals(actualURlString, expectedURL);
 }
 
 @AfterMethod
 public void closeBrowser()
 {
	 driver.close();
	 
 }
}
