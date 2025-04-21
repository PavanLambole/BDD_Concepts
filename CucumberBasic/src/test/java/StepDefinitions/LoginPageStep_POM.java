//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage_POM;
//
//public class LoginPageStep_POM {
//
//	WebDriver driver = null;
//	LoginPage_POM login;
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("User is on login page");
//		System.out.println("browser will open");
//		String projectPath = System.getProperty("user.dir");
//		driver = new EdgeDriver();
//
//		System.setProperty("webdriver.edge.driver", projectPath + "\\src\\test\\resources\\Edge\\msedgedriver.exe");
//		driver.manage().window().maximize();
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_user_name_and_password(String username, String password) throws InterruptedException {
//		System.out.println("UserName and Password");
//		login = new LoginPage_POM(driver);
//		Thread.sleep(2000);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@And("user clicked on login button")
//	public void user_clicked_on_login_button() {
//		System.out.println("Clicked on login page");
//		login = new LoginPage_POM(driver);
//		login.loginButton();
//	}
//
//	@Then("user navigate on home screen")
//	public void user_navigate_on_home_screen() {
//		System.out.println("Landing on home screen");
//	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//		System.out.println("Closing the Browser");
//		driver.close();
//	}
//
//}
