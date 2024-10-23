package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver=null;


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page"); 


		System.out.println("browser will open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();



	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_user_name_and_password(String UserName, String Password) throws InterruptedException {
		System.out.println("UserName and Password");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(UserName);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);	
	}

	@And("user clicked on login button")
	public void user_clicked_on_login_button() {
		System.out.println("Clicked on login page");

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}

	@Then("user navigate on home screen")
	public void user_navigate_on_home_screen() {
	System.out.println("Landing on home screen");

	}
	
	@And("close the browser")
	public void close_the_browser () {
		driver.close();		
	}
	

}
