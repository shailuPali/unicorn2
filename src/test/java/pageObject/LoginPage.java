package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//element location
	@FindBy(name="username") WebElement txt_username;
	@FindBy(name="password") WebElement txt_password;
	@FindBy(xpath="//body/div[@id='app']//button[1]") WebElement but_login;
	
	public void setUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		but_login.click();
	}
	
	
	
	
}
