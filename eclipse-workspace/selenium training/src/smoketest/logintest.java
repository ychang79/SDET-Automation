package smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintest {

	@Test  //testng annotation
	public void userlogin() {
		
		System.out.println("running test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		boolean loginEmail = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		boolean PasswordBox = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
		
		Assert.assertTrue(loginEmail, "login youngy credential checked");
		Assert.assertFalse(!PasswordBox);
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("starting prestepp");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("closing browser");
	}
}
