package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage_POM {
	
	protected WebDriver driver;

	private By txt_username =By.name("username");
	private By txt_password =By.xpath("//*[@type='password']");
	private	By btn_submit =By.xpath("//*[@type='submit']");
	
	
	public LoginPage_POM(WebDriver driver)
	{
		this.driver=driver;
		
		if (!driver.getTitle().equalsIgnoreCase("OrangeHRM"))
		{
			throw new IllegalStateException("This is Not a Currect Title, The Currect Title is "+ driver.getTitle());
		}
	}
	
	public void enterUsername(String UserName)
	{
		driver.findElement(txt_username).sendKeys(UserName);  //fetching the data from where we declaire
	}

	public void enterPassword(String Password)
	{
		driver.findElement(txt_password).sendKeys(Password);
	}
	
	public void loginButton()
	{
		driver.findElement(btn_submit).click();
	}
	
	
//	public void loginValidUser(String UserName, String Password)
//	{
//		driver.findElement(login_button).sendKeys(UserName);
//		driver.findElement(user_name).sendKeys(Password);
//		driver.findElement(login_button).click();
//
//	}
	
}
