package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement navigation;
	
	
	@FindBy(xpath = "//*[text()= \"Logout\"]")
	WebElement logout;
	
	
	public HomePage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigationLogout()
	{
		navigation.click();
	}

	public void clickOnLogout()
	{
		logout.click();
	}
}
