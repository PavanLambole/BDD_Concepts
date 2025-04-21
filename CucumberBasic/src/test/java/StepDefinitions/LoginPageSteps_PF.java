package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginPageSteps_PF {
	

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF logout;
	

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("User is on login page");
		System.out.println("browser will open");
		String projectPath = System.getProperty("user.dir");
		driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", projectPath + "\\src\\test\\resources\\Edge\\msedgedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_user_name_and_password(String username, String password) throws InterruptedException {
		System.out.println("UserName and Password");
		login = new LoginPage_PF(driver);
		Thread.sleep(2000);
		login.enterUserName(username);
		login.password(password);
	}

	@And("user clicked on login button")
	public void user_clicked_on_login_button() throws InterruptedException {
		System.out.println("Clicked on login page");
		login = new LoginPage_PF(driver);
		login.clickOnSubmit();
		Thread.sleep(10000);
	}

	@Then("user navigate on home screen")
	public void user_navigate_on_home_screen() throws InterruptedException {
		System.out.println("Landing on home screen");
		logout =new HomePage_PF(driver);
		Thread.sleep(2000);
		logout.navigationLogout();
		Thread.sleep(2000);
		logout.clickOnLogout();
	}

	@And("close the browser")
	public void close_the_browser() {
		System.out.println("Closing the Browser");
		driver.close();
	}
	



}
