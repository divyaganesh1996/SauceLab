package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass
{
@FindBy(xpath="//input[@id='user-name']") WebElement username;
@FindBy(xpath="//input[@id='password']") WebElement password;
@FindBy(xpath="//input[@id='login-button']") WebElement loginButton;

public LoginPage()//constructor
{
PageFactory.initElements(driver, this);	
}

public String verifyLogin() throws InterruptedException
{
username.sendKeys("standard_user");
password.sendKeys("secret_sauce");
loginButton.click();
Thread.sleep(2000);
return driver.getCurrentUrl();
}

}
