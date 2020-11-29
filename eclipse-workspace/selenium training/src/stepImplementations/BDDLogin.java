package stepImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDLogin {
	

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		//open web driver
		//navigate to login page
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}
	
	@When("^user enter correct username and password$")
	public void  user_enter_correct_username_and_password() {
		//driver.findElement(By.id("MainContent_txtUserName")).sendKeys("ep@testemail.com");
		//driver.findElement(By.id("MainContent_txtPassword")).sendKeys("ep1password");
		//driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	
	@Then("^user gets confirmation$")
	public void user_gets_confirmation() {
		
	}
}
