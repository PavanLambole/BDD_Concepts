package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_PF {
	
	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement txt_username ;
	

	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement btn_sumbmit;

	
	public LoginPage_PF (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
//		AjaxElementLocatorFactory factory =new AjaxElementLocatorFactory (driver ,30);
//		PageFactory.initElements(factory, this); Or we can define in single sentence
//		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		
		}
	
	public void enterUserName(String UserName)
	{
		txt_username.sendKeys(UserName);
	}
	
	public void password(String Password)
	{
		txt_password.sendKeys(Password);
	}
	
	public void clickOnSubmit()
	{
		btn_sumbmit.click();	
	}
	
}
